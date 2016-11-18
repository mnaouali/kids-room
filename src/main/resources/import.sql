INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (1, 'user@softserveinc.com', 'Alan','Bom', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 0, true, true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (2, 'manager@softserveinc.com', 'Jackson','Bim', '$2a$08$B.5vcvm4BiBF9DdPgyKH4.1Z9wOGL9Rv9Iy1sDsniHMOOGXCZ11Je', '0987654321', 1, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (3, 'admin@softserveinc.com', 'Tony','West', '$2a$08$FSd5VkorwWVS7V8XQFl1y..ULY5fcUAASc/.6mH5wFj/ppopK0Cl2', '0987654321', 2, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (6, 'manager1@softserveinc.com', 'Alan','Bom', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 1, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (4, 'parent1@softserveinc.com', 'Mario','Kara', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 0, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (5, 'parent2@softserveinc.com', 'Miron','Tereh', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 0, false,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (7, 'blocked@softserveinc.com', 'Miron','Tereh', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 0, true,false);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (8, 'kidsroomuser@gmail.com', 'Alan','Bom', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0987654321', 0, true, true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (9, 'kidsroommanager@gmail.com', 'Jackson','Bim', '$2a$08$B.5vcvm4BiBF9DdPgyKH4.1Z9wOGL9Rv9Iy1sDsniHMOOGXCZ11Je', '0987654321', 1, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (10, 'kidsroomadm@gmail.com', 'Tony','West', '$2a$08$FSd5VkorwWVS7V8XQFl1y..ULY5fcUAASc/.6mH5wFj/ppopK0Cl2', '0987654321', 2, true,true);
INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (11, 'danon.konon@gmail.com', 'Bohdan','Kononchuk', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '0936202636', 0, true,true);

INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (1, 'he likes to play poker', '2014-02-12', 'Adam', 'First', 1, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (2, 'likes music', '2014-02-12', 'Eva', 'First', 1, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (3, 'likes rock', '2014-02-10', 'Elen', 'First', 1, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (4, 'drink only whiskey', '2014-02-12', 'Sem', 'Sec', 4, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (5, 'drink only whiskey', '2014-02-13', 'Jimbo', 'Third', 5, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (6, 'drink only whiskey', '2014-02-12', 'Jimro', 'Fours', 5, 0);

-- INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (8, 'evangeline_howe_8@softserveinc.com', 'Evangeline', 'Howe', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '5693494215', 0, true, true);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (7, 'Lorem Ipsum', '2013-06-23', 'Rodolfo', 'Howe', 8, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (8, 'Lorem Ipsum', '2011-06-11', 'Terese', 'Howe', 8, 1);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (9, 'Lorem Ipsum', '2010-07-02', 'Emmanuel', 'Howe', 8, 1);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (10, 'Lorem Ipsum', '2011-04-12', 'Tommie', 'Howe', 8, 0);


-- INSERT INTO users (id_user, email, first_name, last_name, password, phone_number, role, confirmed, active) VALUES (9, 'gerardo_stokes_9@softserveinc.com', 'Gerardo', 'Stokes', '$2a$08$6fjMaYthaRD9XpOQ7V652.N/pRpmOqdrRMU5b1otTRveK0T3pYa02', '7739073844', 0, true, true);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (11, 'Lorem Ipsum', '2010-06-22', 'Evangeline', 'Stokes', 9, 1);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (12, 'Lorem Ipsum', '2011-01-08', 'Harland', 'Stokes', 9, 1);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (13, 'Lorem Ipsum', '2010-11-22', 'Barney', 'Stokes', 9, 0);
INSERT INTO children(id_child, comment, date_of_birth_child, first_name_child, last_name_child, id_user, gender)  VALUES (14, 'Lorem Ipsum', '2013-01-20', 'Georgie', 'Stokes', 9, 0);

insert into rooms (id_room, address_room, capacity_room, name_room, phone_room, city_room, active, working_start_hour, working_end_hour) values (1, 'Pasternaka 8', 40, 'Kvitkova', '+380947715038', 'Lviv', true, '07:00', '20:00');
insert into rooms (id_room, address_room, capacity_room, name_room, phone_room, city_room, active, working_start_hour, working_end_hour) values (2, 'Antonycha 22', 15, 'Soniachna', '+380938587190', 'Lviv', true, '07:00', '20:00');
insert into rooms (id_room, address_room, capacity_room, name_room, phone_room, city_room, active, working_start_hour, working_end_hour) values (3, 'Sadova 2a', 30, 'Nebesna', '+380951789603', 'Lviv', true, '07:00', '20:00');
insert into rooms (id_room, address_room, capacity_room, name_room, phone_room, city_room, active, working_start_hour, working_end_hour) values (4, 'Shevchenka 32', 35, 'Velyka', '+380936458634', 'Kyiv', true, '07:00', '20:00');
insert into rooms (id_room, address_room, capacity_room, name_room, phone_room, city_room, active, working_start_hour, working_end_hour) values (5, 'Franka 124', 30, 'Kvitkova', '+380938710134', 'Rivne', true, '08:00', '19:00');

insert into managers (room, manager) values (1, 2);
insert into managers (room, manager) values (1, 9);
insert into managers (room, manager) values (1, 2);
insert into managers (room, manager) values (2, 2);
insert into managers (room, manager) values (2, 9);
insert into managers (room, manager) values (3, 2);
insert into managers (room, manager) values (3, 9);


INSERT INTO rates(id_rate, hour_rate, price_rate, id_room)  VALUES (1, 2, 300, 1);
INSERT INTO rates(id_rate, hour_rate, price_rate, id_room)  VALUES (2, 4, 500, 1);
INSERT INTO rates(id_rate, hour_rate, price_rate, id_room)  VALUES (3, 6, 600, 1);
INSERT INTO rates(id_rate, hour_rate, price_rate, id_room)  VALUES (4, 2, 80, 2);
INSERT INTO rates(id_rate, hour_rate, price_rate, id_room)  VALUES (5, 4, 90, 2);

 insert into events(id_event, age_high, age_low, description, end_time, name, start_time, room) VALUES (1, 3, 5, 'NO', '2016-07-10 14:00:00', 'EVENT1', '2016-07-10 13:45:00', 6);
 insert into events(id_event, age_high, age_low, description, end_time, name, start_time, room) VALUES (2, 3, 5, 'NO', '2016-07-07 20:00:00', 'EVENT2', '2016-07-07 17:45:00', 8);


INSERT into bookings (id_book, booking_start_time, booking_end_time, id_user, id_child, id_room,  booking_state, duration, sum, comment) VALUES (1, '2016-07-17 15:15:00', '2016-07-17 16:30:00', 23, 57, 3, 0, 0, 0,'');
INSERT into bookings (id_book, booking_start_time, booking_end_time, id_user, id_child, id_room,  booking_state, duration, sum, comment) VALUES (2, '2016-05-13 15:00:00', '2016-05-13 16:30:00', 27, 72, 3, 2, 0, 0,'Do not talk to the kid about his favourite cat. The cat has run away and the kid is unhappy abou it');
INSERT into bookings (id_book, booking_start_time, booking_end_time, id_user, id_child, id_room,  booking_state, duration, sum, comment) VALUES (3, '2016-07-27 16:45:00', '2016-07-27 18:30:00', 22, 54, 4, 2, 0, 0,'');
INSERT into bookings (id_book, booking_start_time, booking_end_time, id_user, id_child, id_room,  booking_state, duration, sum, comment) VALUES (27, '2016-05-23 15:30:00', '2016-05-23 16:45:00', 48, 129, 1, 0, 0, 0,'Could you controll that the kid drinks his tea, please');

INSERT into days_off (id_days_off, name, start_date, end_date) VALUES (1, 'Teachers day','2016-10-02', '2016-10-02');
INSERT into days_off (id_days_off, name, start_date, end_date) VALUES (2, 'Day Off','2016-10-03', '2016-10-06');
INSERT into days_off (id_days_off, name, start_date, end_date) VALUES (3, 'Repair works','2016-10-10', '2016-10-12');

INSERT into rooms_off (day_off, room) VALUES (1, 1);
INSERT into rooms_off (day_off, room) VALUES (1, 2);
INSERT into rooms_off (day_off, room) VALUES (1, 3);
INSERT into rooms_off (day_off, room) VALUES (1, 4);
INSERT into rooms_off (day_off, room) VALUES (2, 5);
INSERT into rooms_off (day_off, room) VALUES (2, 4);
INSERT into rooms_off (day_off, room) VALUES (2, 3);
INSERT into rooms_off (day_off, room) VALUES (3, 11);