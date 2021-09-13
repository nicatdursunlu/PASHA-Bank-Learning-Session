BEGIN;
UPDATE students
SET full_name='John Doe'
where id = 5;
savepoint my_save;

update students
set full_name='John'
where id = 4;

update students
set full_name='John'
where id = 103;

rollback to my_save;
commit;

select * from students;