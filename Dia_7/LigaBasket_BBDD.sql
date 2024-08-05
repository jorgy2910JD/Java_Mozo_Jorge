#######################################
######### Liga Basket- DIA 7 ##########
#######################################


create database LigaBasket;

use  LigaBasket;


create table Partido (
id int auto_increment primary key,
equipo_local varchar (50) not null,
equipo_visitante varchar (50) not null,
anotaciones_local int (10) not null,
anotaciones_visitante int (10) not null,
Fecha date not null,
partido_Finalizado varchar (15) not null
);

create table Liga (
id int auto_increment primary key,
jornada int (10) not null
);

create table PlayOffs (
id int auto_increment primary key,
ronda int (10) not null
)