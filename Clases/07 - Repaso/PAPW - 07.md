<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 7. Repaso

---

## Observaciones tarea
[6743](https://github.com/Deathmajorasmask/PAPW/blob/master/Tarea%206/Index.html): Me sigue :fearful:
```javascript
var n = document.getElementById("NumNat").value;

// Si n = 1;
var suma = (n * (n+1)) / 2; // Esto "une" n y 1: 11

// 7497:
var suma = (n * (+n+1)) / 2; // Esto suma n y 1: 2
```

```html
<!-- No añadir etiqueta de cierre de input -->
<input></input>
```

---

## Observaciones tarea (II)

[1811](https://bitbucket.org/JuanSalinas9k/juansalinasrepo/src/master/Tarea%206/): :star:
```html
<input type="number" id="iptN">
<input type="text" id="iptResult1">
<button onclick="NatNumCalc(iptN,iptResult1)">
```
```javascript
function NatNumCalc(sides,opt){...}
```

[1108](https://github.com/Gera1590/PAPW/tree/master/Tarea6): :computer:

* Jueves 30 ago:
  * Último día para subir tareas anteriores que cuenten puntos
  * Último día para subir repositorio.

---

## :warning: Tarea 7 :warning:
###### 8 a 10 correctos: +2 examen parcial 
###### 5 a 7 correctos: +1 examen parcial 

* Tomar una hoja en blanco
* Escribir los últimos 4 dígitos de la matrícula
* Realiza en la hoja las actividades señaladas

---

# 1. Escribe un ejemplo de un elemento `HTML` con un atributo y un valor

<!--
<img src="">
-->

---

# 2. En `HTML`, escribe un ejemplo de una lista (de cualquier tipo) con dos elementos

<!--
<ul>
  <li>ele1</li>
  <li>ele2</li>
</ul>
--->

---

# 3. Pon un ejemplo de un elemento en bloque y otro de un elemento en línea en `HTML`

<!--
<p>
<b>
-->

---

# 4. Escribe un ejemplo de un selector `CSS` que aplique a los elementos seleccionados al menos una propiedad de tu elección

<!--
selector{
  propiedad: valor;
}
-->

---

# 5. Escribe el selector `CSS` que incluye a todos los elementos dentro de cualquier lista ordenada
<!-- 
ol li{}
-->

---

# 6. Indica los elementos o acciones que representa cada selector marcado con incisos en el siguiente código `CSS`

```css
/* a) */
li a{}

/* b) */
a:hover{}

/* c) */
.dropdown {}
```

---

# 7. Escribe tres ejemplos de `input` de diferente tipo para un formulario `HTML`

---

# 8. Escribe el resultado de la variable `c` en cada línea marcada por un inciso

```javascript
var a = 3
var b = "4"
var c = null

c = a + b; // a) 34
c = b + b; // b) 44
c = b - b; // c) 0
c = +b + a; // d) 7
```

---

# 9. Escribe el valor que retorna la siguiente función cuando recibe como parámetro de entrada `5`

```javascript
function Misterio(a) {
  var b = 1;
  for (var i = 1, i <= a; i++) {
      b *= i;
  }
  return b;
}
```

---

## 10. Escribe las líneas que faltan en los lugares marcados con incisos para que el programa muestre el resultado del volumen $V$ de un cubo a partir de la arista $a$ en el elemento especificado

```javascript
function Volumen(){
  var ari = null;
  
  // a) Asignar a ari el valor del elemento con id arista
  
  var vol = // b) Operación para cálculo de volumen
  var e = document.getElementById("resultado");
  
  // c) Mostrar el volumen dentro del elemento e
}
```

$$V = a^3 = a \cdot a \cdot a$$