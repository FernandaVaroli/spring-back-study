CREATE TABLE USER_PREFERENCE (
    id bigserial PRIMARY KEY,
    currency VARCHAR(45) NOT NULL,
    user_id Integer NOT NULL
);

ALTER TABLE user_preference
    ADD CONSTRAINT fk_user_preference_user FOREIGN KEY (user_id) REFERENCES users (id);
