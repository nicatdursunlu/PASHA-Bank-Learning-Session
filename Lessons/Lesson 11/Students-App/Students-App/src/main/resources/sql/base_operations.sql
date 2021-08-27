SELECT full_name
FROM students
WHERE average_grade = 97.25;

SELECT full_name
FROM students
WHERE average_grade BETWEEN 95 AND 100;

SELECT *
FROM students
WHERE ID IN (1, 2, 5);

SELECT *
FROM students
WHERE ID = 1
   OR ID = 5;

SELECT *
FROM students
WHERE ID = 5
  AND full_name = 'John Doe';

SELECT *
FROM students
ORDER BY ID DESC ;

SELECT *
FROM students
WHERE full_name LIKE '%oe';

SELECT *
FROM students
WHERE full_name LIKE 'Nijat%';