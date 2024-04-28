--Q 1: Create a table and name using your ID preceded by emp, which have 5 fields as eid,
--ename, salary, hire_date and address with appropriate date types and create primary key on eid.
Create Table emp1281250 (
        eID int not null CONSTRAINT emp_1281250_id PRIMARY KEY,
        eName varchar(50) not null,
        Salary DECIMAL (10,2) not null,
        hire_date date not null,
        address varchar(255) not null
);


--Q 2: Displays the department numbers and average slalaries for those departments with
--a maximum salary that is greater than 12000.
SELECT department_id, avg(salary) As "AVG_SALARY"
FROM employees
group by department_id
having max(salary)>12000;

--Q 3: Display the name whose name start from 'S'.
SELECT
    * FROM employees
    where last_name LIKE 'S%';
    
--Q 4: Display the avg salary of employees of department sales.
select AVG(salary) as "Avg_Salary"
  FROM employees
  where department_id = 'Sales';
  
--Q 5: Display the name of employees joining the company in ascending order.

SELECT last_name, hire_date
FROM employees
ORDER BY hire_date;