create table person (
idperson bigserial primary key,
lastname varchar(32),
firstname varchar(32)
)

insert into person (lastname, firstname) values
('Ivanov', 'Ivan'),
('Petrov', 'Petr');