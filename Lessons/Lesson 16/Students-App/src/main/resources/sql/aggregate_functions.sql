SELECT count(*)
FROM students
WHERE average_grade < 95;

SELECT DISTINCT full_name
FROM students;

INSERT INTO students (full_name, average_grade)
VALUES ('Nijat Dursunlu', 50.75);

SELECT count(DISTINCT full_name)
FROM students
WHERE average_grade < 95;

SELECT avg(average_grade)
FROM students;

SELECT min(average_grade)
FROM students;

SELECT MAX(average_grade)
FROM students;

SELECT sum(average_grade)
FROM students;

SELECT *
FROM students;
