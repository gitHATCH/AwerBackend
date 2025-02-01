# Task Manager - Backend
Este es el backend de un gestor de tareas desarrollado con Spring Boot, Maven y MySQL. El sistema permite agregar tareas y visualizar todas las tareas almacenadas en la base de datos. Se implementan buenas prácticas de desarrollo, validaciones, manejo de errores y seguridad.

## 🚀 Tecnologías Utilizadas
* Java 22
* Spring Boot
* Maven
* MySQL
* JPA/Hibernate
* Jakarta Validation
* Lombok
* Dotenv

## 📌 Características
* ✅ Creación automática de la base de datos y las tablas si no existen.
* ✅ Validación de datos con respuestas claras y detalladas.
* ✅ Respuestas con códigos de estado HTTP apropiados.

## 📌 Pendiente
* ❌ Paginación.

## 📂 Estructura del Proyecto
```txt
├── src/main/java/com/tasksmanager/tasksmanager
│   ├── config/         # Configuración (CORS, seguridad, etc.)
│   ├── controller/     # Controladores REST
│   ├── model/         # Entidades JPA
│   ├── repo/          # Repositorios JPA
│   ├── service/       # Lógica de negocio
│   └── TaskManagerApplication.java  # Clase principal de Spring Boot
├── src/main/resources/
│    └── application.properties  # Configuración de la BD y otros ajustes
├── .env  # Variables de entorno
```

## ⚙️ Configuración del Entorno
### Variables de Entorno
Crea un archivo .env en la raíz del proyecto spring boot /tasksmanager y define o segun corresponda a la BD local:
```env
DB_HOST=127.0.0.1
DB_PORT=3306
DB_NAME=tasksmanager
DB_USERNAME=root
DB_PASSWORD=root
```

## 📡 Endpoints Disponibles
### ➕ Agregar una Tarea
POST /tasks
```json
{
  "description": "Nueva tarea"
}
```
### 📌 Listar Todas las Tareas
GET /tasks
### 🗑️️ Eliminar una tarea
DELETE /tasks/id
### 🔎️ Mostrar una tarea
GET /tasks/id
