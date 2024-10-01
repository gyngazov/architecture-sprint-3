create table user (
    id serial primary key,
    login varchar(8) unique not null
);

create table house (
    id serial primary key,
    user_id int references user(id),
    name varchar(16) unique not null
);

create table device_type (
    id serial primary key,
    name varchar(16) unique not null
);

create table device (
    id serial primary key,
    type_id int references device_type(id),
    house_id int references house(id),
    modules_id int references modules(id),
    serial_number varchar(16),
    name varchar(16) unique not null
);

create table modules (
    id serial primary key,
    name varchar(16) unique not null
);

create table telemetry_data (
    id bigserial primary key,
    device_id int references device(id),
    data bytea not null,
    ins timestamp default current_timestamp
);