/*1. Write an SQL query to create a table named Students with columns: student_id (INT, Primary Key), name (VARCHAR(50)), age (INT), course (VARCHAR(30))
2. Write a command to add a new column email (VARCHAR(100)) to the Students table.
3. Write a query to change the data type of the column age from INT to SMALLINT.
4. Insert 5 Rows In the table
5. Write a command to remove the column course from the Students table.
6. Write a command to rename the table Students to CollegeStudents.
7. Write an SQL query to delete all data from the CollegeStudents table but keep the structure.

*/


CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(30)
);

-----------------------------------------------------------------------------

ALTER TABLE Students
ADD COLUMN email VARCHAR(100);

----------------------------------------------------------------------------

ALTER TABLE Students
MODIFY age SMALLINT;

----------------------------------------------------------------------------

INSERT INTO Students (student_id, name, age, course, email)
VALUES
(1, 'John', 20, 'Java', 'john@gmail.com'),
(2, 'Anita', 22, 'Python', 'anita@gmail.com'),
(3, 'Rahul', 19, 'C++', 'rahul@gmail.com'),
(4, 'Meena', 21, 'JavaScript', 'meena@gmail.com'),
(5, 'David', 23, 'Data Science', 'david@gmail.com');

----------------------------------------------------------------------------

ALTER TABLE Students
DROP COLUMN course;

--------------------------------------------------------------------------

ALTER TABLE Students
RENAME TO CollegeStudents;
