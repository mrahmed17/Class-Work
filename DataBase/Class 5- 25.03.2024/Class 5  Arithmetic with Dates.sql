
--Show timezone and current date from Dual (means Dummy Table)
Select SESSIONTIMEZONE, CURRENT_DATE FROM dual;

--Show timezone and current time stamp from Dual (means Dummy Table)
select SESSIONTIMEZONE, CURRENT_timestamp FROM DUAL;

--Substract one day form todays date
select SYSDATE - 1 from dual;

--Add one day form todays date
select SYSDATE + 1 from dual;

--Add few months or more months, Change Next day, go to last day of the month.
select first_name, add_months(sysdate,8) "Next New Months", next_day(sysdate,'WED') "Next New Day",
last_day(sysdate) "Last Day of the month" from employees;

--Practice above method
select last_name, add_months(sysdate,3), next_day(sysdate,'FRI'), last_day(sysdate) from employees;

--Date-Manipulation All function in one place ?
SELECT employee_id, hire_date, MONTHS_BETWEEN(SYSDATE,hire_date) TENURE, ADD_MONTHS (hire_date, 6) REVIEW, 
NEXT_DAY (hire_date, 'FRIDAY'), LAST_DAY(hire_date) 
FROM employees WHERE MONTHS_BETWEEN (SYSDATE, hire_date) < 200;

-- Round and Trunc All Function in place
SELECT employee_id, hire_date,
ROUND(hire_date, 'MONTH'), TRUNC(hire_date, 'MONTH')
FROM employees
WHERE hire_date LIKE '%04';

--Using To_Char Functjion with Dates
SELECT employee_id, TO_CHAR(hire_date, 'MM/YY') Month_Hired
FROM employees
WHERE last_name = 'Higgins';
