package com.sealed.parkinglot.processor;


import com.sealed.parkinglot.repository.SpotControlRepository;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class ParkingLotAvailabilityProcessor {


    private final SpotControlRepository spotControlRepository;


    public Boolean isParkingLotSpotsFull(Long parkingLotRowId) {
        return getParkingSpotCountByAvailability(parkingLotRowId, Boolean.FALSE) == 0;
    }

    public Integer getParkingSpotCountByAvailability(Long parkingLotRowId, Boolean isVehicleParked) {
        return spotControlRepository.findByParkingLotRowIdAndIsVehicleParked(parkingLotRowId, isVehicleParked).size();
    }

    public Integer getParkingSpotCountByAvailabilityAndTypeOfVehicleAllowed(Long parkingLotRowId, String typeOfVehicle, Boolean isVehicleParked) {
        return spotControlRepository.findByParkingLotRowIdAndAndParkingLotSpotTypeAndIsVehicleParked(parkingLotRowId, typeOfVehicle, isVehicleParked).size();
    }

}
