-- Given the following two tables:
CREATE TABLE IF NOT EXISTS candidates (
    id INTEGER PRIMARY KEY,
    name VARCHAR(20) NOT NULL UNIQUE,
    age INTEGER NOT NULL
);
--
CREATE TABLE IF NOT EXISTS reports (
    id INTEGER PRIMARY KEY,
    company VARCHAR(20) NOT NULL,
    candidate_id INTEGER NOT NULL,
    score INTEGER NOT NULL
);
--
INSERT INTO candidates (id, name, age)
VALUES (25, 'Taylor', 30),
    (113, 'Paul', 21),
    (10, 'Lara', 30);
--
INSERT INTO reports (id, company, candidate_id, score)
VALUES (1, 'Intuit', 10, 20),
    (36, 'Microsoft', 113, 60),
    (137, 'Intuit', 10, 30),
    (2, 'Google', 10, 99);
-- Write a SQL query that, for each candidate, calculates
-- the number of distinct companies they applied to.
-- The result should contain the id of the candidate, name of the candidate,
-- and number compnies they applied to, ordered by id.

--- TODO ---
--- id  | name   | companies
--- 10  | lara   | 2
--- 25  | taylor | 0
--- 113 | paul   | 1

---
DROP TABLE candidates,
reports;