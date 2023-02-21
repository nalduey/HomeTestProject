CREATE TABLE IF NOT EXISTS parking_lot_row
(
    id                  BIGSERIAL PRIMARY KEY,
    description         VARCHAR(50),
    is_deleted          BOOLEAN               DEFAULT false,
    created_date        TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    last_modified_date  TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    created_by          VARCHAR(100)          DEFAULT NULL,
    updated_by          VARCHAR(100)          DEFAULT NULL
    );

CREATE TABLE IF NOT EXISTS spot_control
(
    id                 BIGSERIAL PRIMARY KEY,
    parking_lot_row_id INT NOT NULL,
    parking_lot_spot_type VARCHAR(10) NOT NULL, -- MOTO, CAR, VAN
    type_of_vehicle_parked VARCHAR(10), -- MOTO, CAR, VAN
    spot_sequence       INT NOT NULL,
    is_vehicle_parked  BOOLEAN               DEFAULT false,
    is_deleted         BOOLEAN               DEFAULT false,
    created_date       TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    last_modified_date TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    created_by         VARCHAR(100)          DEFAULT NULL,
    updated_by         VARCHAR(100)          DEFAULT NULL,
    CONSTRAINT parking_lot_row_id_fk FOREIGN KEY (parking_lot_row_id) REFERENCES parking_lot_row (id)
);

CREATE TABLE IF NOT EXISTS spot_control_activity
(
    id                     BIGSERIAL PRIMARY KEY,
    spot_control_id        INT NOT NULL,
    type_of_vehicle_parked VARCHAR(10) NOT NULL, -- MOTO, CAR, VAN
    type_of_activity   VARCHAR(20) NOT NULL, -- GetIn / GetOut
    is_deleted         BOOLEAN               DEFAULT false,
    created_date       TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    last_modified_date TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    created_by         VARCHAR(100)          DEFAULT NULL,
    updated_by         VARCHAR(100)          DEFAULT NULL,
    CONSTRAINT spot_control_id_fk FOREIGN KEY (spot_control_id) REFERENCES spot_control (id)
);

