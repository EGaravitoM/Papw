<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 2. Elementos HTML

---

## Observaciones tarea (I)

```html
<!-- :( -->
<html>
<head>
[...]
</head>
[...]
</html>

<!-- :) -->
<html>
    <head>
        [...]
    </head>
[...]
</html>
```

---

## Observaciones tarea (II)

```html
<!-- :( -->
<link rel="stylesheet" type="text/css" 
      media="screen" href="main.css" />
<script src="main.js"></script>

<!-- :) -->
<!-- Agregar hoja de estilo -->
<!-- Agregar javascript -->

<!-- Etiquetas vacías -->
<br> Es lo mismo que <br/>
```
---

## Observaciones tarea (III)

```html
<!-- :| -->
<Html>
  <HEAD>[...]</HEAD>
  [...]
</Html>

<!-- :) -->
<html>
  <head>[...]</head>
  [...]
</html>
```

---

## Observaciones tarea (IV)

* 7641: El archivo es extensión `.html`.
* 4873, 6725, 2024: Revisar el orden de carpetas de los compañeros. Es un repositorio para todas las tareas.
* 6312: Hacer público un repositorio en Bitbucket:
	* Desde la página del repositorio, dar clic en Settings.
	* En Repository details, desmarcar la casilla "This is a private repository".

---

## Encabezados y líneas horizontales

```html
<h1>Encabezado 1</h1>

<h2>Encabezado 2</h2>

<h3>Encabezado 3 sobre una línea</h3>

<hr> <!-- hr: Horizontal rule-->

<h4>Encabezado 4 bajo una línea</h4>

<h5>Encabezado 5</h5>

<h6>Encabezado 6</h6>
```

---

## Párrafos y saltos de línea

```html
<p>Un párrafo.</p>
<p>Otro párrafo.</p><p>Y otro más</p>

<p>Los      espacios    no      importan.</p>

<p>Ni 
los

saltos
de línea.</p>

<p>Aunque, después de esto <br> hay un salto de línea.</p>
```

---

## Etiqueta `pre`

```html
<p>
	Las rosas son rojas,
	las violetas azules,
	[...]
</p>

<pre>
	Las rosas son rojas,
	las violetas azules,
	[...]
</pre>
```

¿Cuál es la diferencia?

---

## Formato de texto

```html
<p>
    Estas palabras están 
    en <b>negritas</b>, 
    <i>cursivas</i>, 
    son <strong>importantes</strong>, 
    tienen <em>énfasis</em>, 
    aparecen <mark>subrayadas</mark>, 
    <small>pequeñas</small>, 
    <del>tachadas</del>, 
    muestran <ins>inserciones</ins> o 
    <sub>subíndices</sub> y 
    <sup>superíndices</sup>.
</p>
```

---

## [Código](https://websemantics.uk/articles/displaying-code-in-web-pages/) y [expresiones matemáticas](https://www.mathjax.org/)

```html
<code>int i = 0;</code>

<var>F = m &times; a</var>
```

$$\sum_{i=1}\frac{n!}{r!(n-r)!}^{n}{X_i^2}$$

---

## Hipervínculos

```html
<a href="https://www.google.com/">Google</a>

<!-- Estructura de un hipervínculo -->
<a href="url">Texto del enlace</a>


<a href="url" target="_blank">Abre en nueva pestaña</a>

<h2 id="ancla">Capítulo cualquiera</h2>

<a href="#ancla">Ir al Capítulo cualquiera</a>

```

---

## Imágenes y carpetas

```html
<img src="../carpeta/imagen.jpg" alt="Texto alternativo">

<p>
  Imagen a la derecha de 50*50 px
  <img src="url" alt="..." 
  style="float:right;width:50px;height:50px;">
</p>

```

---

## Listas

```html
<!-- disc, circle, square, none -->
<ul style="list-style-type:disc"> <!-- Lista sin orden -->
  <li>Un elemento</li>
  <li>Otro elemento</li>
  <li>Uno más</li>
</ul>


<!-- 1, A, a, I, i -->
<ol type="1" > <!-- Lista ordenada -->
  <li>Primero</li>
  <li>Segundo</li>
  <li>Tercero</li>
</ol>
```
¿Cómo hacer listas anidadas?

---

## Tablas

```html
<table> <!-- Inicio tabla -->
  <tr> <!-- Table row; Fila en la tabla -->
    <th>Nombre</th> <!-- Table heading -->
    <th>Apellido</th>
    <th>Edad</th>
  </tr>
  
  <tr>
    <td>Xavier</td> <!-- Table data -->
    <td>López</td>
    <td>83</td>
  </tr>
</table> <!-- Fin tabla -->

```
Recurso: https://www.tablesgenerator.com/html_tables 

---


## Bloques

```html
<div>
	Bloque de texto en nueva línea.
	<span>Bloque de texto en la misma línea</span>
</div>
```

---

## Ejemplo

Hacer una página HTML con todos los elementos antes vistos.

## :warning: Tarea :warning:
###### +2 en primer examen parcial

* Hacer una página de perfil en HTML con la información de perfil propia o de una celebridad, utilizando todos los elementos vistos. No se debe repetir persona.
* Subirla al repositorio en una carpeta llamada Tarea 2.


---

## Para saber más: [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

```md
# Encabezado 1
# Encabezado 2

Párrafo con *cursiva*, **negritas**, ~~tachados~~.

1. Lista
2. Numerada

* Lista
* No ordenada

[Vínculo a Google](www.google.com)

![Imagen](https://fakeimg.pl/150/)

`código`


```

---

# Fuentes

* https://developer.mozilla.org/es/docs/Learn/HTML/Introduccion_a_HTML/iniciar 
* https://www.w3.org/MarkUp/Guide/ 
* https://www.w3schools.com/html/html_intro.asp 