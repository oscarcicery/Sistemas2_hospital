create database DBhospital;
use DBhospital;

/* Tabla Pacientes*/
create table tblPacientes(
IDPaciente integer,
Nombres varchar(30),
Apellidos varchar(30),
Fecha_nacimiento date,
Direccion varchar(50),
Email varchar(50),
Genero Varchar(0),
Estado_civil varchar(10)); 

/*tabla Medicos*/

create table tblMedicos(
IDMedico integer,
Nombres varchar(30),
Apellidos varchar(30),
Genero Varchar(0),
Direccion varchar(50),
Email varchar(50),
CodEspecialidad integer);

/*tabla Especialidades*/
create table tblEspecialidades(
CodEspecialidad integer,
NombreEspecialidad varchar(50)
);

/*cracion de llaves*/
alter table tblPacientes
add constraint pk_IDpaciente primary key (IDPaciente);

alter table tblMedicos
add constraint pk_IDMedico primary key(IDMedico),
add constraint fk_CodEspecialidad foreign key (CodEspecialidad) references tblEspecialidades(CodEspecialidad);

alter table tblEspecialidades
add constraint pk_CodEspecialidad primary key (CodEspecialidad);

/*Mostrar tablas */
select * from tblPacientes;
select * from tblMedicos;
select * from tblEspecialidades;

select * from tblmedicos
inner join tblespecialidades 
on	tblmedicos.CodEspecialidad = tblespecialidades.CodEspecialidad;
/*Borrar entidades*/

drop table tblPacientes;
drop table tblMedicos;
drop table tblEspecialidades;

