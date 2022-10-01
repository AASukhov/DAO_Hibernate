create schema if not exists netology;
create table if not exists persons(
    name varchar(255),
    surname varchar(255),
    age int,
    phone_number int,
    city_of_living varchar(255),
    primary key (name, surname, age)
    );

insert into persons(
    name,
    surname,
    age,
    phone_number,
    city_of_living
) values     ('Alexey','Petrov', 27, 22, 'Moscow'),
             ('Vasiliy','Kuznetsov', 25, 33, 'Saint-Petersburg'),
             ('Anatoliy','Zaitsev', 23, 44, 'Nevada'),
             ('Andrey','Zhupsov', 18, 55, 'Samara'),
             ('Dmitriy','Katz', 19, 66, 'Rostov');