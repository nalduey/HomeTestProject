package com.sealed.parkinglot.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InternalRoute {

    public static final String PARKING_LOT = "/api/v1/sealed/parking-lot";
    public static final String PARKING_LOT_IS_FULL = "/is-full";
    public static final String PARKING_SPOT_AVAILABLE_COUNT = "/spot_available_count";
    public static final String PARKING_SPOT_USED_COUNT = "/spot_used_count";
    public static final String PARKING_SPOT_VEHICLE_TYPE = "/vehicle_type";
    public static final String PARKING_SPOT_PARK_IN = "/take_in";
    public static final String PARKING_SPOT_PARK_OUT = "/take_out";

}
