--Class Topics (Grouping rows):
-- GROUP BY clause
-- HAVING clause
-- Nesting group functions

-- Using the GROUP BY Clause
SELECT department_id, AVG(salary)
FROM employees
GROUP BY department_id ;

-- Alternative
SELECT department_id, job_id, AVG(salary)
FROM employees
GROUP BY department_id,job_id;

-- Alternative
SELECT department_id, job_id, commission_pct, AVG(salary)
FROM employees
GROUP BY department_id,job_id, commission_pct;


-- Using the GROUP BY Clause on Multiple Columns
SELECT department_id, job_id, SUM(salary)
FROM employees
WHERE department_id > 40
GROUP BY department_id, job_id
ORDER BY department_id;

-- Using the HAVING Clause
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary)>10000 ;

-- Using the HAVING Clause
select job_id, sum(salary) payroll
from employees
WHERE job_id not like '%REP%'
GROUP BY job_id
HAVING sum(salary)>13000
order by sum(salary);
