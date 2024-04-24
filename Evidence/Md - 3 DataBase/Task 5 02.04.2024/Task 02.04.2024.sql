select * from jobs;
select * FROM employees;

-- Task 1: Display Details of jobs where the minimum salary is greater than 10000
select * from jobs
where min_salary > 10000;

-- Task 2: Display first name and join date of the employees who is either IT Programmer or Sales Man
select first_name, hire_date
from employees
where job_id='IT_PROG' or job_id='SA_MAN'
order by first_name;

--Task 2: Alternative Solution
select first_name, hire_date
from employees
where job_id in('IT_PROG', 'SA_MAN')
order by first_name;

-- Task 3: Display details of employee with ID 150 or 160
select * from EMPLOYEES
Where employee_id=150 
    or
employee_id=160;

--Task 3: Alternative Solution
select * from EMPLOYEES
Where employee_id in (150, 160);

-- Task 4: Display job Title, the difference between minimum and maximum salaries for jobs with max salary in the range 10000 to 20000
SELECT job_title, (max_salary - min_salary) Salary_Difference
FROM jobs
WHERE max_salary BETWEEN 10000 AND 20000;
