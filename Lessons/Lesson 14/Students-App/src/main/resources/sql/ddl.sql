CREATE TABLE students
(
    id            serial primary key,
    name          varchar(256) not null,
    average_grade numeric(16, 2),
    created_at    timestamp default now(),
    updated_at    timestamp default now()
);

select  * from students;

alter table students add column graduation_date DATE;

alter table students rename column name to full_name;

comment on table students is 'Store information about university students';
