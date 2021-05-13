create table users
(
    id         serial primary key,
    username   varchar(255) not null unique,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    email      varchar(255) not null unique,
    phone      varchar(20)  not null
);