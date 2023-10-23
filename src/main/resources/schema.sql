CREATE TABLE customer (id SERIAL PRIMARY KEY, first_name VARCHAR(255), last_name VARCHAR(255));
CREATE TABLE park (id SERIAL PRIMARY KEY, url VARCHAR(255), fullName VARCHAR(255), parkCode VARCHAR(255)
description VARCHAR(255), latitude VARCHAR(255), longitude VARCHAR(255) )