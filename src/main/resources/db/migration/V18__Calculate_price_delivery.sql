ALTER TABLE packages
ADD COLUMN delivery_price float;


update packages set delivery_price=0.0;