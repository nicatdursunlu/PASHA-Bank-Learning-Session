SELECT full_name,
       CASE
           WHEN full_name = 'Nijat' THEN 'first'
           WHEN full_name = 'Nijat Dursunlu' THEN 'second'
           ELSE 'other'
           END
FROM students;

SELECT full_name,
       average_grade,
       CASE
           WHEN average_grade > 95 THEN 'A'
           WHEN average_grade > 70 THEN 'B'
           ELSE 'F'
           END AS LETTER_GRADE
FROM students;