CREATE TABLE donation (
    id serial PRIMARY KEY,
    currency VARCHAR(45) NOT NULL,
    value numeric(8,2) not null,
    user_id Integer NOT NULL
);

ALTER TABLE donation
    ADD CONSTRAINT fk_user_donation FOREIGN KEY (user_id) REFERENCES users (id);