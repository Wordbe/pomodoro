DROP TABLE IF EXISTS todo;

CREATE TABLE todo
(
    id          bigint NOT NULL AUTO_INCREMENT,
    title       varchar(100),
    description varchar,
    primary key (id)
);