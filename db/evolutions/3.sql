# --- !Ups

CREATE TABLE TroveDiscriminator(
    id bigint (20),
    discriminator varchar(255)
);

CREATE TABLE ReleaseDiscriminator (
    id bigint (20),
    release bigint (20) NOT NULL,
    FOREIGN KEY (release) REFERENCES Release(id),
    discriminator bigint (20) NOT NULL,
    FOREIGN KEY (discriminator) REFERENCES TroveDiscriminator(id)
);

# --- !Downs
DROP TABLE TroveDiscriminator;
DROP TABLE ReleaseDiscriminator;

