# Insert Query

Insert data into a table.

## INSERT INTO

Insert data into a table.

```sql
INSERT INTO city (name)
VALUES ('bangkok');
```

## INSERT INTO with reference

Insert data into a table where a column is the value of another query.

```sql
INSERT INTO country_city(country_id, city_id)
VALUES (
        (
            SELECT pk
            FROM country
            WHERE name = 'thailand'
        ),
        (
            SELECT pk
            FROM city
            WHERE name = 'bangkok'
        )
    );
```