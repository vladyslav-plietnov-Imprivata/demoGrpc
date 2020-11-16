CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(64)  NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    enabled  BOOLEAN
)