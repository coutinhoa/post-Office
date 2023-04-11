create table prices (
    ID int not null PRIMARY KEY,
    PRICE FLOAT,
    SENDER_COUNTRY int references countries,
    ADDRESSEE_COUNTRY int references countries
);


