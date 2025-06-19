# 📚 Menú de Literatura - Java Spring Boot Challenge

Este proyecto es una aplicación de consola desarrollada en **Java** utilizando el framework **Spring Boot**, **Maven** como gestor de dependencias, **JPA (Hibernate)** para persistencia, y una base de datos **PostgreSQL**. 

Permite al usuario interactuar con un menú literario que integra búsqueda de libros desde una API externa, almacenamiento y consultas en base de datos.

---

## 🔧 Tecnologías Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## 🚀 Funcionalidades del Menú

El usuario puede ejecutar distintas acciones desde la consola:

1. 🔍 Buscar libro en la web (API externa)
2. 📚 Mostrar los libros guardados en la base de datos
3. 🔎 Buscar un libro por título (en la base de datos)
4. 📖 Listar todos los libros registrados
5. ✍️ Listar autores registrados
6. 🔥 Mostrar los 10 libros más descargados
7. 🌍 Buscar libros por idioma (Inglés, Español, Francés, etc.)
8. 🧓 Buscar autores vivos en un año específico
9. ⚰️ Mostrar los 5 autores con más años de fallecidos (A.C. y D.C.)
10. 👤 Buscar autor por nombre
0. 🚪 Salir de la aplicación

---

## 🗃️ Estructura de Datos

- **Libro**: título, autores, idioma, número de descargas, etc.
- **Autor**: nombre, fecha de nacimiento, fecha de muerte, libros relacionados.
- Uso de relaciones JPA entre entidades (`@ManyToMany`, `@OneToMany`, etc.).

---

## 💾 Base de Datos

Se utiliza **PostgreSQL** para almacenar libros y autores.

Ejemplo de propiedades (en `application.properties` )
