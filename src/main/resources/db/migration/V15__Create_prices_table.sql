create table prices (
    ID serial PRIMARY KEY,
    PRICE FLOAT,
    SENDER_COUNTRY int references countries,
    ADDRESSEE_COUNTRY int references countries
);


