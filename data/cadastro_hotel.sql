CREATE DATABASE IF NOT EXISTS cadastro_hotel;
use cadastro_hotel;
create table if not exists quartos(
id_quartos int auto_increment primary key,
numero int not null unique,
tipo varchar(50) not null,
ocupacao boolean not null,
valor_diaria double not null);

create table if not exists cliente(
id_cliente int auto_increment primary key,
nome varchar(150) not null,
cpf varchar(17) not null unique,
telefone varchar(19) not null,
email varchar(100) not null unique);

create table if not exists reservas(
id_reserva int auto_increment primary key,
id_quarto int not null,
id_cliente int not null,
data_checkIn date not null,
data_chackOut date not null,
valor_total double not null,
foreign key(id_quarto) references quartos(id_quartos),
foreign key(id_cliente) references cliente(id_cliente)); 

create table if not exists pagamentos(
id_pagamentos int auto_increment primary key,
id_reserva int not null,
valor double not null,
data_pagamento date not null,
metodo varchar(20) not null unique,
foreign key(id_reserva) references reservas(id_reserva));

create table if not exists funcionarios(
id_funcionarios int auto_increment primary key,
nome varchar(150) not null,
cargo varchar(50) not null,
login varchar(50) not null unique,
senha varchar(50) not null);