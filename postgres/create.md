# Create Table

Create relational tables.

## Create a new table

Creates a new table to store data.

```sql
CREATE TABLE IF NOT EXISTS city (
    pk SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    population INT NOT NULL
);
```

## Create a reference table

Creates a new table that references another table.

```sql
CREATE TABLE IF NOT EXISTS country (
    pk SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    population INT NOT NULL
);
```

```sql
CREATE TABLE IF NOT EXISTS country_city (
    city_id INT NOT NULL,
    country_id INT NOT NULL,
    PRIMARY KEY (city_id, country_id),
    FOREIGN KEY (city_id) REFERENCES city (pk),
    FOREIGN KEY (country_id) REFERENCES country (pk)
);
```

## Common Data Types

### Numbers

#### INTEGER / BIGINT

Signed 4/8 byte integers.

#### SERIAL / BIGSERIAL

Auto-incrementing integers.

#### UUID

Universally unique identifier.

#### REAL / DOUBLE

Floating point number.

#### NUMERIC

Fixed point number, used for money.

### Date and Time

#### DATE

Month, day, and year.

#### TIME

Time of day.

#### INTERVAL

A span of time / time frame.

#### TIMESTAMP

Time and date with timezone.

### Strings

#### TEXT

Variable length string, can grow.

#### VARCHAR(x)

Variable length string up to x.

#### CHARACTER(x)

Fixed length string of length x.

#### JSONB

Compressed JSON data.
