--1. Display job ID of jobs that were done by more than 3 employees for more than 100 days.

SELECT JOB_ID
	FROM employees
		GROUP BY JOB_ID
			HAVING count(*) > 3;

-- 2. Display departments where any manager is managing more than 5 employees.

SELECT department_name
	FROM departments
	WHERE manager_id IN (
    		SELECT manager_id
			FROM employees
    				GROUP BY manager_id
    					HAVING count(*) > 5 );


-- 3. Display how many employees joined in each month of the current year.

SELECT 