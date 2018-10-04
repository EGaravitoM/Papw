<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 15. Integración MySQL en Heroku

---

## Agregar MySQL a Heroku

1. Entrar al *dashboard* de la aplicación de Heroku
2. Resources -> Add-ons JawsDB MySQL
3. Provision

---

## Integrar función de conexión (I)

1. Abrir carpeta local del proyecto
2. Entrar en `src/main/java/com/example/Main.java`
3. Pegar la siguiente función después de `datasource()`
```java
private static Connection getConnection() 
  throws URISyntaxException, SQLException {
  
  URI jdbUri = new URI(System.getenv("JAWSDB_URL"));

  String username = jdbUri.getUserInfo().split(":")[0];
  String password = jdbUri.getUserInfo().split(":")[1];
  String port = String.valueOf(jdbUri.getPort());
  String jdbUrl = "jdbc:mysql://" + jdbUri.getHost() + 
    ":" + port + jdbUri.getPath();

  return DriverManager.getConnection(
  	jdbUrl, username, password);
}
```

---

## Integrar función de conexión (II)

4. Agregar
5. Actualizar variable de conexión en la petición `@RequestMapping("/db")`
```java
try (Connection connection = getConnection()) {
```
6. Añadir librerías faltantes:
```java
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
```

---

## Actualizar variables de entorno locales

1. Entrar al *dashboard* de la aplicación de Heroku
2. Settings -> Config Vars -> Reveal Config Vars
3. Copiar valor de `JAWSDB_URL`
4. Abrir carpeta local del proyecto
5. Agregar al archivo `.env` la siguiente línea
```plain
JAWSDB_URL=<Valor copiado de Reveal Config Vars>
```

La estructura de la URL es la siguiente:
```
manejadorBD://usuario:contraseña@host:puerto/baseDeDatos
```

---

## Añadir dependencia de MySQL

1. Abrir carpeta local del proyecto
2. Abrir `pow.xml`
3. Añadir la dependencia:

```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.12</version>
</dependency>
```
4. Correr comando:
```cmd
mvnw clean install
```

---

## Correr aplicación de manera local

```cmd
heroku local web
```

---


## Fuentes

* https://devcenter.heroku.com/articles/jawsdb#java-using-jdbc
* https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.12