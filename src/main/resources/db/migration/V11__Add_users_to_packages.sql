alter table packages
add column sender_id int
references users;

alter table packages
add column addressee_id int
references users;
