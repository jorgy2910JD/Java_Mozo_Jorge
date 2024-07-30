######################################
####### MYSQL-JAVA- HOSPITAL##########
######################################

use bukvvbyfxpe8wr3rnxmf ;

create table Persona (
id int primary key auto_increment,
nombre varchar (50) not null,
titulo varchar (50) not null,
direccion varchar (255) not null,
telefono int (25) not null,
email float (50) not null,
fecha_nacimiento date not null
);

create table Hospital (
id int primary key auto_increment,
nombre varchar (50) not null
);

create table pabellon (
id int primary key auto_increment,
nombre varchar (50) not null,
capacidad int (10) not null
)



