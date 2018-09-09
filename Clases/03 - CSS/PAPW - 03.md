<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 3. CSS

---

## ¿Qué es CSS?

* **CSS**: **C**ascading **S**tyle **S**heets
* Hojas de estilo en cascada
* Controlan el diseño de un sitio web
* Se pueden replicar a distintos elementos 

---

## Sintaxis de CSS

```css
selector{
  propiedad: valor;
  otraPropiedad: otroValor;
}
```

```css
body{
  background-color: blue; /* Color de fondo azul */
  font-size: 18px; /* Tamaño de fuente de 18 pixeles */
}

p{
  color: red; /* Color de texto rojo */
  font-family: Arial; /* Texto con fuente Arial */
}
```

---

## Insertar CSS
1. Archivo externo vinculado por etiqueta `<link>` dentro de `<head>`
2. Etiqueta `<style>` dentro de `<head>`
3. Atributo `style` en elemento HTML

---

## Insertar CSS. Archivo externo :star:

1. Crear archivo `nombre.css`
2. Establecer reglas de estilo y guardar

```css
body{
  background-color: green;
}
```
3. Añadir etiqueta `<link>` en documento HTML y guardar

```html
<head>
  <link rel="stylesheet" type="text/css" href="nombre.css">
</head>
```

4. Actualizar, `F5`

---

## Insertar CSS. Etiqueta `<style>`

1. Añadir etiqueta `<style>` con reglas de estilo en documento HTML

```html
<head>
  <style>
    body{
      background-color: green;
    }
  </style>
</head>
```

2. Guardar

3. Actualizar, `F5`

---

## Insertar CSS. Atributo `style`

1. Añadir atributo `style` al elemento deseado

```html
<body style="background-color: green;">
```

2. Guardar

3. Actualizar, `F5`

---

## Selectores de etiquetas

* Seleccionan todos los elementos pertenecientes a la etiqueta especificada

```css
body{}

h1{}

p{}

ul{}

li{}

table{}

img{}

[...]
```

---

## Atributo y selector `id`
* El atributo `id` permite identificar elementos de manera única

```html
<h1 id="principal">Título principal</h1>

<li id="esencial">Elemento esencial</li>
```

* El selector `id` corresponde al `#`

```css
/* Selecciona el elemento con id="principal" */
#principal{
  font-style: italic; /* Texto en cursiva */
}

/* Selecciona el elemento con id="esencial" */
#esencial{
  font-variant: small-caps; /* Pequeñas mayúsculas */
}
```

---

## Atributo y selector `class`
* El atributo `class` permite agrupar elementos por un nombre

```html
<h1 class="subrayado">Título subrayado</h1>

<p class="subrayado negritas">
  Varias clases separadas por espacios en blanco.
</p>
```

* El selector `class` corresponde al `.`

```css
/* Selecciona todos los elementos con class="subrayado" */
.subrayado{
  text-decoration: underline; /* Texto subrayado */
}

.negritas{
  font-weight: bold; /* Texto en negritas */
}
```

---

## Agrupar selectores

* Selectores con mismos estilos pueden agruparse mediante `,`

```css
p{
  text-align: center;
}

h1{
  text-align: center;
}

.rojo{
  text-align: center;
}
```

```css
p, h1, .rojo{
  text-align: center;
}
```

---

## Propiedades CSS para texto (I)

```css
.ejemplo{
  color: red;
  color: #00ff00;
  color: rgb(0,0,255);
  
  font-size: 15px;
  font-size: large;
  font-size: 150%;
  
  font-style: normal;
  font-style: italic;
  font-style: oblique;
}
```

---

## Propiedades CSS para texto (II)

```css
.ejemplo{
  font-weight: normal;
  font-weight: bold;
  font-weight: 900;
  
  /* https://fonts.google.com/ */
  font-family: "Times New Roman", Times, serif;
  font-family: Arial, Helvetica, sans-serif;
  
  text-align: center;
  text-align: left;
  text-align: right;
  
  font-variant: small-caps;
}
```

---

## Propiedades CSS para texto (III)

```css
.ejemplo{
  text-decoration: overline;
  text-decoration: line-through;
  text-decoration: underline;
  
  text-transform: uppercase;
  text-transform: lowercase;
  text-transform: capitalize;
  
  /* https://www.w3schools.com/cssref/css_units.asp */
  text-indent: 50px; /* 50 pixeles */
  text-indent: 2em; /* Relativo al tamaño del elemento */
  text-indent: 30%; /* Relativo al tamaño del padre */
}
```

---

## Valores de colores para CSS

```css
.ejemplo{
  /* https://www.w3schools.com/colors/colors_names.asp */
  background-color: blue;
  
  /* 
  https://www.w3schools.com/cssref/css_colors_legal.asp 
  */
  background-color: #ff0000;
  background-color: rgb(255, 0, 0);
  background-color: rgba(255, 0, 0, 0.3);
  background-color: hsl(120, 100%, 50%);
  background-color: hsla(120, 100%, 50%, 0.3);
}
```

---

## Jerarquía de estilo (más interno a más externo)
1. Atributo `style`
2. CSS interno o externo (Los elementos más inferiores tienen preferencia sobre los superiores)
3. Estilo predefinido por el navegador

---

## Ejemplo

* Página de perfil con estilo


## :warning: Tarea :warning:
###### +2 en primer examen parcial

* Crear una carpeta llamada Tarea 3 en el repositorio.
* Copiar (o hacer) el archivo HTML de la Tarea 2 en dicha carpeta
* Crear una hoja de estilo que modifique (de la manera más estética posible) los estilos de dicho archivo HTML
* Integrar la hoja de estilo creada en el archivo HTML mediante etiqueta `<link>`
* Publicar la carpeta en el repositorio

---

# Fuentes

* https://www.w3schools.com/css/default.asp
* https://www.w3.org/Style/Examples/011/firstcss.es.html