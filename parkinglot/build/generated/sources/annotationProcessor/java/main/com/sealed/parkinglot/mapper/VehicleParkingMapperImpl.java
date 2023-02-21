package com.sealed.parkinglot.mapper;

import com.sealed.parkinglot.dto.SpotControlDto;
import com.sealed.parkinglot.dto.SpotControlDto.SpotControlDtoBuilder;
import com.sealed.parkinglot.model.ParkingLotRow;
import com.sealed.parkinglot.model.SpotControl;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-20T21:17:48-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
public class VehicleParkingMapperImpl implements VehicleParkingMapper {

    @Override
    public SpotControlDto spotControlModelToDto(SpotControl sc) {
        if ( sc == null ) {
            return null;
        }

        SpotControlDtoBuilder spotControlDto = SpotControlDto.builder();

        spotControlDto.parkingLotDescription( scParkingLotRowDescription( sc ) );
        spotControlDto.id( sc.getId() );
        spotControlDto.parkingLotRowId( sc.getParkingLotRowId() );
        spotControlDto.parkingLotSpotType( sc.getParkingLotSpotType() );
        spotControlDto.typeOfVehicleParked( sc.getTypeOfVehicleParked() );
        if ( sc.getSpotSequence() != null ) {
            spotControlDto.spotSequence( String.valueOf( sc.getSpotSequence() ) );
        }
        spotControlDto.isVehicleParked( sc.getIsVehicleParked() );

        return spotControlDto.build();
    }

    private String scParkingLotRowDescription(SpotControl spotControl) {
        if ( spotControl == null ) {
            return null;
        }
        ParkingLotRow parkingLotRow = spotControl.getParkingLotRow();
        if ( parkingLotRow == null ) {
            return null;
        }
        String description = parkingLotRow.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }
}
