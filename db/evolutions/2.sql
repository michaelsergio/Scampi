# --- !Ups

CREATE TABLE Release (
  id bigint (20),
--  packageParent bigint(20) NOT NULL,
--  FOREIGN KEY (packageParent) REFERENCES Package(id),
  name varchar(127) NOT NULL,
  version varchar(127) NOT NULL,
  author bigint (20) NOT NULL,
  FOREIGN KEY (author) REFERENCES User(id),
  authorEmail varchar(300) NOT NULL,
  maintainer bigint (20) NOT NULL,
  FOREIGN KEY (maintainer) REFERENCES User(id),
  maintainerEmail varchar(300) NOT NULL,
  summary varchar(127) NOT NULL,

  description text (1200),
  keywords varchar(255),
  requirements varchar(255),
  provides varchar(255),
  obsoletes varchar(255),

  homePage varchar(400),
  downloadUrl varchar(127),
  hidden boolean NOT NULL,

  license text (1200),
  platform text (1200)
);

CREATE TABLE Package (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(127) NOT NULL,
  release bigint(20),
  FOREIGN KEY (release) REFERENCES Release(id),
  admin bigint(20),
  FOREIGN KEY (admin) REFERENCES User(id),
);

ALTER Release ADD packageParent bigint(20) NOT NULL;
ALTER Release ADD FOREIGN KEY (packageParent) REFERENCES Package(id);


CREATE TABLE Journal(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    release bigint(20) NOT NULL,
    FOREIGN KEY (release) REFERENCES Release(id),
    action varchar(255) NOT NULL,
    date date NOT NULL,
    user bigint(20) NOT NULL,
    FOREIGN KEY (user) REFERENCES User(id),
    ip varchar(45) NOT NULL
);

# --- !Downs
DROP TABLE Release;
DROP TABLE Package;
DROP TABLE Journal;

