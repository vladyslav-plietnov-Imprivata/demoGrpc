CREATE TABLE user_authorities
(
    id       SERIAL PRIMARY KEY,
    user_id  INTEGER NOT NULL,
    authority VARCHAR(32) NOT NULL
)