ALTER TABLE users ADD PRIMARY KEY (id);
ALTER TABLE companies ADD PRIMARY KEY (id);
ALTER TABLE packages ADD PRIMARY KEY (id);
ALTER TABLE countries ADD PRIMARY KEY (id);

alter table packages
add column sender_id int
references users;

alter table packages
add column addressee_id int
references users;
