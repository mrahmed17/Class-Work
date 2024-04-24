--     Adding new rows in a table using "Insert Statement"

--Creating table and insert data from conditions
Create table sales_reps(
id NUMBER (4),
name VARCHAR2(30),
salary NUMBER(8,2),
commission_pct NUMBER(2,2),
CONSTRAINT const_sales_reps_id PRIMARY KEY (id)
);

--Copying Rows from Another Table
INSERT INTO sales_reps(
id,
name,
salary,
commission_pct
)
SELECT employee_id, last_name, salary, commission_pct
FROM employees
WHERE job_id LIKE '%REP%';

--Checking inserted data
select * from sales_reps;


--To see all primary key
select * from user_constraints;



--Changing data in a table
-- UPDATE statement
--UPDATE Statement Syntax/ Updating Rows in a Table

UPDATE sales_reps
SET COMMISSION_PCT = 0.25,
salary=7500
WHERE employee_id = 202;

--undo my change by rollback command
rollback;

--Updating Two Columns with a Subquery
update employees
    set (job_id, salary) = (select job_id, salary
        from employees
        where employee_id = 205)
where employee_id =103;

--Checking inserted data
select * from employees;

--Updating Rows Based on Another Table
UPDATE employees
SET department_id = (SELECT department_id
FROM employees
WHERE employee_id = 100)
WHERE job_id = (SELECT job_id
FROM employees
WHERE employee_id = 200);

--undo my change by rollback command
rollback;

--  Removing rows from a table:

-- DELETE statement
delete from sales_reps
where id=100;

--Deleting Rows Based on Another Table
DELETE FROM employees
WHERE department_id IN
(SELECT department_id
FROM departments
WHERE department_name 
LIKE '%Public%');

--TRUNCATE Statement
TRUNCATE TABLE table_name;

--Database transaction control using COMMIT, ROLLBACK,and SAVEPOINT
