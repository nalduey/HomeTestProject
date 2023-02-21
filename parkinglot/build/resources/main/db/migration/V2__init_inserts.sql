INSERT INTO public.parking_lot_row (id, description, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (1, 'Level 1', false, '2023-02-19 19:45:26.595378 +00:00', '2023-02-19 19:45:26.595378 +00:00', null, null);
INSERT INTO public.parking_lot_row (id, description, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (2, 'Level 2', false, '2023-02-19 19:45:26.595378 +00:00', '2023-02-19 19:45:26.595378 +00:00', null, null);
INSERT INTO public.parking_lot_row (id, description, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (3, 'Level 3', false, '2023-02-19 19:45:26.595378 +00:00', '2023-02-19 19:45:26.595378 +00:00', null, null);
ALTER SEQUENCE parking_lot_row_id_seq RESTART WITH 4;

INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (1, 1, 'MOTO', null, 1, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (2, 1, 'MOTO', null, 2, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (3, 1, 'CAR', null, 3, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (4, 1, 'CAR', null, 4, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (5, 1, 'CAR', null, 5, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (6, 1, 'CAR', null, 6, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (7, 1, 'CAR', null, 7, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (8, 1, 'CAR', null, 8, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (9, 1, 'VAN', null, 9, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (10, 1, 'VAN', null, 10, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (11, 2, 'MOTO', null, 1, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (12, 2, 'MOTO', null, 2, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (13, 2, 'CAR', null, 3, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (14, 2, 'CAR', null, 4, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (15, 2, 'CAR', null, 5, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (16, 2, 'CAR', null, 6, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (17, 2, 'CAR', null, 7, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (18, 2, 'CAR', null, 8, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (19, 2, 'VAN', null, 9, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (20, 2, 'VAN', null, 10, false, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (21, 3, 'MOTO', 'MOTO', 1, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (22, 3, 'MOTO', 'MOTO', 2, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (23, 3, 'CAR', 'CAR', 3, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (24, 3, 'CAR', 'CAR', 4, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (25, 3, 'CAR', 'CAR', 5, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (26, 3, 'CAR', 'CAR', 6, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (27, 3, 'CAR', 'CAR', 7, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (28, 3, 'CAR', 'CAR', 8, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (29, 3, 'VAN', 'VAN', 9, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
INSERT INTO public.spot_control (id, parking_lot_row_id, parking_lot_spot_type, type_of_vehicle_parked, spot_sequence, is_vehicle_parked, is_deleted, created_date, last_modified_date, created_by, updated_by) VALUES (30, 3, 'VAN', 'VAN', 10, true, false, '2023-02-19 19:55:32.238699 +00:00', '2023-02-19 19:55:32.238699 +00:00', null, null);
ALTER SEQUENCE spot_control_id_seq RESTART WITH 31;
