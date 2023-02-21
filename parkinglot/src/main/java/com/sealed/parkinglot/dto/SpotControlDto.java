package com.sealed.parkinglot.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotControlDto {

    private Long id;

    private Long parkingLotRowId;

    private String parkingLotDescription;

    private String parkingLotSpotType;

    private String typeOfVehicleParked;

    private String spotSequence;

    private Boolean isVehicleParked;

}
