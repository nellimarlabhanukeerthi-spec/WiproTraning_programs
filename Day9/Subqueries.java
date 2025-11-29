/*1. Find employees who earn more than the average salary of their department.
2. Display employees whose salary is greater than all salaries of employees in the ‘IT’ department.
3. List departments that have no employees.
4. Display all employees hired after the employee with the highest salary was hired.*/

SELECT e.employee_id, e.first_name, e.last_name, e.salary, e.department_id
FROM employees e
WHERE e.salary > (
    SELECT AVG(salary)
    FROM employees
    WHERE department_id = e.department_id
);

----------------------------------------------------------------------------------------------

  SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary > ALL (
    SELECT salary
    FROM employees
    WHERE department_id = (
        SELECT department_id
        FROM departments
        WHERE department_name = 'IT'
    )
);

--------------------------------------------------------------------------------------------

SELECT d.department_id, d.department_name
FROM departments d
LEFT JOIN employees e
    ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;

------------------------------------------------------------------------------------------

  SELECT employee_id, first_name, last_name, hire_date
FROM employees
WHERE hire_date > (
    SELECT hire_date
    FROM employees
    ORDER BY salary DESC
    FETCH FIRST 1 ROW ONLY   
);



  
