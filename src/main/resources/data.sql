DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customer_order;

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL DEFAULT '',
    last_name VARCHAR(255) NOT NULL DEFAULT '',
    email VARCHAR(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address VARCHAR(255) NOT NULL DEFAULT '',
--    joining_date DATE,
    PRIMARY KEY(id)
);

CREATE TABLE polls(
    id int NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL DEFAULT '',
    option1 VARCHAR(255) NOT NULL DEFAULT '',
    option2 VARCHAR(255) NOT NULL DEFAULT '',
    option3 VARCHAR(255) NOT NULL DEFAULT '',
    option4 VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY(id)
);

CREATE TABLE users_poll(
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    poll_id int NOT NULL,
    answers VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (poll_id) REFERENCES polls(id)

);

