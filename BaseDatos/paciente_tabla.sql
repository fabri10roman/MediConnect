CREATE TABLE paciente
(
    pacienteId integer,
    cedula integer NOT NULL,
    nombre character varying(1000),
    apellido character varying(1000),
    sexo char(1),
    nacimiento date,
    PRIMARY KEY (pacienteId)
);