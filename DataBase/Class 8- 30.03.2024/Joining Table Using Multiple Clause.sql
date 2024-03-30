--Obtaining Data from Multiple Tables
describe jobs;

--Joining Tables Using SQL
SELECT employee_id, first_name, job_id, job_title
from employees
NATURAL JOIN jobs;

--Joining Tables Using Natural Join Function
SELECT employees.first_name, employees.last_name, employees.employee_id, jobs.job_title
from employees
NATURAL JOIN jobs;

--Joining Tables Using Function
SELECT employee_id, last_name, 
location_id, department_id
FROM employees JOIN departments
USING (department_id);

--Task 1: Employees Id and Department Id
select employees.employee_id, employees.department_id
FROM employees
NATURAL JOIN jobs;


--Task 2: first name and Department name
select first_name, department_name
FROM employees
NATURAL JOIN departments;

--Multiple Table Joining - Class Test
select first_name, department_name, job_title, city, country_name
FROM employees
NATURAL JOIN departments
natural join jobs
NATURAL JOIN locations
NATURAL JOIN countries;

--Practice
select first_name, last_name, department_name, 
department_id, job_title, city, STATE_PROVINCE, country_name, REGION_NAME
FROM employees
NATURAL JOIN departments
natural join jobs
NATURAL JOIN countries
NATURAL JOIN locations
NATURAL JOIN emp_details_view;

----Joining Tables Using Function
select employee_id, last_name, salary, department_id, location_id
  FROM employees join departments
  using (department_id);

--Practice  
select employee_id, last_name, salary, department_id, location_id
FROM employees join departments
using (department_id);

--Practice: Using Tbale Aliases eith using Clause
Select l.city, d.department_name
from locations l join departments d
using (location_id)
where location_id=1400;

select l.city, d.department_name
from locations l join departments d
using (location_id)
where location_id=1400;

Select first_name, d.department_name, d.manager_id
from employees e join departments d
using (department_id)
where department_id=50;