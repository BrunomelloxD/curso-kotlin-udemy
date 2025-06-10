CREATE TABLE customer_roles(
	customer_id int not null,
    role varchar(50),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);