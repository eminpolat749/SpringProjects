CREATE TABLE customers (
    username VARCHAR PRIMARY KEY,
    name VARCHAR(512) NOT NULL,
    register_date DATE NOT NULL,
    active BOOLEAN NOT NULL
);

CREATE TABLE payments (
    payment_id SERIAL PRIMARY KEY,
    quantity DOUBLE PRECISION,
    unit_price NUMERIC(19,2) NOT NULL,
    date_time TIMESTAMP NOT NULL,
    username VARCHAR NOT NULL,
    FOREIGN KEY (username) REFERENCES customers(username)
);

insert into customers (username,name,register_date,active) values ('emin749', 'Emin', '2025-01-08','true');
insert into customers (username,name,register_date,active) values ('mirac0106', 'Miraç', '2025-01-01','true');
insert into customers (username,name,register_date,active) values ('veda1993', 'Veda', '2024-01-01','true');

insert into payments (payment_id,quantity,unit_price,date_time,username) 
values (1, 5, 100, '2024-01-08 18:17:11', 'emin749'); 
insert into payments (payment_id,quantity,unit_price,date_time,username) 
values (2, 10, 500, '2024-01-08 18:18:11', 'mirac0106'); 

select * from customers;
select * from payments; 
