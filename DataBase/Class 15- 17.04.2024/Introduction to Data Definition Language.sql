--Creating a Table Using a Subquery

CREATE TABLE dept80
AS 
SELECT employee_id, last_name, 
salary*12 ANNSAL, 
hire_date
FROM employees
WHERE department_id = 80;

desc dept80;

select * from dept80;

--ALTER TABLE Statement

alter table dept80
add
salary NUMBER(8,2);

alter table dept80
MODIFY
salary varchar(8,2);

alter table dept80
drop
salary varchar(8,2);