/*Practice 3-1: Restricting and Sorting Data

Task: 1. Display the last name and salary for any employee whose salary is not 
in the range $5,000 through $12,000. Save your SQL statement as lab_03_03.sql. */

select last_name, salary
    from employees
        where salary not BETWEEN 5000 and 12000;

/*Task: 2. Display the last name and department ID of all employees in departments
20 or 50 in ascending alphabetical order by last_name.*/

select last_name, department_id
    from employees
        where department_id in (20,50)
            order by last_name;

--Alternative
select last_name, department_id
    from employees
        where department_id = 20 or department_id =50
            order by last_name;

--Task: 3. Display the last name and salary of employees who earn 
--between $5,000 and $12,000, and are in department 20 or 50. Label the columns 
--Employee and Monthly Salary, respectively.

select last_name as "Employee", salary as "Monthly Salary"
    from employees
        where salary not between 5000 and 12000   and
            department_id in (20,50);
    
--Task: 4. Display the last name, salary, and commission of all employees who earn 
--commissions. Sort the data in descending order of salary and commissions. 
--Use the column’s numeric position in the ORDER BY clause.

select last_name , salary, commission_pct
    from employees
        where commission_pct is not null
            order by 2 desc, 3 desc;


--Task: 5. Display the last name, salary, and commission for all 
--employees whose commission is 20%.

select last_name , salary, commission_pct
    from employees
        where commission_pct=0.2;

--Task: 6. Displays the last name and department number for employee number 176.

select last_name , department_id
    from employees
        where employee_id=176;

--Practice 4-1: Using Single-Row Functions to Customize Output

--Task: 7. Display the employee number, last name, salary, and salary increased
--by 15.5% (expressed as a whole number) for each employee. Label the column New Salary.

select employee_id, last_name, salary, round(salary+(salary*0.155)) as "New Salary"
    from employees;


--Task: 8. Displays the last name (with the first letter in uppercase and all the 
--other letters in lowercase) and the length of the last name for all employees whose 
--name starts with the letters “J,” “A,” or “M.” Give each column an appropriate label.
--Sort the results by the employees’ last names.

Select initcap(last_name) "Name", Length(last_name) as "Last Name Length" 
    from employees
       where last_name LIKE 'J%'
         or last_name LIKE 'A%'
           or last_name LIKE 'M%'
 order by last_name;


--Task: 9. Display the last name and salary for all employees. Format the salary 
--to be 15 characters long, left-padded with the $ symbol. Label the column SALARY.

select last_name, LPAD(salary, 15,'$') SALARY
    from employees;

--Practice 5-1: Using Conversion Functions and Conditional Expressions

--Task: 10. Create a report that produces the following for each employee: 
--<employee last name> earns <salary> monthly but wants <3 times salary.>. 
--Label the column Dream Salaries.

select last_name||' earns '
        || to_char(salary,'fm$99,999.00') 
            ||'monthly but wants'
                || to_char(Salary*3,'fm$99,999.00')
                    || '.' "Dream Salaries"
from employees;

--Task: 11. Display each employee’s last name, hire date, and salary review date,
--which is the first Monday after six months of service. Label the column REVIEW.
--Format the dates to appear in a format that is similar to “Monday, the Thirty-First
--of July, 2000.

SELECT last_name, hire_date, 
        TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 6),'MONDAY'), 
            'fmDay, "the" Ddspth "of" Month, YYYY') "SALARY REVIEW" 
    FROM employees;

/*Task: 12. */