package com.sealed.parkinglot.controller;

import com.sealed.parkinglot.service.ParkingLotAvailabilityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static com.sealed.parkinglot.constants.InternalRoute.PARKING_LOT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_LOT_IS_FULL;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_AVAILABLE_COUNT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_USED_COUNT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_VEHICLE_TYPE;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(PARKING_LOT)
public class ParkingLotController {


    private final ParkingLotAvailabilityService parkingLotAvailabilityService;

    @GetMapping(value = PARKING_LOT_IS_FULL+"/parking-row-id/{parkingLotRowId}")
    public Boolean isParkingLotFull(@PathVariable("parkingLotRowId") Long parkingLotRowId) {
        log.info("Row Level to consult {}", parkingLotRowId);
        return parkingLotAvailabilityService.isParkingLotFull(parkingLotRowId);
    }

    @GetMapping(value = PARKING_SPOT_AVAILABLE_COUNT+"/parking-row-id/{parkingLotRowId}")
    public Integer getSpotAvailableCount(@PathVariable("parkingLotRowId") Long parkingLotRowId) {
        log.info("Row Level to consult {}", parkingLotRowId);
        return parkingLotAvailabilityService.getParkingSpotAvailable(parkingLotRowId);
    }

    @GetMapping(value = PARKING_SPOT_USED_COUNT+"/parking-row-id/{parkingLotRowId}")
    public Integer getSpotUsedCount(@PathVariable("parkingLotRowId") Long parkingLotRowId) {
        log.info("Row Level to consult {}", parkingLotRowId);
        return parkingLotAvailabilityService.getParkingSpotUsed(parkingLotRowId);
    }

    @GetMapping(value = PARKING_SPOT_USED_COUNT+"/parking-row-id/{parkingLotRowId}"+PARKING_SPOT_VEHICLE_TYPE+"/{vehicle_type}")
    public Integer getSpotAvailableCountByVehicleTypeAllowed(
            @PathVariable("parkingLotRowId") Long parkingLotRowId,
            @PathVariable("vehicle_type") String vehicleType
            ) {
        log.info("Row Level to consult {} and type of vehicle {}", parkingLotRowId, vehicleType);
        return parkingLotAvailabilityService.getParkingSpotUsedByTypeOfVehicleAllowed(parkingLotRowId, vehicleType);
    }

}
