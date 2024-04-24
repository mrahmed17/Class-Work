SELECT
    * FROM employees;

--task 1
SELECT
    * FROM employees
    order by first_name;
        
--task 2
SELECT UPPER(first_name) from employees;
    
--task 3
SELECT  * FROM employees
WHERE hire_date BETWEEN '01-Feb-2008' and '26-Feb-2008';
    
--task 4
SELECT  * FROM employees
WHERE MOD (employee_id,2)=0;
    
