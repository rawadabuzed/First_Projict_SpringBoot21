DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customer_order;

CREATE TABLE customer(
    id int NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL DEFAULT '',
    last_name VARCHAR(255) NOT NULL DEFAULT '',
    email VARCHAR(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address VARCHAR(255) NOT NULL DEFAULT '',
--    joining_date DATE,
    PRIMARY KEY(id)
);


CREATE TABLE customer_order(
    id int NOT NULL AUTO_INCREMENT,
    item_name VARCHAR(255) NOT NULL DEFAULT '',
    price DECIMAL(100,2) NOT NULL DEFAULT '',
    customer_id int NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

INSERT INTO customer (first_name,last_name,email,age,address)
VALUES ('Tom','Sawyer','ts@mail.com','18','masada'),
        ('Lara','Croft','lc@mail.com','20','majdalShams'),
        ('Harry','Potter','hp@mail.com','30','telAviv'),
        ('John','Wick','jw@mail.com','24','shmona'),
        ('Harry','Potter','hp@mail.com','50','hifa');