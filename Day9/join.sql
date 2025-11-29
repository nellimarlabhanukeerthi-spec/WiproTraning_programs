/*1. Display the first name, last name, department name, and city of all employees.
2. List all employees along with their manager’s name.
3. Find the names of employees who work in the same department as ‘Nancy Greenberg’.
4. Show employees who work in the same city as their manager.
5. List all employees whose job title is the same as their manager’s.
*/

SELECT e.first_name, e.last_name, d.department_name, l.city
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id;

-------------------------------------------------------------------------------------

SELECT e.first_name AS employee_first,
       e.last_name AS employee_last,
       m.first_name AS manager_first,
       m.last_name AS manager_last
FROM employees e
LEFT JOIN employees m ON e.manager_id = m.employee_id;

----------------------------------------------------------------------------------------

SELECT e.first_name, e.last_name
FROM employees e
WHERE e.department_id = (
    SELECT department_id
    FROM employees
    WHERE first_name = 'Nancy' AND last_name = 'Greenberg'
);

---------------------------------------------------------------------------------------

SELECT e.first_name, e.last_name
FROM employees e
JOIN employees m ON e.manager_id = m.employee_id
JOIN departments d1 ON e.department_id = d1.department_id
JOIN locations l1 ON d1.location_id = l1.location_id
JOIN departments d2 ON m.department_id = d2.department_id
JOIN locations l2 ON d2.location_id = l2.location_id
WHERE l1.city = l2.city;

-----------------------------------------------------------------------------------------

SELECT e.first_name, e.last_name
FROM employees e
JOIN employees m ON e.manager_id = m.employee_id
WHERE e.job_id = m.job_id;

