--Part 1 Table: job
         --Columns:
         --id int PK
         --employer varchar(255)
         --name varchar(255)
         --skills varchar(255)
         --job_seq table: next_val bigint

--Part 2
SELECT name FROM employer WHERE location = 'St. Louis City';

--Part 3
DROP TABLE IF EXISTS job;
--Part 4
