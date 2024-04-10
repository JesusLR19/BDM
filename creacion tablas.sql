-- Tabla Razas
create table razas(
	idRaza serial primary key,
	nombre varchar(50) not null unique,
	descripcion varchar(256) null
);
-- Tabla Personajes
create table personajes(
	idpersonaje serial primary key,
	nombre varchar(50)not null unique,
	lugarOrigen varchar(50) null,
	descripcion varchar(256),
	id_raza int,
	constraint fk_id_raza
	foreign key(id_raza)
	references razas(idRaza)
	ON DELETE RESTRICT
	ON UPDATE CASCADE
);
-- Tabla Lugares
create table lugares(
	idLugar serial primary key,
	nombre varchar(50) not null unique,
	descripcion varchar(256) null,
	region varchar(50)
);
-- Tabla Eventos
create table eventos(
	nombre varchar(50) not null,
	descripcion varchar(256) null,
	fecha varchar(50) not null,
	idLugar int,
	constraint fk_id_Lugar 
	foreign key(idLugar) 
	references lugares(idLugar)
	ON DELETE RESTRICT
	ON UPDATE CASCADE
);