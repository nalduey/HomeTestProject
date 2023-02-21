package com.sealed.parkinglot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serial;

@Entity
@Table(name = "spot_control")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@SuperBuilder
public class SpotControl extends BaseModel implements Comparable<SpotControl> {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parking_lot_row_id", insertable = false, updatable = false)
    @JsonIgnore
    @ToString.Exclude
    private ParkingLotRow parkingLotRow;

    @Column(name = "parking_lot_row_id")
    private Long parkingLotRowId;

    @Column(name="parking_lot_spot_type")
    private String parkingLotSpotType;

    @Column(name="type_of_vehicle_parked")
    private String typeOfVehicleParked;

    @Column(name="spot_sequence")
    private Long spotSequence;

    @Column(name="is_vehicle_parked")
    private Boolean isVehicleParked;

    @Override
    public int compareTo(SpotControl o) {
        return this.getSpotSequence().compareTo(o.spotSequence);
    }
}
