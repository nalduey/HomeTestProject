-- Sealed Parking Lot Api Postgres DB
CREATE USER parking_lot_api WITH PASSWORD 'local' CREATEDB;
CREATE DATABASE sealed_parking_lot_db
    WITH
    OWNER = parking_lot_api
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
GRANT ALL PRIVILEGES ON DATABASE sealed_parking_lot_db TO parking_lot_api;