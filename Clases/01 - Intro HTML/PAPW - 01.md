<!-- $theme: default -->

PAPW
===

##### Alberto Benavides
###### Ago - Dic 2018

<!-- footer: Universidad Autónoma de Nuevo León | Facultad de Ciencias Físico Matemáticas | Multimedia y Animación Digital -->

---

# 1. Introducción HTML

---

## ¿Qué es HTML?

* HyperText Markup Language 
 	(Lenguaje de marcado de hipertexto)

* Lenguaje de formato de texto (elementos)
	No un lenguaje de programación

---

## Elementos HMTL

```html
<p>Este es un párrafo.</p>

<!-- Estructura de un elemento con contenido -->
<etiqueta>Contenido</etiqueta>
```
---

## Elementos anidados

```html
<p>Este párrafo termina en <i>cursiva</i>.</p>


<p>Aquí hay elementos <i>mal </p> anidados. </i>
```

---

## Elementos vacíos y atributos

```html
<img src=“url.jpg">

<etiqueta atributo="valor">

<etiqueta atributo='valor'>

<etiqueta atributo=valor>
```

---

## Estructura mínima de un documento HTML

```html
<!DOCTYPE html> <!-- Tipo de documento; histórico -->
<html> <!-- Inicio del documento HTML -->
  <head> <!-- Cabecera; parámetros del documento -->
	<meta charset="utf-8"> <!-- Codificación -->
	<title>Título de la página</title>
  </head> 
  <body> <!-- Cuerpo; todo lo mostrado al usuario -->
	<p>Esta es mi primera página web.</p>
  </body>
</html>
```

---

## Programas recomendados

#### Editor de texto
1. [Visual Studio Code](https://code.visualstudio.com/)
2. [Atom](https://atom.io/)
3. [Notepad++](https://notepad-plus-plus.org/download/v7.5.8.html)
4. [Sublime Text](https://www.sublimetext.com/)

#### Navegador
* [Chrome](https://www.google.com/chrome/)
* [Mozilla](https://www.mozilla.org/es-MX/firefox/new/)
* [Opera](https://www.opera.com/es-419)

---

## Ejemplo

* Crear una página HTML con contenido mínimo.
* Crear un repositorio y agregar un commit con el trabajo realizado.
* Publicar el repositorio en un repositorio remoto.

Sugerencia:
* Usar [Git](https://www.atlassian.com/git/tutorials/what-is-version-control).
* Usar [Sourcetree](https://sourcetree.com/).

---

## Instalación de Git

Git | :star: Sourcetree
---|---
1. Bajar e instalar [Git](https://gitforwindows.org/)| 1. Bajar e instalar [Sourcetree](https://www.sourcetreeapp.com/)
2. Abrir terminal | 2. Abrir Sourcetree
3. Insertar código  :small_red_triangle_down: | 3. Tools>Options>General


```git
git config --global user.name "Nombre Apellido" 

git config --global user.email usuario@correo.com
```

---

## Instrucciones esenciales de Git

```git
rem Inicia un repositorio
git init

rem Prepara un directorio
git add <directorio>

rem Crea un commit (instantánea)
git commit -m "Mensaje"

rem Añade la url como remoto
git remote add <nombre> <url>

rem Envía actualizaciones a un remoto
git push <remoto> <rama>
```

---

## :warning: Tarea :warning:
###### +2 en primer examen parcial

* Dentro de una carpeta llamada "Tarea 1", hacer una página HTML con título "Perfil" y con un párrafo que diga “Hola mundo, soy [nombre].”.
* Crear un repositorio público para esta clase e incluir dicha carpeta.
* Enviar el vínculo de GitHub, Bitbucket o Sourceforge al correo jose.benavidesvz@uanl.edu.mx con asunto:

<center><i>PAPW Tarea 1 [Matrícula]</i></center>

---

# Fuentes

* https://developer.mozilla.org/es/docs/Learn/HTML/Introduccion_a_HTML/iniciar 
* https://www.w3.org/MarkUp/Guide/ 
* https://www.w3schools.com/html/html_intro.asp 

