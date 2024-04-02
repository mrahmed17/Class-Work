--Using Subqueries to Solve Queries
--Task 1:
        --Main query: Determine the names of all employees who were hired after Davies?
                --Subquery:When was Davies hired?
                
--order by last name
select last_name, hire_date
from employees
where hire_date >
                (select hire_date 
                from employees 
                where last_name='Davies')
order by last_name;

--Practice
select last_name, hire_date
from employees
where hire_date <
                (select hire_date
                from employees 
                where last_name='Davies')
order by last_name;

--Practice
select last_name, hire_date
from employees
where hire_date =
                (select hire_date
                from employees
                where last_name='Davies')
order by last_name;


--Practice
--order by first name
select first_name, hire_date
from employees
where hire_date >  
                (select hire_date
                from employees 
                where first_name='Curtis')
order by first_name;

--Practice
select first_name, hire_date
from employees
where hire_date <
                    (select hire_date
                    from employees
                    where first_name='Curtis')
order by first_name;

--Practice
select first_name, hire_date
from employees
where hire_date =
                (select hire_date
                from employees
                where first_name='Curtis')
order by first_name;


--Executing Single-Row Subqueries Note: fetch first 1 row only
SELECT last_name, job_id, salary
FROM employees
WHERE job_id =
            (SELECT job_id 
            FROM employees
            WHERE last_name = 'Taylor'
            FETCH first 1 ROW only)
AND salary >
            (SELECT salary
            FROM employees
            WHERE last_name = 'Taylor'
            FETCH first 1 ROW only);

--Using Group Functions in a Subquery
SELECT last_name, job_id, salary
FROM employees
WHERE salary =
                (SELECT MIN(salary)
                FROM employees);

--Using Group Functions in a Subquery
SELECT department_id, MIN(salary)
FROM employees
GROUP BY department_id
HAVING MIN(salary) >
                (SELECT MIN(salary)
                    FROM employees
                        WHERE department_id = 30);

--Practice count department_id
SELECT department_id, MIN(salary), COUNT(department_id)
FROM employees
GROUP BY department_id
HAVING MIN(salary) >
                (SELECT MIN(salary)
                    FROM employees
                        WHERE department_id = 30);
                        
                        
--Single-row operator with multiple-row subquery
SELECT employee_id, last_name
FROM employees
WHERE salary =
            (SELECT MIN(salary)
                FROM employees
                    GROUP BY department_id);  --This Query Will Show Error. bcz subquery 'group by' provide multiple row but main query show single query

--Subquery returns no rows because there is no employee named “Haas.” 
SELECT last_name, job_id
FROM employees
WHERE job_id =
            (SELECT job_id
                FROM employees
                    WHERE last_name = 'Haas'); --This Query Will Show black result. bcz subquery 'where' last_name = 'Haas' is not available on the table
