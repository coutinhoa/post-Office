ALTER TABLE packages
RENAME COLUMN sender_country TO sender_country_id;

ALTER TABLE packages
RENAME COLUMN addressee_country TO addressee_country_id;

ALTER TABLE prices
RENAME COLUMN sender_country TO sender_country_id;

ALTER TABLE prices
RENAME COLUMN addressee_country TO addressee_country_id;