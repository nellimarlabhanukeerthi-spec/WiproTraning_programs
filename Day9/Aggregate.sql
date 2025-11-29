/*1. Display the average salary for each job title, only for jobs with more than 3 employees.
2. Find the department that has the highest total salary.
3. List each location’s total employee count and average salary.
4. Show the top 3 departments by total salary expenditure.*/

SELECT j.job_title, AVG(e.salary) AS avg_salary, COUNT(*) AS emp_count
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
GROUP BY j.job_title
HAVING COUNT(*) > 3;

------------------------------------------------------------------------------

SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id
ORDER BY total_salary DESC
FETCH FIRST 1 ROW ONLY;     

-------------------------------------------------------------------------------
SELECT l.location_id,
       COUNT(e.employee_id) AS total_employees,
       AVG(e.salary) AS avg_salary
FROM locations l
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
GROUP BY l.location_id;

---------------------------------------------------------------------------------

SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id
ORDER BY total_salary DESC
FETCH FIRST 3 ROWS ONLY;       



