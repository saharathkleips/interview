# Select Query

Query data from a table.

## SELECT *

Query all rows and all columns.

```sql
SELECT *
FROM city;
```

## SELECT

Query all rows from specific columns.

```sql
SELECT name
FROM city;
```

## SELECT DISTINCT

Query rows where the specified column value is unique.

```sql
SELECT DISTINCT name
FROM city;
```

## SELECT WHERE

Query rows where a specified condition is met.

```sql
SELECT name
FROM city
WHERE population >= 500000;
```

## SELECT ORDER BY

Query rows and sort the result set.

```sql
SELECT name
FROM city
ORDER BY population ASC;
```

```sql
SELECT name
FROM city
ORDER BY population DESC;
```

## SELECT by LIMIT / OFFSET

Query rows of a specific page size (`LIMIT`) after a specifc index (`OFFSET`).

```sql
SELECT name
FROM city
LIMIT 100 OFFSET 10;
```
