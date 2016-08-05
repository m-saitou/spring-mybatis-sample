# spring-mybatis-sample

## Table layout

### test

| Field           | Type      | Null | Key | Default           | Extra                       |
|-----------------|-----------|------|-----|-------------------|-----------------------------|
| id              | int(11)   | NO   | PRI | NULL              | auto_increment              |
| name            | text      | YES  |     | NULL              |                             |
| update_datetime | timestamp | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
