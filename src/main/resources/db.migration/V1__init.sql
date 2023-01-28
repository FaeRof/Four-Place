CREATE TABLE IF NOT EXISTS "users"
(
    "id"         SERIAL PRIMARY KEY NOT NULL,
    "username"       varchar(100),
    "surname"    varchar(100),
    "birth_date" date,
    "phone"      varchar(20),
    "email"      varchar(100),
    "password"   varchar(30)
);