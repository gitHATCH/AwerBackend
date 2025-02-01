package com.tasksmanager.tasksmanager;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksmanagerApplication {

	public static void main(String[] args) {
		// Cargar variables de entorno desde el archivo .env
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		// Iniciar la aplicación Spring Boot
		SpringApplication.run(TasksmanagerApplication.class, args);
		System.out.println("Aplicación en ejecución en http://localhost:8080");
	}

}

/* Arranque app */
