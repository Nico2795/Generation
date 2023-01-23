CREATE SCHEMA IF NOT EXISTS generation_schema;
CREATE TABLE `generation_schema`. `Articulo` (
`articulo_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(20) NOT NULL,
`precio` INT NOT NULL,
PRIMARY KEY (`articulo_id`));

CREATE TABLE `generation_schema`.`cliente`(
`cliente_id` INT NOT NULL AUTO_INCREMENT, 
`nombre` VARCHAR(20) NOT NULL,
`email` VARCHAR(40) NOT NULL,
`fechaNacimiento` DATE NOT NULL,
`rut` VARCHAR(15) NOT NULL, 
PRIMARY KEY(`cliente_id`));

CREATE TABLE `generation_schema`.`historial`(
`historial_id`INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`historial_id`));

ALTER TABLE generation_schema.cliente ADD historial_id INT NOT NULL; 
ALTER TABLE generation_schema.cliente ADD CONSTRAINT clienteHistorial FOREIGN KEY (historial_id) REFERENCES generation_schema.historial(historial_id)
#altera la tabla cliente, agrega una relacion, que se va a llamar cliente historial, que será una foreign key, llamada historial_id, que hace referencia a la tabla historial, y a su id. 