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
@Table(name = "spot_control_activity")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@SuperBuilder
public class SpotControlActivity extends BaseModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "spot_control_id")
    @JsonIgnore
    @ToString.Exclude
    private SpotControl spotControl;

    @Column(name="type_of_vehicle_parked")
    private String typeOfVehicleParked;

    @Column(name="type_of_activity")
    private String typeOfActivity;

}
