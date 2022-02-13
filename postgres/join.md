# Join Query

Query data from multiple tables, "comparing" their columns. Not to be confused with `UNION` and `INTERSECT`.

## INNER JOIN

Records in the left table that have a matching record in right table.

```sql
SELECT *
FROM left
    INNER JOIN right ON left.id = right.id;
```

## LEFT JOIN

Records in the left table, regardless of a matching record in the right table.

```sql
SELECT *
FROM left
    LEFT JOIN right ON left.id = right.id;
```

## RIGHT JOIN

Records in the right table, regardless of a matching record in the left table.

```sql
SELECT *
FROM left
    RIGHT JOIN right ON left.id = right.id;
```


## FULL OUTER JOIN

Records in both tables.

```sql
SELECT *
FROM left
    FULL OUTER JOIN right ON left.id = right.id;
```
