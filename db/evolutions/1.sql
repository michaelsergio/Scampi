# --- !Ups

CREATE TABLE User(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(45) NOT NULL,
    joined date NOT NULL,
    email varchar(255) NOT NULL
);


# --- !Downs

DROP TABLE User;

