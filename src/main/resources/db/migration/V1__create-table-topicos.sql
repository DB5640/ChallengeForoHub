create table topicos(

id bigint not null auto_increment,
titulo varchar(100) not null,
mensaje varchar(500) not null,
fecha_de_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
autor varchar(100) not null,
curso varchar(100) not null,
respuesta varchar(500) not null,

primary key(id)

);

