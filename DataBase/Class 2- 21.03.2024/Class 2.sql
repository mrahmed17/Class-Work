SELECT * FROM employees;
    
    --task: first name, job id, salary, yearly salary
    --expect salary 9000
    --salary shown by highest to solwest
    
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    FROM employees
    where salary<>9000
    --Order by salary desc;
    Order by 3 desc
    fetch first 5 rows only;
    
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    FROM employees
    where salary<>9000
    --Order by salary desc;
    Order by 3 desc
    offset 5 rows fetch next 5 rows only;
    
    
    --Substitution Variable er jonno & babohar kora hoy
    select employee_id, last_name,salary, department_id
    from employees
    where employee_id=&employee_num;
    
    --Substitution Variable er jonno & babohar kora hoy and string sign use korte hoy
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    from employees
    where first_name='&employee_name'
    ORDER BY 2 desc;
    
    --Substitution Variable er jonno double Ampersand (&&) babohar kora jay and string sign use korte hoy.
    --Waring:  Tobe double Ampersand use korle ta fixed vabe save hoye jay
    
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    from employees
    where first_name='&&employee_name'
    ORDER BY 2 desc;
    
    
    --Jekono employee er namer last character khuje ber korar jonno
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    from employees
    where first_name like '%&employee_name'
    ORDER BY 2 desc;
    
    --Jekono employee er name ba namer character jekhanei thakuk na keno ta khuje ber korar jonno
    select first_name, job_id, salary, salary*12 as "Yearly Salary"
    from employees
    where first_name like '%&employee_name%'
    ORDER BY 2 desc;
    
    --Specifying Column Names, Expressions and Text Identifying by user demand
    select employee_id, last_name, job_id, &column_name
    from employees
    where &condition
    ORDER BY 2 &order_column;