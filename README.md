# spring-mybatis-sample

## API Reference

### List records

`GET` /

### Get record

`GET` /{id}

### Insert records

`POST` /

#### Request body

| Name | Type   |
|------|--------|
| name | string |

#### Response body

| Name           | Type   | Description |
|----------------|--------|-------------|
| id             | int    | primary key |
| name           | string |             |
| updateDatetime | string |             |

### Delete record

`DELETE` /{id}

## Table layout

### test

| Field           | Type      | Null | Key | Default           | Extra                       |
|-----------------|-----------|------|-----|-------------------|-----------------------------|
| id              | int(11)   | NO   | PRI | NULL              | auto_increment              |
| name            | text      | YES  |     | NULL              |                             |
| update_datetime | timestamp | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
