CREATE TABLE EMPLOYEES
(
    ID         SERIAL PRIMARY KEY,
    NAME       varchar(255) NOT NULL,
    SURNAME    varchar(255) NOT NULL,
    AGE        numeric(3),
    created_at timestamp default now(),
    updated_at timestamp default now()
);

INSERT INTO EMPLOYEES (NAME, SURNAME, AGE)
values ('Nijat', 'Dursunlu', 22);
INSERT INTO EMPLOYEES (NAME, SURNAME, AGE)
values ('Kanan', 'Huseynli', 21);
INSERT INTO EMPLOYEES (NAME, SURNAME, AGE)
values ('Elgun', 'Jumayev', 23);
INSERT INTO EMPLOYEES (NAME, SURNAME, AGE)
values ('John', 'Doe', 45);
INSERT INTO EMPLOYEES (NAME, SURNAME, AGE)
values ('Sara', 'Don', 50);


SELECT *
FROM EMPLOYEES;

CREATE TABLE EMPLOYEES_CONTACT_DETAILS
(
    ID         SERIAL PRIMARY KEY,
    PHONE      varchar(30),
    EMAIL      varchar(50),
    ADDRESS    varchar(255),
    DEPARTMENT varchar(255),
    created_at timestamp default now(),
    updated_at timestamp default now()
);

INSERT INTO EMPLOYEES_CONTACT_DETAILS (PHONE, EMAIL, ADDRESS, DEPARTMENT)
VALUES ('+994513613025', 'nicat.dursunlu@gmail.com', 'Azerbaijan, Baku, Surakhani district', 'Digital Lab');


INSERT INTO EMPLOYEES_CONTACT_DETAILS (PHONE, EMAIL, ADDRESS, DEPARTMENT)
VALUES ('+994551453289', 'kanan.huseynli@gmail.com', 'Azerbaijan, Sumgait', 'Information Technologies');


INSERT INTO EMPLOYEES_CONTACT_DETAILS (PHONE, EMAIL, ADDRESS, DEPARTMENT)
VALUES ('+994702543612', 'elgun.jumayev@gmail.com', 'Azerbaijan, Gakh', 'Game Development');


INSERT INTO EMPLOYEES_CONTACT_DETAILS (PHONE, EMAIL, ADDRESS, DEPARTMENT)
VALUES ('+5245621571818', 'john.doe@gmail.com', 'United State', 'Human Resources');

SELECT *
FROM EMPLOYEES_CONTACT_DETAILS;