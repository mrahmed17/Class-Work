--Creating Joins with the ON Clause
SELECT e.employee_id, e.last_name, e.department_id, 
d.department_id, d.location_id
FROM employees e JOIN departments d
ON (e.department_id = d.department_id);

--Creating Three-Way Joins
SELECT employee_id, city, department_name
FROM employees e 
JOIN departments d
ON d.department_id = e.department_id 
JOIN locations l
ON d.location_id = l.location_id --Here, Bracket is not mandatory
where city='Oxford'
order by 2, 3;

--Task 1: Retrive First Name, Last name, salary wether the city is Oxford.
Select first_name, last_name, salary
FROM employees e 
JOIN departments d
ON d.department_id = e.department_id 
JOIN locations l
ON d.location_id = l.location_id --Here, Bracket is not mandatory
where city='Oxford'
order by 1;

--Task 2: Display job title, department name, employee last name, starting date for all jobs from 2000 to 2005
--Condition- query by hire date
Select job_title, department_name, last_name, hire_date
FROM employees e
JOIN departments d
ON d.department_id = e.department_id 
JOIN jobs j
ON e.job_id = j.job_id
WHERE TO_char(hire_date, 'fmYYYY') BETWEEN 2000 and 2005
order by 4;

--Alternative Answer
--Condition- query by hire date
Select job_title, department_name, last_name, start_date
FROM employees e
JOIN departments d
ON d.department_id = e.department_id
JOIN jobs j
ON e.job_id = j.job_id
join job_history h
on e.employee_id = h.employee_id
where hire_date between '1-JAN-00' and'31-dec-05'
--WHERE TO_char(h.start_date, 'YYYY') BETWEEN 2000 and 2005
order by 3;
