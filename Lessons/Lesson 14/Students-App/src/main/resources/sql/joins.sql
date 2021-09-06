CREATE TABLE DEPARTMENTS
(
    ID         SERIAL PRIMARY KEY,
    NAME       varchar(256) NOT NULL,
    FACULTY    text         NOT NULL,
    CREATED_AT timestamp DEFAULT now(),
    UPDATED_AT timestamp DEFAULT now()
);

INSERT INTO DEPARTMENTS (NAME, FACULTY)
VALUES ('Computer Science', 'Engineering');
INSERT INTO DEPARTMENTS (NAME, FACULTY)
VALUES ('Electrical Engineering', 'Engineering');

ALTER TABLE students
    ADD COLUMN DEP_ID BIGINT REFERENCES DEPARTMENTS (ID);

SELECT *
FROM DEPARTMENTS;

SELECT *
FROM students;

SELECT S.full_name, D.NAME
FROM students S,
     DEPARTMENTS D
WHERE S.DEP_ID = D.id;

SELECT S.full_name, S.average_grade, D.FACULTY, D.NAME
FROM students S
         INNER JOIN departments d on d.id = S.dep_id;

SELECT S.ID, S.full_name, S.average_grade, D.FACULTY, D.NAME
FROM students S
         LEFT JOIN departments d on d.id = S.dep_id;

SELECT S.full_name, S.average_grade, D.FACULTY, D.NAME
FROM students S
         RIGHT JOIN departments d on d.id = S.dep_id;

SELECT S.full_name, S.average_grade, D.FACULTY, D.NAME
FROM students S
         FULL JOIN departments d on d.id = S.dep_id;

SELECT S.full_name, S.average_grade, D.FACULTY, D.NAME
FROM students S
         CROSS JOIN departments d;

SELECT *
FROM students
WHERE dep_id > ANY (SELECT ID FROM DEPARTMENTS);

SELECT *
FROM students
WHERE ID > ALL (SELECT ID FROM DEPARTMENTS);


SELECT S.ID, S.full_name, D.NAME
FROM students S,
     DEPARTMENTS D
WHERE D.ID = 2
  AND S.DEP_ID = D.ID;








