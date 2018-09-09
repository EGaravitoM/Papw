<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 8. jQuery

---

## :warning: Tarea 7 (recuperación) :warning:
###### Sólo para asistentes de la clase pasada
###### +1 en Tarea 7 (máximo 2)
###### Fecha máxima: viernes 31 de agosto, 11:00 am

* Subir un archivo llamado `tarea7.md` al repositorio que contenga las respuestas correctas de la **Tarea 7**. 
* Incluir en dicho archivo una función en `javascript` que imprima en la consola alguna salida que dependa de operaciones aritméticas, lógicas o índices en arreglos de caracteres. (Programas 90% similares tendrán 0 puntos en Tarea 7)
* Utilizar formato [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) para el archivo.

---

## Introducción `jQuery`

* Librería de `javascript`
> "Write less, do more" ([jQuery tutorial](https://www.w3schools.com/jquery/jquery_intro.asp))

---

## Instalación

* Descargar la librería de [producción](https://code.jquery.com/jquery-3.3.1.min.js)
* Añadirla como archivo externo en `html`
* La fuente puede provenir de un repositorio remoto (p. e. Google)

```html
<head>
  <script src="jquery-3.3.1.min.js"></script>
</head>
```

---

## Estructura básica

```javascript
// $(selector).acción()

// Elemento más utilizado
$(document).ready(function(){
   // Se ejecuta esta función
   // cuando el documento está listo
});

// Equivalente a la función anterior
$(function(){
   // Contenido a ejecutar
});
```

---

## Selectores

```javascript
// Todos los párrafos
$("p")

// Todos los vínculos dentro de elementos de lista
$("li a")

// Elemento con id identificador
$("#identificador")

// Elemento con clase clase
$(".clase")

// Todos los párrafos con clase ejemplo
$("p.ejemplo")

// El primer elemento de cualquier lista desordenada
$("ul li:first")
```

---

## Eventos

```javascript
$(".ejemplo").click();

$(".ejemplo").dblclick();

$(".ejemplo").mouseenter();

$(".ejemplo").mouseleave();

$(".ejemplo").hover();

$("input").focus(); // Cuando se selecciona un input

$("input").blur(); // Cuando se deselecciona un input
```

---

## Combinación de eventos. Método `on()`

```javascript
// Se utiliza para agrupar eventos para un selector
$("p").on({
  mouseenter: function(){
    $(this).css("background-color", "lightgray");
  }, 
  mouseleave: function(){
    $(this).css("background-color", "lightblue");
  }, 
  click: function(){
    $(this).css("background-color", "yellow");
  } 
});
```

---

## Obterner valores

```javascript
$("#sel1").click(
  console.log($("#sel2").text()); // innerHTML
  
  console.log($("#sel2").html()); // outerHTML
  
  console.log($("#sel3").val()); // value
  
  // Devuelve el valor del atributo especificado
  console.log($("#sel3").attr("type"));
);
```
---

## Establecer valores

```javascript
$("#sel1").click(
  $("#sel2").text("Contenido");
  
  $("#sel2").html("<p>Ejemplo</p>");
  
  $("#sel3").val("valor");
  
  // Devuelve el valor del atributo especificado
  $("#sel3").attr("type", "radio");
);
```

Combinación
```javascript
$("#sel1").click(function(){
    $("#vinculo").attr({
        "href" : "www.google.com/",
        "title" : "Google"
    });
});
```

---

## Añadir

```javascript
$("p").append("Agrega al final del contenido.");

$("p").prepend("Agrega al inicio del contenido.");

$("p").after("Agrega después del elemento.");

$("p").before("Agrega antes del elemento.");

var t1 = "Agrega";
var t2 = "todos";
var t3 = "juntos";

$("p").append(t1, t2, t3);

var e1 = $("<i></i>").text("Crea cursivas");

var e2 = document.createElement("b");
txt3.innerHTML = "Crea negritas";

$("#sel1").before(e1, e2); // Añádelas después de #sel1
```

---

## Eliminar

```javascript
$("#remover").remove(); // Remueve al elemento y sus hijos

$("#vaciar").empty(); // Remueve los hijos de un elemento

// Remueve párrafos de clase removidos
$("p").remove(".removidos");
```

---

## `ajax`

* **A**synchronous **J**avaScript **a**nd **X**ML.
* Cargar datos de manera asíncrona (sin que se note)

```javascript
// Sin jQuery
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      var e = document.getElementById("ejemplo");
      e.innerHtml = this.responseText;
    }
  };
  xhttp.open("GET", "destino.php", true);
  xhttp.send();
}
```

```javascript
// Con jQuery
$(".ejemplo").load("destino.php");
```

---

## `get` y `post`

```javascript
// $.get(url, datos, funciónFinal);
$.get("destino.php", function(data, status){
  console.log("Datos: " + data);
  console.log("Estado: " + status);
});

// $.post(url, datos, funciónFinal);
$.post("destino.php",
  {
    llave : "valor",
    otraLlave : "otroValor"
  },
  function(data, status){
  	console.log("Datos: " + data);
  	console.log("Estado: " + status);
});
```

---

## :warning: Tarea 8 :warning:

* Actualizar (o hacer) la página de la Tarea 6 para que realice todas las instrucciones con `jQuery`

## Fuentes

* https://www.w3schools.com/jquery/jquery_intro.asp)
* https://jquery.com/