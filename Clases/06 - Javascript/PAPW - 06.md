<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 6. Javascript

---

## Tipos de datos :heart:

```javascript
var a; // undefined

var entero = 3; // Number

var flotante = 3.0; // Number

var texto = "Hola"; String

var nula = null; // Equivalente a 0 en operaciones
```

Para imprimir en consola
```javascript
console.log(
  "f12 o ctrl + mayus + i \ 
  abren la consola en Chrome"
); 
```

---

## Conversión entre tipos de datos

```javascript
var combinado = "Tengo " + 31 + " años.";

var cadena = "7" + 3 // 73

var suma = +"7" + 3 // 10

var textoEntero = parseInt("4")

var textoFlotante = parseFloat("4.5")
```

Convierte a decimal $101_ 2$ y $\text{F}_ {16}$.
```javascript
var aDecimal = parseInt("101", 2)

var aDecimal = parseInt("F", 16)
```

---

## Operadores

```javascript
var a = 3;

var b = 4;

var c = a + b;
c = a - b;
c = a * b;
c = a / b;

c++;
c += 1;

c = a == b; // Mismo valor
c = a != b; // Valor distinto

c = a === b; // Mismos valor y tipo de dato
c = a !== b; // Distintos valor o tipo de dato
```

---

## Funciones

```javascript
function SumaDos(a, b){
  var suma = a + b;
  return suma;
}

function Promedio() {
    var suma = 0;
    for (var i = 0, i < arguments.length; i++) {
        suma += arguments[i];
    }
    return suma / arguments.length;
}
```

---

## Condiciones

```javascript
var a = 3;
if (a == 2) {
  a += 3;
} else if (a < 5) {
  a = 10;
} else {
  console.log(a);
}
```

---

## Ciclos

```javascript
var a = 0;
while (a < 3) {
  console.log(a);
  a++;
}

for(var i = 0; i < 3; i++){
  console.log(i);
}

var b = 0;
do {
  console.log(b);
  b++;
} while (b < 3)
```

---

## Arreglos :dog: :cat:

```javascript
var mascotas = new Array();
mascotas[0] = "Pita";
mascotas.push("Toto");
mascotas[2] = "Coqueta";
mascotas.push("Pinto");

for(var i = 0; i < mascotas.length; i++){
  alimentar(mascotas[i]);
}

for(mascota in mascotas){
  querer(mascota);
}
```

---

## Condiciones de corto circuito :heart:

```javascript
// Si existe un usuario, obtener su nombre
var name = u && u.getName();

// Si no hay asignado un nombre; poner uno por defecto
name = name || "Anónimo";

// Si el nombre es anónimo, no es usuario; lo es
var isUser = (name === "Anónimo") ? false : true;

var a = 1;
switch(a) {
  case 1:
    unaCosa(); // De aquí sigue al 2
  case 2:
    otra();
    break;
  default:
    nada();
}
```

---

## Objetos

```javascript
// Crear un objeto vacío
var o1 = Object();
var o2 = {};

// Crear un usuario (JSON)
var u = {
  id : 1373079,
  nombre : "Alberto",
  apellido : "Benavides",
  lenguajes : {
    cpp : "90",
    java : "85",
    lens : "75"
  }
}

u.lenguajes.java; // 85
```

---

## Prototipos (clases)

```javascript
function Usuario(id, nombre){
  this.id = id;
  this.nombre = nombre;
}

var yo = new Usuario(1373079, "Alberto");

var n = yo.nombre;
var mat = yo["id"];

console.log(n);
```

---

## DOM

* Document Object Module
* Cada elemento HTML es un objeto
* Funciones principales
	* `alert("Muestra una alerta en pantalla");`
	* `console.log("Muestra un mensaje en la consola");`
	* `document.GetElementById("nombreId");`: Obtiene el objeto que lleva por `id` `nombreId`
	* `nombreId`: Equivalente a la instrucción anterior

---

## Atributos

```javascript
var e = document.GetElementById("elemento");

e.innerHTML; // Contenido del objeto

e.outerHTML; // HTML del elemento; modificarlo lo reemplaza

e.value; // Valor de inputs en formularios
```

---

## Ejemplo

* Hacer un programa que asigna a cada alumno un ejercicio entre:
	1. Calcular la suma $S$ de los $n$ primeros números naturales consecutivos: $S = \frac{n \cdot (n + 1)}{2}$
	2. Calcular diagonales $D$ de un polígono de $n$ lados: $D = \frac{n \cdot (n - 3)}{2}$
	3. Calcular el valor de cada ángulo $\alpha$ de un polígono regular de $n$ lados: $\alpha = \frac{180 \cdot (n - 2)}{n}$
* Hacer una página que calcula la suma de los ángulos internos $S$ de un polígono de $n$ lados: $S = 180 \cdot (n - 2)$

---


## :warning: Tarea 6 :warning:
###### +2 en primer examen parcial

* Hacer una página web que resuelva el problema asignado pidiendo la variable mediante un `input`, resolviendo la operación en `javascript` y muestre el resultado en pantalla
* Subir en el repositorio en una carpeta llamada **Tarea 6**

---

## Fuentes

* https://www.w3schools.com/js/
* https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Introducci%C3%B3n
* https://developer.mozilla.org/es/docs/Web/JavaScript/Una_re-introducci%C3%B3n_a_JavaScript
* https://javascript.info/