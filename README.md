# Gym API System - Backend Production-Ready

Este es un backend robusto y escalable desarrollado en **Java Spring Boot**, diseñado para gestionar usuarios, sus registros de progreso físico (peso/altura) y la asignación dinámica de rutinas con sus respectivos bloques de ejercicios.

Este proyecto está construido siguiendo estándares de la industria, enfocado en una separación limpia de responsabilidades y utilizando arquitecturas escalables.

---

## 🚀 Arquitectura del Sistema

El proyecto implementa una **Arquitectura por Capas (Clean Architecture Lite)** para asegurar un código mantenible, desacoplado y fácil de testear.

* **Controller Layer:** Expone los endpoints de la API RESTful manejando códigos de estado HTTP semánticos (`201 Created`, `204 No Content`, etc.).
  
* **Service Layer:** Contiene el "cerebro" de la aplicación y las reglas de negocio, aislando por completo la persistencia del cliente.
  
* **Repository Layer:** Abstracción de datos utilizando **Spring Data JPA**.
  
* **DTO Pattern:** Uso estricto de *Data Transfer Objects* para proteger la integridad de las entidades y evitar recursión en las relaciones de base de datos.

---

## Stack Tecnológico

* **Backend:** Java 17+ / Spring Boot 3.x
* **Persistencia:** Spring Data JPA / Hibernate
* **Base de Datos:** PostgreSQL 🐘
* **Productividad:** Lombok (Procesamiento de anotaciones)

---

## Roadmap de Desarrollo (Próximos Pasos)

El sistema se encuentra en desarrollo activo siguiendo un plan estratégico para escalar su complejidad técnica:

- [x] **Fase 1:** CRUD Base de Usuarios ordenado de forma nativa.
- [ ] **Fase 2:** Gestión de Relaciones Complejas (Rutinas y Ejercicios por Usuario).
- [ ] **Fase 3:** Aseguramiento de Capa de Red mediante **Spring Security & JWT**.
- [ ] **Fase 4:** Arquitectura Orientada a Eventos (EDA) integrando **Apache Kafka** para procesamiento asíncrono de logs de progreso.

---

## Configuración Local

1. Clona este repositorio:
   ```bash
   git clone [https://github.com/TU_USUARIO/gym-api-system.git](https://github.com/TU_USUARIO/gym-api-system.git)
