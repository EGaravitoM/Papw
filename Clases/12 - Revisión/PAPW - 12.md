<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 12. Revisión examen

---

* 8926, 8111: Pasar a hacer un repositorio local, crear un archivo, hacer un commt, hacer un repositorio remoto, hacer un push, clonarlo, modificarlo, hacer un cambio y hacer un push.

* 1326: Pregunta 3, es `margin` no ~~`marging`~~

---

## 1. Estructura `HTML`

```
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Web</title>
    <link href="public/estilo.css">
    <script src="app.js"></script>
  </head>
  <body>
    <p>Contenido.</p>
    <script>
      function LoQueSea(){
        var a = 0;
      }
    </script>
  </body>
</html>
```

---

## 2. Jerarquía de estilos

```
/* estilo.css */
.elem-p {color: blue;}
```

```
<!-- index.html -->
<head>
  <style type="text/css">
    #unContenedor p {backgroud-color: yellow;}
  </style>
  <link rel="stylesheet" href="estilo.css">
</head>
<body>
  <div id="unContenedor">
    <p class="elem-p" style="color: green">
      Estilo desconocido.
    </p>
  </div>
</body>
```

---

## 3. Modelo cajas

* Menciona las diferencias que hay entre el `padding` y el `margin` de un elemento `HTML` en el modelo de cajas.

`padding`: Espacio entre el contenido y el borde de un elemento `HTML`
`margin`: Espacio exteriordel borde de un elemento `HTML`

---

## 4. Funciones Javscript

```
function Misterio(var a, var b){
  var c = a * b;
  var d = // Falta para 20 de la potencia
  for (var i = 0; i < c; i++){ // Sumar la potencia
    d = d + 1;
  }  
  return d; 
}
var e = // Potencia
Misterio(e, e);
```

---

## 5. JQuery

```
$(document).ready(function(){
  $("ol li.ejemplo").on({
    mouseenter: function(){
      $(this).css("background-color", "lightgray");
    },
    // Se ejecuta al seleccionar un input
    focus: function(){
      alert("Has dado click"); 
    },
    click: function(){
      $("#salida").attr("value", "Valor1");
      $("#salida").val("Valor1");
    }
  });
});
```

---

## 6. Elemento anidadísimo

```html
div #noSoyDiv ul#listas li:first-child a:hover{}

<!-- 
Al pasar por encima el puntero de los enlaces
que sean hijos de los primeros elementos de lista
hijos de listas desordenadas con id listas
hijos de elementos con id noSoyDiv
hijos de cualquier div
-->
```

---

## 7. Formularios

```
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Formulario</title>
  </head>
  <body>
    <form action="destino.php" method="post">
      <input type="email" name="correo" 
      	placeholder="correo@ejemplo.com"><br>
      <input type="password" name="contra" 
      	placeholder="Clave"><br>
      <input type="submit">
    </form>
  </body>
</html>
```

---

## 8. `ajax`

Escribe la instrucción de \texttt{JQuery} necesaria
para cargar en un párrafo que lleve por \texttt{id} \texttt{receptor}
el contenido de la página \texttt{destino.php}.

```javascript
$("#receptor").load("destino.php");
```