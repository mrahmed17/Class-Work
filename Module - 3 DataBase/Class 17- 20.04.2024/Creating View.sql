--1. Display job ID of jobs that were done by more than 3 employees for more than 100 days.

CREATE VIEW view_emp_100_days
AS 
SELECT DISTINCT (job_id)
FROM employees
WHERE current_date - hire_date > 100
GROUP BY job_id
having COUNT (employee_id) > 3;

--to view created view point
SELECT * FROM view_emp_100_days;

--create 2nd view as a practice
create VIEW emp_view AS 
   SELECT employee_id,last_name, salary*12 annual_salary
   FROM employees 
   WHERE department_id = 20;
   
--to view created view point
select * from emp_view;