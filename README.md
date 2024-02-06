# Aplicación de gestión de tareas - Arquitectura hexagonal
Esta aplicación ejemplifica un sistema de gestión de tareas que se adhiere a la arquitectura hexagonal. A través de esta aplicación, los usuarios tienen la capacidad de crear, leer, actualizar y eliminar tareas de manera eficiente. Además, la aplicación proporciona la funcionalidad de acceder a información adicional de una tarea mediante una API externa, ampliando así su versatilidad y utilidad.

# Rutas de la API
A continuación se enumeran las rutas de la API con sus métodos HTTP correspondientes y ejemplos de entrada:

1. Crear una tarea con el Método: POST Ruta: /api/tasks Input: JSON con la información de la tarea (title, description, creationDate y completed)
   
{

        "title": "Crear aplicación usando arquitectura hexagonal",
        "description": "Aplicación de lista de tareas",
        "creationDate": "2024-02-02T18:00:00.000Z",
        "completed": true
   
}

2. Obtener una tarea por ID Método: GET Ruta: /api/tasks/{taskId} Input: taskId en la ruta (reemplazar {taskId} con el ID de la tarea que deseas obtener)

3. Obtener todas las tareas Método: GET Ruta: /api/tasks

4. Actualizar una tarea Método: PUT Ruta: /api/tasks/{taskId} Input: taskId en la ruta (reemplazar {taskId} con el ID de la tarea que deseas actualizar) y JSON con la información actualizada de la tarea (title, description, creationDate y completed)

{  

       "id": 1,
       "title": "Crear aplicación usando arquitectura hexagonal",
       "description": "Probando edición de tarea en la aplicación de lista de tareas",
       "creationDate": "2024-02-02T18:00:00",
       "completed": false
    
}

5. Eliminar una tarea por ID Método: DELETE Ruta: /api/tasks/{taskId} Input: taskId en la ruta (reemplazar {taskId} con el ID de la tarea que deseas eliminar)

6. Obtener información adicional de una tarea Método: GET Ruta: /api/tasks/{taskId}/additionaltaskinfo Input: taskId en la ruta (reemplazar {taskId} con el ID de la tarea para la que deseas obtener información adicional) Pruebas Puedes usar herramientas como Postman o curl para probar estas rutas. Asegúrate de que la aplicación esté en ejecución antes de realizar las pruebas.

# Construido con 🛠️

[JAVA](https://www.java.com/es/) - Lenguaje 

[Spring boot](https://spring.io/projects/spring-boot) - Framework usado

[Spring Initializr](https://start.spring.io/) - Constructor de proyecto

[Maven](https://maven.apache.org/) - Manejador de dependencias

[Swagger](https://swagger.io/) - Documentar y testear API

[Docker](https://www.docker.com/) - Sistema de contenedores

[MySQL](https://www.mysql.com/) - Base de datos

[H2](https://www.h2database.com/) - Base de datos en memoria

# Despliegue Base Datos H2 📦

- Este es el despliegue sencillo, solo necesitas ejecutar la aplicacion.

   - La base de datos H2 almacena los datos en memoria temporal, recuerda que al finalizar la aplicacion los datos se borran,
        si deseas persistencia utiliza la configuracion con MySQL, se explica mas abajo.
  
- Puedes cambiar el puerto en application.properties, por defecto use el siguiente:
  
  - server.port=8090

- Implemente SWAGGER para documentar y gestionar nuestra API, te dejo link:
  
     - http://localhost:8090/swagger-ui/index.html#/ 

- Utilicé POSTMAN para las peticiones HTTP, te dejo las rutas y los metodos:

   - Agregar tarea:

     - POST localhost:8090/api/task

  - Listar tareas:

      - GET localhost:8090/api/task

  - Listar tarea por ID

      - GET localhost:8090/api/task/1

  - Editar tarea
 
       - PUT localhost:8090/api/task/3

  - Eliminar tarea
 
     - DELETE localhost:8090/api/task/3

  - Información adicional (consulta API externa)

     - GET localhost:8090/api/task/5/additionaltaskinfo
   
# Despliegue DOCKER 📦

- Abre Docker y ejecuta el archivo "docker-compose.yml" (adjunto en el proyecto) en una linea de comandos.

- Crea una base de datos llamada tasks en MYSQL.

- Debes cambiar los parametros en "application.properties" para que haga que MySQL sea la base de datos predeterminada.

- Puedes uttilizar SWAGGER o POSTMAN para las peticiones a la API.

