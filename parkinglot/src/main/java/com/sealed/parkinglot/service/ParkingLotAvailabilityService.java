package com.sealed.parkinglot.service;


import com.sealed.parkinglot.processor.ParkingLotAvailabilityProcessor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ParkingLotAvailabilityService {


    private final ParkingLotAvailabilityProcessor parkingLotAvailabilityProcessor;

    public Boolean isParkingLotFull(Long isParkingLotRowId) {
        return parkingLotAvailabilityProcessor.isParkingLotSpotsFull(isParkingLotRowId);
    }

    public Integer getParkingSpotAvailable(Long parkingLotRowId) {
        return parkingLotAvailabilityProcessor.getParkingSpotCountByAvailability(parkingLotRowId, Boolean.FALSE);
    }

    public Integer getParkingSpotUsed(Long parkingLotRowId) {
        return parkingLotAvailabilityProcessor.getParkingSpotCountByAvailability(parkingLotRowId, Boolean.TRUE);
    }

    public Integer getParkingSpotUsedByTypeOfVehicleAllowed(Long parkingLotRowId, String vehicleType) {
        return parkingLotAvailabilityProcessor.getParkingSpotCountByAvailabilityAndTypeOfVehicleAllowed(parkingLotRowId, vehicleType, Boolean.TRUE);
    }
}
