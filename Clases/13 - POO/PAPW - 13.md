<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 12. Introducción a POO

---

## POO

* **P**rogramación **O**rientada a **O**bjetos
* Clases como Cajas. Encapsulan:
	* Propiedades estáticas (atributos)
	* Compotamientos dinámicos (métodos)
* Instancia: Objeto de un tipo de clase

---

## Creación de clases e instancias; atributos

```java
public class PoligonoRegular{
  public String nombre;
  public int lados;
  public float longitud;
  // final siempre declarado
  public final double PI = 3.1415926;
}

PoligonoRegular t1 = new PoligonoRegular();
t1.nombre = "Triángulo equilátero";
t1.lados = 3;
t1.longitud = 1.0;

PoligonoRegular c1;
c1 = new PoligonoRegular();
c1.nombre = "Cuadrado";
c1.lados = 4;
c1.longitud = 1.0;

```

---

## Métodos, *getters*, *setters*, *this*

```java
public class PoligonoRegular{
  public String nombre;
  int lados; // privados si no se especifica
  private float longitud;
  
  // Getters y Setters (métodos)
  public void SetLados(int n){
    lados = n;
  }
  public int GetLados(){
    return lados;
  }
  public void SetLongitud(float longitud){
    this.longitud = longitud;
  }
  public float GetLongitud(){
    return this.longitud;
  }
}

```

---

## Constructores, sobrecarga

* Sólo haz variables públicas si hay una buena razón.

```java
public class PoligonoRegular{
  private String nombre;
  private int lados;
  private float longitud;
  
  public PoligonoRegular(){ // Constructor
    this.nombre = "Triángulo";
    this.lados = 3;
    this.longitud = 1.0;
  }
  // Sobrecarga
  public PoligonoRegular(int n, float l){
    this.lados = n;
    this.longitud = l;
  }
}

```

---

## Método `toString()`

```java
public class PoligonoRegular{
  private String nombre;
  private int lados;
  private float longitud;
  public PoligonoRegular(){
    nombre = "Pentágono";
    lados = 5;
    longitud = 1.0;
  }
  
  public String toString(){
    return nombre + " tiene " + lados +
      " de longitud " + longitud + ".";
  }
  
  PoligonoRegular c1 = new PoligonoRegular();
  System.out.println(c1.toString());
}

```

---

## Herencia

```java
public class Triangulo{
  public float a, b, c;
  public void SetLados(float a, float b, float c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
}

public class Equilatero extends Triangulo{
  public float h;
  public void SetLados(float a){
    this.a = a;
    this.b = a;
    this.c = a;
    
    this.h = Math.sqrt(c * c - a / 2 * a / 2);
  }
}
```

---

## Fuentes

* http://www.ntu.edu.sg/home/ehchua/programming/java/J3a_OOPBasics.html
* https://www.learnjavaonline.org/en/Inheritance
* https://www.tutorialspoint.com/java/number_sqrt.htm