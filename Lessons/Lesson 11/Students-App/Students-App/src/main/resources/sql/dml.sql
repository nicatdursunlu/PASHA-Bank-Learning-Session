insert into students (full_name, average_grade)
values ('Nijat Dursunlu', 95.21);
insert into students (full_name, average_grade)
values ('Kanan Huseyli', 97.25);
insert into students (full_name, average_grade)
values ('Elgun Jumayev', 92.15);
insert into students (full_name, average_grade)
values ('Rashad Aliyev', 80.25);


update students
set full_name = 'Huseyn Abdullabeyli'
where full_name = 'Nijat Dursunlu';

update students
set full_name = 'Nijat Dursunlu'
where id = 1;

select *
from students;