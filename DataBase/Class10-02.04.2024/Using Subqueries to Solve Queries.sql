--Using Subqueries to Solve Queries
--Task 1:
        --Main query: Determine the names of all employees who were hired after Davies?
                --Subquery:When was Davies hired?
                
--Order by last name
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
            (SELECT MIN(salary)                 --This Query Result Will Show Error.
                FROM employees                        --Bcz subquery 'group by' provide multiple row
                    GROUP BY department_id);                 -- but main query required single query result from subquery.
                                        

--Subquery returns no rows because there is no employee named ('Haas'.)
SELECT last_name, job_id
FROM employees
WHERE job_id =
            (SELECT job_id                        --This Query Will Show blank result (Only Title).
                FROM employees                        --Bcz subquery ('where' last_name = 'Haas') is not available on that table.
                    WHERE last_name = 'Haas');  
