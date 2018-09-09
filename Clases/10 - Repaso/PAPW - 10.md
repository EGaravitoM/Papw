<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 10. Repaso

---

## :warning: Tarea 10 :warning:
###### 8 a 10 correctas: +2 en primer parcial
###### 5 a 7 correctas: +1 en primer parcial

* Poner los últimos 4 dígitos de la matrícula en una hoja en blanco
* Realizar las actividades especificadas en las siguientes diapositivas

---

## 1. Añade las etiquetas que faltan en las líneas marcadas por incisos para completar la estructura mínima de un documento `HTML`

```html
<!DOCTYPE html>
<html>
  <!-- a) -->
	<meta charset="utf-8">
	<title>Título de la página</title>
  </head> 
  <body>
	<p>Esta es mi primera página web.</p>
  <!-- b) -->
<!-- c) -->
```

---

## 2. Escribe la etiqueta necesaria para agregar el archivo `estilo.css` a un documento `HTML`

---

## 3. Escribe la etiqueta necesaria para agregar el archivo `app.js` a un documento `HTML`

---

## 4. ¿Qué elementos selecciona este selector `CSS`?

```css
ol, ul, p .clase, h1 #primerRojo{}
```

---

## 5. Menciona tres separaciones del modelo de cajas usado por los elementos `HTML`

---

## 6. Añade las etiquetas que faltan en las líneas marcadas por incisos para completar un registro de usuario

```html
<form>
  Texto: <input type="text">
  Correo-e: <input type="a)">
  Contraseña: <input type="b)">
  
  <input type="c)" value="Enviar">
  <input type="reset" value="Borrar">
</form>
```

---

## 7. ¿Qué hace esta función de `JQuery`?

```javascript
$(document).ready(function(){
   $(".ejemplo").click(function(){
     $(this).css("background-color", "lightgray");
   });
});
```

---

## 8. ¿Qué hace esta función de `JQuery`?

```javascript
$(document).ready(function(){
   $("#sel1").click(
     $("#sel2").attr("class", "ejemplo");
   );
});
```

---

## 9. ¿Cuál es el error de este programa?

```java
// main.java
public class Main {
  public static void main() {
    System.out.println("¿Qué me pasa?");
  }
}
```
---

## 10. ¿Qué valores deben tomar las variables marcadas por incisos en el siguiente programa para que la función devuelva `Fin`?

```javascript
function EsElFin(var d){
  var b = 0; // b)
  var c = 0; // c;
  var s = ["Fue", "imposible", "examen"];
  return s[0][d] + s[b][0] + s[2][c];
}

var a = 0; // a)

EsElFin(a);
```