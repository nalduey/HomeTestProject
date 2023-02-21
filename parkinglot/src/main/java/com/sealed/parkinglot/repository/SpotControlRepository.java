package com.sealed.parkinglot.repository;


import com.sealed.parkinglot.model.SpotControl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SpotControlRepository extends JpaRepository<SpotControl, Long> {

    List<SpotControl> findByParkingLotRowIdAndIsVehicleParked(Long parkingLotRowId, Boolean isVehicleParked);
    List<SpotControl> findByParkingLotRowIdAndAndParkingLotSpotTypeAndIsVehicleParked(Long parkingLotRowId, String parkingLotSpotType, Boolean isVehicleParked);

}
