alter table packages
add column sender_country int
references countries;

alter table packages
add column addressee_country int
references countries;
