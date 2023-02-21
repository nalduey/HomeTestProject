package com.sealed.parkinglot.controller;

import com.sealed.parkinglot.dto.SpotControlDto;
import com.sealed.parkinglot.service.ParkingLotAvailabilityService;
import com.sealed.parkinglot.service.VehicleParkingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.sealed.parkinglot.constants.InternalRoute.PARKING_LOT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_LOT_IS_FULL;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_AVAILABLE_COUNT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_PARK_IN;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_PARK_OUT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_USED_COUNT;
import static com.sealed.parkinglot.constants.InternalRoute.PARKING_SPOT_VEHICLE_TYPE;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(PARKING_LOT)
public class VehicleParkingController {


    private final VehicleParkingService vehicleParkingService;

    @PutMapping(value = PARKING_SPOT_PARK_IN+"/parking-row-id/{parkingLotRowId}/vehicle_type/{vehicle_type}")
    public List<SpotControlDto> takeInVehicleToPark(@PathVariable("parkingLotRowId") Long parkingLotRowId,
                                                    @PathVariable("vehicle_type") String vehicleType) throws Exception{
        log.info("Row Level to Park In {} and Vehicle Type {} is trying to take in parking", parkingLotRowId, vehicleType);
        return vehicleParkingService.takeInVehicleParking(parkingLotRowId, vehicleType);
    }

    @DeleteMapping(value = PARKING_SPOT_PARK_OUT+"/parking-row-id/{parkingLotRowId}/vehicle_type/{vehicle_type}")
    public List<SpotControlDto> takeOutVehicleOfPark(@PathVariable("parkingLotRowId") Long parkingLotRowId,
                                                    @PathVariable("vehicle_type") String vehicleType) throws Exception{
        log.info("Row Level to Park In {} and Vehicle Type {} is trying to take out parking", parkingLotRowId, vehicleType);
        return vehicleParkingService.takeOutVehicleParking(parkingLotRowId, vehicleType);
    }

}
