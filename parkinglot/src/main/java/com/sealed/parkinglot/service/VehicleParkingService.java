package com.sealed.parkinglot.service;

import com.sealed.parkinglot.dto.SpotControlDto;
import com.sealed.parkinglot.processor.VehicleParkingProcessor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class VehicleParkingService {


    private final VehicleParkingProcessor vehicleParkingProcessor;

    public List<SpotControlDto> takeInVehicleParking(Long parkingLotRowId, String vehicleType) throws Exception {
        List<SpotControlDto> spotControlDtoList = vehicleParkingProcessor.takeInParkingLotSpot(parkingLotRowId, vehicleType);
        if (spotControlDtoList.size() == 0) {
            throw new Exception("Theres no car spot available in this ParkingLot for this type of vehicle "+ vehicleType);
        }
        return spotControlDtoList;
    }

    public List<SpotControlDto> takeOutVehicleParking(Long parkingLotRowId, String vehicleType) throws Exception {
        List<SpotControlDto> spotControlDtoList = vehicleParkingProcessor.takeOutParkingLotSpot(parkingLotRowId, vehicleType);
        if (spotControlDtoList.size() == 0) {
            throw new Exception("Theres no Vehicle parked of the type "+ vehicleType);
        }
        return spotControlDtoList;
    }
}
