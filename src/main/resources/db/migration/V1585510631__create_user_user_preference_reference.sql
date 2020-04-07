alter table users add column user_preference_id Integer;

ALTER TABLE users
    ADD CONSTRAINT fk_user_user_preference FOREIGN KEY (user_preference_id) REFERENCES user_preference (id);
