--Part 1 Table: job
         --Columns:
         --id int PK
         --employer varchar(255)
         --name varchar(255)
         --skills varchar(255)
         --job_seq table: next_val bigint

--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;
--Part 4
--query to return the names of all skills that are attached to jobs in alphabetical order. If a skill does not have a job listed, it should not be included in the results of this query.
SELECT * FROM skill LEFT JOIN job_skills ON skill.id job_skills.skills_id OR job_skills.skills_id

WHERE job_skills.job_id IS NOT NULL;

ORDER BY names ASC;

