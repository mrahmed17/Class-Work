--Q 1: Create table and name using your ID preceded by emp (as emp106588), which hvae 5 fieds 
--as eid, ename, salary, hire_date and address with appropriate data types and create primary key on eid. -- 8
CREATE TABLE emp1281250(
        eID INT NOT NULL CONSTRAINT emp_1281250_id Primary Key,
        eName VARCHAR(50) NOT NULL,
        Salary DECIMAL(10,2) NOT NULL,
        hire_date date NOT NULL,
        address varchar(255) NOT NULL
);

--Q 2: Add two new columns named 'department_id', 'dept_name' ALTER Table Command. -- 5
ALTER TABLE emp1281250 add(
        department_id INT,
        dept_name    varchar(50)
);

--Q 3: Insert values to the table.
INSERT INTO emp1281250
VALUES (
    50,
    'Raju',
    999999.99,
    '16-JAN-2024',
    'Dhanmondi',
    40,
    'Administration');
    
INSERT INTO emp1281250 
VALUES (
    51,
    'Rezvi',
    999999.99,
    '16-JAN-2024',
    'Dhanmondi',
    80,
    'Manager'
);

INSERT INTO emp1281250
VALUES (
    52,
    'Nusrat',
    999999.99,
    '16-JAN-2024',
    'Dhanmondi',
    90,
    'Sales'
);

--Q 4: Create a view that which contains ename, dept_name and salary in department 80.  -- 8
Create OR REPLACE VIEW emp_1250 AS 
   SELECT ename, dept_name, salary
   FROM emp1281250
   WHERE department_id = 80;
   
--Q 5: Create a sequence.
create sequence eid_303_seq
START WITH 100
INCREMENT by 1
no maxvalue
nocycle
nocache;

--Q 6: Give an appropriate example of insert data from subqueries. 
INSERT INTO emp1281250
    SELECT
        e.employee_id,
        e.first_name,
        e.salary,
        e.hire_date,
        l.city,
        d.department_id,
        d.department_name
    FROM
        employees e
        JOIN departments d ON ( e.department_id = d.department_id )
        JOIN locations   l ON ( d.location_id = l.location_id )
    WHERE
        d.department_id = 80;

--Q 7: Oral   -- 5