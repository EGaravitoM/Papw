<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 5. Formularios HTML

---

## Observaciones tarea

* 6725: Tarea 4 incluía Tarea 3
* 2024: No cambiar de [repositorio](https://bitbucket.org/gilcereyna/papw1/src/master/)

---

## Etiquetas `form` e `input`

```html
<form action="destino.php"> <!-- Entorno de formulario -->
  <input> <!-- Elemento de entrada; Cuadro de texto -->
  
  Entrada de texto: <input type="text" name="ejemplo">
  
  <input type="submit" value="Enviar">
  <input type="reset" value="Borrar">
</form>
```

---

## `method="get|post"`

```html
<form action="destino.php" method="get">
  
  Envía esto desde url:
  <input type="text" name="ejemplo">
  
  Limitado a 3000 caracteres :o
</form>
```

```html
<form action="destino.php" method="post">
  
  Envía esto de manera oculta:
  <input type="text" name="ejemplo">
  
  Sin límite en el tamaño de envío
</form>
```
¿Cuándo usar cada método?

---

## `fieldset`

```html
<form action="destino.php">
  
  <fieldset>
    
    <legend>Grupo de datos</legend>
    
    Dato1: <input type="text" name="dato1">
    
    Dato2: <input type="text" name="dato2">
  
  </fieldset>

</form>
```

---

## Tipos de `input` (I)

```html
<form>
  Texto: <input type="text">
  Correo-e: <input type="email">
  Contraseña: <input type="password">
  
  <input type="radio" name="d1" value="v1"> Val1<br>
  <input type="radio" name="d1" value="v2"> Val2<br>
  
  <input type="checkbox" name="d2" value="v1"> Val1<br>
  <input type="checkbox" name="d2" value="v2"> Val2<br>
  
  <input type="button" onclick="Funcion()" value="Clic">
  
  <input type="submit" value="Enviar">
  <input type="reset" value="Borrar">
</form>
```

---

## Tipos de `input` (II)

```html
<form>
  Color: <input type="color">
  
  Fecha: <input type="date">
  Fecha y hora: <input type="datetime-local">
  Tiempo: <input type="time">
  Mes: <input type="month">
  Semana: <input type="week">
  
  Número: <input type="number" min="1" max="5">
  
  Búsqueda: <input type="search">
  URL: <input type="url">
  
  Archivos: <input type="file">
  
  <input type="submit" value="Enviar">
  <input type="reset" value="Borrar">
</form>
```

---

## Tipos de `input` (III)

```html
<form id="form1">
  <textarea form="form1" name="val1">
    Área de texto
  </textarea>
  
  <select name="select1">
    <option value="val1">Val1</option>
    <option value="val2">Val2</option>
  </select>
  
  <input type="submit" value="Enviar">
  <input type="reset" value="Borrar">
</form>
```

---

## Atributos para `input`

```html
<form action="destion.php">
  <input type="text" name="var1" value="Valor desplegado">
  
  <input type="text" name="var2" placeholder="Explicación">
  
  <input value="Requerido" required>
  <input value="Sólo lectura" readonly>
  <input value="Deshabilitado" disabled>
  
  <input value="Empezar aquí" autofocus>
  
  <input value="Otro destino" formaction="destino2.php">
</form>
```

---

## :warning: Tarea 5 :warning:
###### +2 en primer examen parcial

* Hacer una página de registro de usuario en la que se usen la mayoría de los `input` vistos.
* Subir la página en una carpeta llamada **Tarea 5** o **Proyecto final** con un mensaje en el commit que comience con **Tarea 5**

---

## Fuentes

* https://www.w3schools.com/html/html_forms.asp