SELECT * FROM employees;
    
    --task: first name, job id, salary, yearly salary
    --expect salary 9000
    --salary shown by highest to solwest
    
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    FROM employees
    where salary<>9000
    Order by salary desc;