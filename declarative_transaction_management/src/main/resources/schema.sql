-- See https://www.tutorialspoint.com/spring/programmatic_management.htm for the original version for MySQL
-- Adapted for Postgresql

DROP TABLE IF EXISTS student CASCADE;
DROP TABLE IF EXISTS marks CASCADE;

CREATE TABLE student (
  id              SERIAL PRIMARY KEY,
  name           VARCHAR(20) NOT NULL,
  age integer  NOT NULL
);

CREATE TABLE marks(
   sid INT NOT NULL,
   marks  INT NOT NULL,
   year   INT NOT NULL
);