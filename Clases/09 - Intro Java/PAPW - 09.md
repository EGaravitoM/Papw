<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 9. Introducción a Java

---

## Recordatorio

11 de septiembre:
* Primer examen parcial
* Primer avance en repositorio remoto
	* Todas las pantallas  del  proyecto,  a  manera  de prototipo, en HTML y CSS
	* Validaciones en javascript
* Tareas atrasadas hasta el jueves 6 de septiembre hasta las 12:00pm

---

## Qué es Java

* Lenguaje orientado a objetos
* Objetos son clases
* Clases son "instructivos"
* Todo es una clase

---

### Ejemplo :cookie:

* La receta es la **clase**
* Los ingredientes son los **atributos**
* Los pasos son los **métodos**
* La galleta es la **instancia**

```java
public class Galleta {
  float gramosHarina;
  int huevos;
  float mililitrosLeche;
  int cucharadasAzucar;
  
  void MezclarIngredientes(){}
  void Hornear(){}
}

Galleta g = new Galleta();
```

---

## Instalación de Netbeans

1. Entrar a https://netbeans.org/downloads/
2. Descargar IDE completo (columna derecha)
3. Next, Next, Next, ..., Install

---

## Instalación JDK (consola)

1. Entrar a http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. Elegir versión SE a descargar (8 es estable)
3. Descargar archivo del sistema operativo

---

## Estructura mínima programa

```java
// Main.java
// Todo debe estar dentro de una clase
// El archivo debe llevar nombre de la clase
public class Main { // public: Cualquiera puede acceder
  // static: Sin instancia
  public static void main(String[] args) { // Inicio
    System.out.println("Imiprime en consola esta línea");
  }
}
```

---

## Ejecutar un programa desde NetBeans

1. Abrir NetBeans
* Si hay error de apertura [ * ](https://stackoverflow.com/questions/46476470/cant-create-project-on-netbeans-8-2)
2. File > Create new project
3. Java > Java application > Next
4. Asignar nombre, ubicación, clase main
5. Finish
6. Hacer código
7. Run > Run project

---

## Ejecutar un programa desde consola

```
rem Compilar el programa
javac Main.java

rem Ejecutar el programa
java Main
```

---

## Tipos de datos

```java
byte b = 1; // 1 byte

short corto = 1; // 2 bytes

int = entero = 1; // 4 bytes

long largo = 1; // 8 bytes

float flotante = 1; // 4 bytes

double doble = 1; // 8 bytes

char caracter = 1; // 2 bytes

boolean booleano = 1; // 1 byte

// No primitivo
String cadena = new String("1"); // Con constructor

String otraCadena = "1"; // Es lo mismo
```

---

## Operadores matemáticos

```java
int a = 3;
int b = 4;
int c;

c = a + b;

c = a - b;

c = a * b;

c = a / b;

c = a % b;
```

---

## Operadores relacionales entre primitivos

```java
int a = 5;
int b = 7;
boolean c;

c = a < b;

c = a > b;

c = a <= b;

c = a >= b;

c = a == b;

c = a != b;
```

---

## Operadores relacionales con objetos

```java
String s1 = new String("s");
String s2 = "s";
boolean c;

c = s1 == s2; // Falso; son diferentes objetos

c = s1.equals(s2); // Verdadero; tienen el mismo valor
```

---

## Operadores lógicos

```java
boolean a = true;
boolean b = false;
boolean c;

c = a && b;

c = a || b;
```

---

## Condicionales

```java
boolean a = true;
boolean b = false;

if (a){ // Si a es verdadero
  // a es verdadero
} else if (b) { // Si no; si b es verdadero
  // a es falso y b verdadero
} else { // Si no
  // a y b son falsas
}

// Ejemplo
if (1 == 1)
  a = true;
else
  a = false;

// Es lo mismo
a = 1 == 1 ? true : false;
```

---

## Arreglos

```java
// Los arreglos también son objetos D:

int[] arreglo1; // Arreglo de extensión no definida

arreglo1 = new int[5]; // Arreglo de 10 elementos enteros

// Declaración y definición
int[] arreglo2 = new int[5];

// Declaración y definición de elementos
int[] arreglo3 = {1, 2, 3, 4, 5};

arreglo1.length; // Devuelve la cantidad de elementos
```

---

## Ciclos

```java
for (int i = 0; i < 3; i++) {}

// Equivalente a 

for (;i < 3;) {}

int i = 0;
while (i < 3) {i++;}

i = 0;
do {
  i++;
} while(i < 3);

int[] enteros = {0, 1, 2};
for (int e : enteros){}

// break: Rompre el ciclo
// continue: Continúa con la siguiente iteración
```

---

## Lectura de datos

```java
import java.util.Scanner;

// [...]

Scanner scanner = new Scanner(System.in);
int a;
String s;

System.out.println("Ingresa un número:");
a = scanner.nextInt();
scanner.nextLine(); // Necesario para evitar saltar línea

System.out.println("Ingresa un texto:");
s = scanner.nextLine();
```

---

## Funciones y variables globales

```java
public class Main(){

  // tipoDato nombre;

  public static main(){
    // Llamada a funciones
    SinArgumentos();
    ConArgumentos();
  }
  
  public static void SinArgumentos(){}
  
  public static int ConArgumentos(int a, int b){
    return a + b;
  }
}
```

---

## Correr un programa con argumentos

```java
// Argumentos.java
public class Argumentos(){
  public static void main(String[] args){
    for (;i < args.length;){
      System.out.println(args[i]);
    }
  }
}
```

```
rem Compilar
javac Argumentos.java

rem Ejecutar
java Argumentos arg0 arg1 arg2 ...
```

---

## Ejemplo

* Visita a una cueva

## :warning: Tarea 9 :warning:
###### +2 en primer parcial

* Subir un archivo `java` que consista en un piedra, papel o tijeras; o
* Subir un archivo `java` que consista en la visita de tu casa

---

## Fuentes

* https://www.learnjavaonline.org/
* https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html