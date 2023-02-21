package com.sealed.parkinglot.processor;


import com.sealed.parkinglot.constants.TypeOfActivitiesConstants;
import com.sealed.parkinglot.dto.SpotControlDto;
import com.sealed.parkinglot.mapper.VehicleParkingMapper;
import com.sealed.parkinglot.model.SpotControl;
import com.sealed.parkinglot.model.SpotControlActivity;
import com.sealed.parkinglot.repository.SpotControlActivityRepository;
import com.sealed.parkinglot.repository.SpotControlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sealed.parkinglot.constants.VehicleTypeConstants.VEHICLE_CAR;
import static com.sealed.parkinglot.constants.VehicleTypeConstants.VEHICLE_MOTOR;
import static com.sealed.parkinglot.constants.VehicleTypeConstants.VEHICLE_VAN;


@Slf4j
@Component
@RequiredArgsConstructor
public class VehicleParkingProcessor {

    private final SpotControlRepository spotControlRepository;
    private final SpotControlActivityRepository spotControlActivityRepository;
    private static final VehicleParkingMapper mapper = VehicleParkingMapper.INSTANCE;

    public List<SpotControlDto> takeInParkingLotSpot(Long parkingLotRowId, String vehicleType) {
        List<SpotControlDto> spotControlDtoList = new ArrayList<>();
        List<SpotControl> spotControlList = spotControlRepository.findByParkingLotRowIdAndIsVehicleParked(parkingLotRowId, Boolean.FALSE);
        Collections.sort(spotControlList);
        for (int i = 0; i < spotControlList.size(); i++) {
            SpotControl spotControl = spotControlList.get(i);
            if (isVehicleTypeAllowed(spotControl.getParkingLotSpotType(), vehicleType)) {
                spotControlDtoList.add(saveParkingTransaction(spotControl, Boolean.TRUE, vehicleType));
                break;
            }
        }

        if (VEHICLE_VAN.equals(vehicleType) && spotControlDtoList.size() == 0) {
            for (int i = 0; i < spotControlList.size(); i++) {
                SpotControl spotControl = spotControlList.get(i);
                if (VEHICLE_CAR.equals(spotControl.getParkingLotSpotType())
                        && i > 0
                        && i + 1 < spotControlList.size()) {
                    SpotControl spotControlPreviews = spotControlList.get(i - 1);
                    SpotControl spotControlAfter = spotControlList.get(i + 1);
                    if (spotControlPreviews.getSpotSequence() + 1 == spotControl.getSpotSequence()
                            && spotControlAfter.getSpotSequence() - 1 == spotControl.getSpotSequence()
                            && VEHICLE_CAR.equals(spotControlPreviews.getParkingLotSpotType())
                            && VEHICLE_CAR.equals(spotControlAfter.getParkingLotSpotType())
                    ) {
                        spotControlDtoList.add(saveParkingTransaction(spotControlPreviews, Boolean.TRUE, VEHICLE_VAN));
                        spotControlDtoList.add(saveParkingTransaction(spotControl, Boolean.TRUE, VEHICLE_VAN));
                        spotControlDtoList.add(saveParkingTransaction(spotControlAfter, Boolean.TRUE, VEHICLE_VAN));
                        break;
                    }
                }
            }
        }
        return spotControlDtoList;
    }

    public List<SpotControlDto> takeOutParkingLotSpot(Long parkingLotRowId, String vehicleType) {
        List<SpotControlDto> spotControlDtoList = new ArrayList<>();
        List<SpotControl> spotControlList = spotControlRepository.findByParkingLotRowIdAndIsVehicleParked(parkingLotRowId, Boolean.TRUE);
        Collections.sort(spotControlList);
        for (int i = 0; i < spotControlList.size(); i++) {
            SpotControl spotControl = spotControlList.get(i);
            if (VEHICLE_VAN.equals(vehicleType)
                    && VEHICLE_VAN.equals(spotControl.getTypeOfVehicleParked())
                    && !VEHICLE_VAN.equals(spotControl.getParkingLotSpotType())
            ) {
                SpotControl spotControlAfter1 = spotControlList.get(i + 1);
                SpotControl spotControlAfter2 = spotControlList.get(i + 2);
                spotControlDtoList.add(saveParkingTransaction(spotControl, Boolean.FALSE, VEHICLE_VAN));
                spotControlDtoList.add(saveParkingTransaction(spotControlAfter1, Boolean.FALSE, VEHICLE_VAN));
                spotControlDtoList.add(saveParkingTransaction(spotControlAfter2, Boolean.FALSE, VEHICLE_VAN));
                break;
            }
            if (spotControl.getTypeOfVehicleParked().equals(vehicleType)) {
                spotControlDtoList.add(saveParkingTransaction(spotControl, Boolean.FALSE, vehicleType));
                break;
            }
        }
        return spotControlDtoList;
    }


    private SpotControlDto saveParkingTransaction(SpotControl spotControl, Boolean isParked, String vehicleType) {
        spotControl.setIsVehicleParked(isParked);
        spotControl.setTypeOfVehicleParked(isParked ? vehicleType : null);
        spotControlRepository.save(spotControl);
        SpotControlActivity spotControlActivity = SpotControlActivity.builder().
                spotControl(spotControl).
                typeOfActivity((isParked) ? TypeOfActivitiesConstants.VEHICLE_TAKE_IN_PARKING : TypeOfActivitiesConstants.VEHICLE_TAKE_OUT_PARKING).
                typeOfVehicleParked(vehicleType).build();
        spotControlActivityRepository.save(spotControlActivity);
        return mapper.spotControlModelToDto(spotControl);
    }

    private Boolean isVehicleTypeAllowed(String vehicleTypeSpot, String vehicleType) {
        Boolean result = false;
        if (vehicleTypeSpot.equals(vehicleType) || VEHICLE_MOTOR.equals(vehicleType))
            result = true;
        else if (VEHICLE_VAN.equals(vehicleTypeSpot) && VEHICLE_CAR.equals(vehicleType)) {
            result = true;
        }
        return result;
    }


}
