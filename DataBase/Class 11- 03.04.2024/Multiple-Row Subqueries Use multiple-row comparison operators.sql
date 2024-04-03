--Multiple-Row Subqueries
--Use multiple-row comparison operators
SELECT last_name, salary, department_id
FROM employees
WHERE salary IN (SELECT MIN(salary)
                    FROM employees
                        GROUP BY department_id);
   
   --Example                     
SELECT last_name, salary, department_id
FROM employees
WHERE salary IN (2500, 4200, 4400, 6000, 7000, 8300, 
8600, 17000);


--Using the ANY Operator in Multiple-Row Subqueries
SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary < ANY  (SELECT salary
                        FROM employees
                            WHERE job_id = 'IT_PROG')
    AND job_id <> 'IT_PROG';


--Multiple-Column Subquery: Example
SELECT first_name, department_id, salary
FROM employees
WHERE (salary, department_id) IN
                    (SELECT min(salary), department_id
                        FROM employees
                            GROUP BY department_id)
    ORDER BY department_id;
    
--Null Values in a Subquery
SELECT last_name FROM employees
WHERE employee_id NOT IN
            (SELECT manager_id 
                FROM employees 
                    WHERE manager_id IS NOT NULL);
