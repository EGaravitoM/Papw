<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 14. Repaso POO

---

## :warning: Tarea 11 :warning:
###### Sólo para asistentes
###### Inicio 5:40pm
###### 3 a 5 correctas: +2 segundo parcial

* Escribe los últimos 4 dígitos de tu matrícula en una hoja en blanco
* Realizas las actividades solicitadas

---

```java
boolean tarea11 = true;

public class Hoja{
  public int mat; // Últimos 4 dígitos de la matrícula
  private String[] respuestas = new String[5];
}

public class Asistente{
  Hoja repaso;
  public Asistente(Hoja repaso){this.repaso = repaso;}
  public boolean Habla(){
    return true;
  }
}

Asistente[] asistentes = new Asistente[] { /* Ustedes */ };
while(tarea11){
  for (Asistente a : asistentes){
    if(a.Habla){
      a.hoja = null;
    }
  }
}
```

---

## :mute: A partir de este momento :mute:

## Quien hable, dejará de participar en la Tarea 11

---

## 1. Escribe el código para declarar una clase pública con nombre `Pregunta` que tenga por atributos:
* `num`: Variable pública y entera
* `pregunta`: Variable pública y de cadena de caracteres

---

## 2. Declara e inicializa una instancia llamada `e1` de la siguiente clase:

```java
public class Ejemplo{
  private int entero;
  public String cadena;
}
```

---

## 3. Escribe en la línea marcada por `Respuesta` el código para asignar un valor de `3` a la instancia `e2`:

```java
public class Ejemplo{
  private int entero;
  public String cadena;
  
  public void SetEntero(int entero){
    this.entero = entero;
  }
}

Ejemplo e2 = new Ejemplo();
// Respuesta

```

---

## 4. Escribe el código faltante en `Respuesta` para inicializar la instancia `e3` con un valor de `5` a partir de su constructor.

```java
public class Ejemplo{
  private int entero;
  public String cadena;
  
  public Ejemplo(int entero){
    this.entero = entero;
  }
}

Ejemplo e3 = // Respuesta

```

---

## 5. En el siguiente código, qué atributos tiene la clase `Hijo`

```java
public class Padre{
  int a;
  String b;
}

public class Hijo extends Padre{
  float c;
  boolean d;
}
```

---

```java
boolean releer = true;
if (releer){
  ReleerPreguntas();
  releer = false;
}
```

---

## Entregar hoja en silencio

---

```java
tarea11 = false;
```

---

# Servidor remoto

---

## Requisitos

* Cuenta de [Heroku](https://signup.heroku.com/signup/dc)
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://www.mkyong.com/maven/how-to-install-maven-in-windows/)
	* Botón derecho en Este equipo
	* Propiedades
	* Configuración avanzada del sistema
	* Variables de entorno
* Git
* [Heroku CLI](https://cli-assets.heroku.com/heroku-x64.exe)

---

## Pasos

1. Bajar repositorio preparado
```
rem Ubicarse en la carpeta deseada

rem Descargar el proyecto
git clone^
https://github.com/heroku/java-getting-started.git

rem Entrar a la carpeta del proyecto
cd java-getting-started
```

---

## Pasos

2. Crear la aplicación de Heroku

```
heroku create
```

3. Cambiar el nombre de la aplicación
	1. https://dashboard.heroku.com/
	2. Seleccionar la aplicación
	3. Settings -> Name -> Edit
	4. Copiar Heroku Git URL

---

## Pasos

4. Cambiar repositorio remoto
```
git remote rm heroku

git remote add heroku <Heroku Git URL>
```

5. Hacer un commit

```
git push heroku master
```

6. Escalar la aplicación (publicarla en web)

```
heroku ps:scale web=1
```

7. Abrir la aplicación
```
heroku open
```

---

## Pasos

8. Ejecutar aplicación de manera local

```
mvnw clean install

heroku local
```

9. Se puede acceder a la apliación en http://localhost:5000

---

## :warning: Tarea 12 :warning:
###### +2 en segundo parcial

* Crear una aplicación `Java` en Heroku siguiendo los pasos de estas diapositivas
* Cambiar el nombre de la aplicación
* Agregar el correo bena.87@hotmail.com como colaborador:
	* En la página de Heroku de la app selecciona Access
	* Add collaborator
	* Copia y pega el correo
	* Save changes


---


## Fuentes

* http://www.ntu.edu.sg/home/ehchua/programming/java/J3a_OOPBasics.html
* https://www.learnjavaonline.org/en/Inheritance
* https://www.tutorialspoint.com/java/number_sqrt.htm
* https://devcenter.heroku.com/articles/getting-started-with-java