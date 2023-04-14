create table packages (
    ID serial PRIMARY KEY,
    WEIGHT FLOAT not null,
    DELIVERY_DATE TIMESTAMP not null
);