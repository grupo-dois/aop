DROP TABLE IF EXISTS tutorials;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT PRIMARY KEY NOT NULL UNIQUE,
    email VARCHAR(250),
    first_name VARCHAR(250),
    last_name VARCHAR(250),
    password VARCHAR(250),
    role VARCHAR(250)
);
