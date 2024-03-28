--Task 1: Display years in which more than 10 employees joined
--BY chatGPT
SELECT EXTRACT(YEAR FROM hire_date) AS JoinYear, COUNT(*) AS Employee_Joins
FROM Employees
GROUP BY EXTRACT(YEAR FROM hire_date)
HAVING COUNT(*) > 10
ORDER BY Employee_Joins DESC;

--BY Trainer
SELECT to_char(hire_date,'YYYY') AS JoinYear
FROM Employees
GROUP BY to_char(hire_date,'YYYY')
HAVING COUNT(employee_id) > 10;


--Task 2: Display departments in which more than five employees have commission percentage.
--BY chatGPT
SELECT d.department_id, d.department_name
FROM departments d
WHERE (
  SELECT COUNT(*)
  FROM employees e
  WHERE e.department_id = d.department_id
    AND e.commission_pct > 0
) > 5;

--BY Trainer
SELECT department_id
from employees
WHERE commission_pct is not null
GROUP BY department_id
HAVING count(commission_pct)>5;


--Task 3: Display job id for jobs with avarage salary more than 10000
--BY chatGPT
SELECT job_id, avg(salary)
FROM employees
GROUP BY job_id
HAVING AVG(salary) > 10000;

--BY Trainer
SELECT job_id, avg(salary)
FROM employees
GROUP BY job_id
HAVING AVG(salary) > 10000;


