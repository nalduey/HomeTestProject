package com.sealed.parkinglot.mapper;


import com.sealed.parkinglot.dto.SpotControlDto;
import com.sealed.parkinglot.model.SpotControl;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VehicleParkingMapper {
    VehicleParkingMapper INSTANCE = Mappers.getMapper(VehicleParkingMapper.class);

    @Mapping(target = "parkingLotDescription", source = "parkingLotRow.description")
    SpotControlDto spotControlModelToDto(SpotControl sc);

}
