package com.sealed.parkinglot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import javax.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "parking_lot_row")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@SuperBuilder
public class ParkingLotRow extends BaseModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

}
