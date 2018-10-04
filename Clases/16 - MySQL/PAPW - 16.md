<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 16. Instrucciones MySQL

---

## Instalar y ejecutar MySQL en Windows

1. Descargar [XAMPP](https://www.apachefriends.org/es/index.html)
2. Abrir XAMPP Control Panel
3. Start en MySQL
4. Shell
5. Correr MySQL con este comando

```cmd
mysql -u <nombreUsuario> -p<contraseña>
```
* Nombre de usuario: `root`
* Contraseña vacía

---

## Acciones MySQL para bases de datos

```sql
/* Mostrar bases de datos */
show databases;

/* Crear base de datos ejemplo */
create database ejemplo

/* Eliminar base de datos ejemplo */
drop database ejemplo

/* Usar la base de datos ejemplo */
use ejemplo;
```

---

## Tipos de datos MySQL

* `int`: Entero
* `float(n, d)`: Flotante de $n$ dígitos y $d$ posiciones decimales (incluidas)
* `date`: Fecha en formato AAAA-MM-DD
* `datetime`: Fecha en formato AAAA-MM-DD HH:MM:SS
* `varchar(c)`: Cadena de $c$ caracteres
* `blob`: *Binary Large Object* o Gran objeto binario que suele utilizarse para almacenar multimedia

---

## Acciones MySQL para tablas

```sql
/* Estructura general */
create table nombreTabla (nombreColumna tipoDato);

/* Crear tabla de usuarios */
create table usuario(
  idUsuario int not null auto_increment, /* Entero++ */
  nombre varchar(50),
  correo varchar(50) unique, /* No permite repetidos */
  claveAcceso varchar(255),
  primary key(id)
);

/* Borrar una tabla */
drop table usuario;

/* Mostrar tablas */
show tables;

/* Mostrar columnas de la tabla usuario */
show columns from usuario;
```

---

## Añadir registros

```sql
insert into 'usuarios' (
  'nombre', 
  'correo',
  'claveAcceso'
) values (
  'Alberto',
  'bena.87@hotmail.com', 
  sha1('secreta')
);
```

---

## Llaves foráneas

```sql
create table calificaciones(
  idCalif int not null auto_increment,
  calif float(5, 2),
  idUsuario int,
  primary key (idCalif),
  foreign key (idUsuario) references usuarios(idUsuario)
);
```

---

## Mostrar registros

```sql
/* Estructura general */
select campo1, campo2, <...>
from tabla1, tabla2, <...>
where condición

/* Todas las columnas y todos los registros de usuarios */
select * from usuarios;

/* Las columas nombre y correo de usuarios */
select nombre, correo from usuarios;

/* Todas las columnas del registro con nombre Alberto */
select * from usuarios where nombre = 'Alberto';
```

---

## Modificar registros

```sql
/* Estructra general */
update nombreTabla 
set campo1 = nuevoValor1, campo2 = nuevoValor2, <...>
[where condición]

/* Actualizar usuario con id = 1 */
update usuarios
set nombre = 'José', correo = 'otro@correo.com'
where id = 1;
```

---

## Eliminar registros

```sql
/* Estructura general */
delete from nombreTabla where condición;

/* Eliminar usuario con id = 1 */
delete from usuarios where id = 1;
```

---

## Ordenar registros

```sql
/* Estructura general */
select campo1, campo2, <...>
from tabla1, tabla2, <...>
order by campo1 asc|desc, campo2 asc|desc;

/* Seleccionar nombres de usuario ordenados por correo */
select nombre from usuarios order by correo asc;
```

---

## :warning: Tarea 13 :warning:
###### +4 segundo parcial

* Hacer equipos de 1 a 4 personas
* Cada uno anotar en una hoja los últimos 4 dígitos de tu matrícula
* Realizar un esquema de la base de datos de tu proyecto; pueden ayudarte tus compañeros

---

## Fuentes

* https://www.tutorialspoint.com/mysql/index.htm
* https://zinoui.com/blog/storing-passwords-securely
* https://www.w3schools.com/Sql/sql_foreignkey.asp