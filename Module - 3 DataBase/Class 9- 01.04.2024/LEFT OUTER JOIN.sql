--Inner Join
SELECT e.last_name, e.department_id, d.department_name
FROM employees e JOIN departments d
ON (e.department_id = d.department_id) ;

--LEFT OUTER JOIN
SELECT e.last_name, e.department_id, d.department_name
FROM employees e LEFT OUTER JOIN departments d
ON (e.department_id = d.department_id) ;

--RIGHT OUTER JOIN
SELECT e.last_name, e.department_id, d.department_name
FROM employees e RIGHT OUTER JOIN departments d
ON (e.department_id = d.department_id) ;

--FULL OUTER JOIN
SELECT e.last_name, e.department_id, d.department_name
FROM employees e FULL OUTER JOIN departments d
ON (e.department_id = d.department_id) ;