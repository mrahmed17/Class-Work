--CREATE SEQUENCE Statement: Syntax
CREATE SEQUENCE [ schema. ] sequence
[ { INCREMENT BY | START WITH } integer
| { MAXVALUE integer | NOMAXVALUE }
| { MINVALUE integer | NOMINVALUE }
| { CYCLE | NOCYCLE }
| { CACHE integer | NOCACHE }
| { ORDER | NOORDER }
];


--Creating a Sequence
CREATE SEQUENCE sales_reps_id
INCREMENT BY 1
START WITH 100
MAXVALUE 99999
NOCACHE
NOCYCLE;

--Using a Sequence
SELECT  sales_reps_id.nextval
FROM dual;

--Insert data into sales_reps
INSERT INTO sales_reps
    VALUES  (sales_reps_id.nextval,
            'Raju', 40000,0.02);

select * from sales_reps;



--Creating a Student Sequence
CREATE SEQUENCE student_id
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;

--Creating a Student Table
create TABLE student(
id number(5) default student_id.nextval constraint sys_studnet_id primary key,
name varchar2(30) not null,
email varchar2(60) not null constraint student_email_unique unique
);


--Insert data into Student Table
insert into student
values (default, 'Raju', 'raju@gmail.com');

insert into student
values (default, 'Najmul', 'najmul@gmail.com');

insert into student
values (default, 'Mustafa', 'mustafa@gmail.com');

insert into student
values (default, 'Sanaullah', 'sanaullah@gmail.com');

insert into student
values (default, 'Nusrat', 'nusrat@gmail.com');

insert into student
values (default, 'Kutub', 'kutub@gmail.com');

insert into student
values (default, 'Rabiul', 'rabiul@gmail.com');

insert into student
values (default, 'Nayamul', 'nayamul@gmail.com');

insert into student
values (default, 'Nirjash', 'nirjash@gmail.com');

insert into student
values (default, 'Rafiqul', 'rafiqul@gmail.com');

insert into student
values (default, 'Touhid', 'touhid@gmail.com');

insert into student
values (default, 'Nusu', 'nusu@gmail.com');

insert into student
values (default, 'Hasan', 'hasan@gmail.com');

insert into student
values (default, 'Shamima', 'shamima@gmail.com');

insert into student
values (default, 'Shabab', 'shabab@gmail.com');

--Check inputed data from Student
SELECT * FROM student;

DROP SEQUENCE sales_reps_id;

DROP SEQUENCE student_id;