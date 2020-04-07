CREATE TABLE USER_ong (
    id serial PRIMARY KEY,
    user_id Integer NOT NULL,
    ong_id Integer NOT NULL
);

ALTER TABLE user_ong
    ADD CONSTRAINT fk_user_ong FOREIGN KEY (ong_id) REFERENCES ong (id);

ALTER TABLE user_ong
    ADD CONSTRAINT fk_ong_user FOREIGN KEY (user_id) REFERENCES users (id);