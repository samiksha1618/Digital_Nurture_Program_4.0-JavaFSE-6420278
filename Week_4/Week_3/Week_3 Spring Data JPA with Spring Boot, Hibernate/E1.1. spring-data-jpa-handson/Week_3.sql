CREATE DATABASE ormlearn;
USE ormlearn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

SELECT * FROM country;

INSERT INTO country (co_code, co_name) VALUES ('JP', 'Japan');

SELECT * FROM country;
CREATE DATABASE IF NOT EXISTS ormlearn;
USE ormlearn;

CREATE TABLE IF NOT EXISTS country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

INSERT INTO country (co_code, co_name) VALUES ("IN", "India");

