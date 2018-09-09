<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 4. CSS avanzado

---

## Observaciones tarea (I)

```html
<html lang="en"> <!-- ¿Y luego en español? No, please -->
  
<!-- :c -->
<link rel="stylesheet" type:"text/css" href="style.css">

<!-- c: -->
<link rel="stylesheet" type="text/css" href="style.css">
  
<script src="main.js"></script> <!-- No hay main.js :'c -->
```

```css
/* :| */
h1{
text-align: center;
}

/* :> */
h1{
  text-align: center;
}
```

---

## Observaciones tarea (II)

7641 :star: [ * ](https://www.w3schools.com/cssref/sel_all.asp)
```css
/*Rule of thumb*/

*{  
    margin: 0px;
    padding: 0px;  
}
```

4306 :star: [ ** ](https://www.w3schools.com/cssref/pr_class_clear.asp)
```html
<!-- 
  Especifica que no se permiten elementos flotantes
  a la izquierda de este elemento
-->
<br style="clear: left">
```

---

## Observaciones tarea (III)
6725 :star:
```css
a:link{color: #3399ff; text-decoration: none;}
a:visited {color: #3399ff; text-decoration: none;}
a:hover{color: #1f2f6b; text-decoration: none;}
```

1811 :star:
```css
#elemento{
  border-style:solid;
  border-color:rgb(53, 53, 247);
  border-radius: 15px;
}
```
---

## Observaciones tarea (IV)

0813 :star:
```html
<marquee behavior="scroll" direction="right"> 
  -. Biografías en línea .- 
</marquee>
```

2027 :star: [ * ](https://www.w3schools.com/tags/tag_aside.asp)
```html
<aside>Podemos poner algo aparte si queremos</aside>
```

---

## Observaciones tarea (V)

6743 [:star:] [ * ](https://www.w3schools.com/css/css3_animations.asp)

```css
/* Código de animación */
@keyframes ejemplo {
    from {background-color: red;}
    to {background-color: yellow;}
}

/* Elemento al que se le aplicará */
div {
    width: 100px;
    height: 100px;
    background-color: red;
    animation-name: ejemplo; /* Nombre de la animación */
    animation-duration: 4s; /* Duración */
}
```

[*Persepolis*](https://goo.gl/8fzoBS), Marjane Satrapi

---

## Observaciones tarea (VI)

1108 :star: [ * ](https://www.w3schools.com/cssref/css3_pr_font-face_rule.asp)
```css
/* Especifica el nombre de una fuente y su ubicación */
@font-face {
  font-family: "Open Sans";
  src: url("fuentes/Open Sans.woff");
}
```

Google Fonts
```html
<link 
  href="https://fonts.googleapis.com/css?family=M+PLUS+1p" 
  rel="stylesheet">
```

```css
p{font-family: 'M PLUS 1p', sans-serif;}
```

---

## Recomendación (?)

5074 y 7543: Silvana Windrunner

<center><img src="https://vignette.wikia.nocookie.net/wowwiki/images/e/e3/SylvanasBfA.png/revision/latest/scale-to-width-down/349?cb=20171104004146"> <img src="https://steamuserimages-a.akamaihd.net/ugc/721995251315170169/B0920EC8DE007F0AE3376D2229E8BFC537661CE1/?interpolation=lanczos-none&output-format=jpeg&output-quality=95&fit=inside%7C268%3A268&composite-to=*,*%7C268%3A268&background-color=black" height="500px"></center>

---

## Modelo de cajas [ * ](https://www.w3schools.com/css/css_boxmodel.asp)

<center><img src="https://mdn.mozillademos.org/files/13647/box-model-standard-small.png" width="640px"></center>

---

## Modelo de cajas

```css
div {
    width: 300px;
    height: 200px;
    padding: 25px;
    border: 25px solid black;
    margin: 25px;
}
```

---

## Alineación de elementos

```css
.centrarEnPantalla {
  margin: auto;
  width: 50%; /* Ancho menor a 100%  */
  border: 3px solid black;
  padding: 10px;
}

.centrarTextoEnElemento {
  text-align: center;
  border: 3px solid black;
}
```

---

## Selectores combinados [ * ](https://www.w3schools.com/css/css_combinators.asp)

```css
div p{} /* Todos los p dentro de div en cualquier nivel */

div > p{} /* Todos los p hijos inmediatos de div */

div + p{} /* El p que siga de un div hermano */

div ~ p{} /* Todos los p hermanos de div */
```

---

## Menú vertical CSS [ * ](https://www.w3schools.com/css/css_navbar.asp)

```css
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 25%;
  height: 100%;
  position: fixed; /* Para dejarla fija a la izquierda */
  overflow: auto; /* Desborde con desplazamiento */
}

li a {
  display: block; /* Permite dar clic en toda el área */
  text-decoration: none;
}

li a:hover {
  background-color: #555;
  color: white;
}
```

---

## Menú horizontal CSS

```css
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  background-color: #f1f1f1; /* Color a todo el fondo */
  /* Pegada al desplazar: position: sticky; */
  /* Fija arriba */
  position: fixed; 
  top: 0; /* O abajo: bottom: 0 */
  width: 100%;
}

li { float: left;} /* Cada elemento flota a la izquierda */

li a {
  display: block;
  text-align: center;
  padding: 14px 16px;
}
```

---

## Menú vertical HTML

```html
<ul>
  <li><a href="#home">Inicio</a></li>
  <li><a href="#news">Servicios</a></li>
  <li><a href="#contact">Nosotros</a></li>
  <li><a href="#about">Contacto</a></li>
  <!-- ¿Cómo colocar a la derecha en menú horizontal? -->
</ul>
```

---

## Dropdown CSS [ * ](https://www.w3schools.com/css/css_dropdowns.asp)

```css
.dropdown {
    position: relative;
    display: inline-block; /* Ajusta el contenido */
}

.dropdown-content {
    display: none; /* Oculta el contenido */
    position: absolute;
    min-width: 200%; /* Doble del ancho del padre */
    z-index: 1; /* Se muestra por encima */
}

.dropdown:hover .dropdown-content {
    display: block;
}
```

---

## Dropdown HTML

```html
<div class="dropdown">
  <span>Pasa el <i>mouse</i></span>
  <div class="dropdown-content">
    <p>¡Hola!</p>
  </div>
</div>
```

---

## Recursos recomendados

* [Bootstrap](http://getbootstrap.com/)
* [Materialize](https://materializecss.com/)
* [Flat UI](http://designmodo.github.io/Flat-UI/)
* [JQuery UI](https://jqueryui.com/)
* [Animate.css](https://daneden.github.io/animate.css/) :star:
* [Font Awesome Free](https://fontawesome.com/free)

<hr>

## Recomendación

* [UI-Patterns](http://ui-patterns.com/)
* [CSS-Tricks](https://css-tricks.com/)

---

## :warning: Tarea :warning:
###### +2 en primer examen parcial

* Crear una página HTML con barra de navegación superior o lateral en la que aparezcan las categorías de dicha página (Por ejemplo: Inicio, Proyectos, Ventas...)
* Una de las categorías debe ser **Perfil** y estar vinculada con la página de perfil de la Tarea 3.
* La página de perfil debe incluir una tabla cuyas filas impares tengan un estilo diferente a las pares ([referencia](https://www.w3schools.com/howto/howto_css_table_zebra.asp))
* Subir al repositorio dentro de una carpeta llamada Tarea 4.

---

6312: Revisar problemas de creación de repo