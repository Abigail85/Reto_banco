# Gestión de la atención - Pruebas Web E2E #

Proyecto que contiene pruebas E2E automatizadas para el proyecto Gestión de la Atención

En este readme, se explicarán las diferentes configuraciones necesarias para que se pueda ejecutar el proyecto correctamente.

## Prerrequisitos ##

- IDE
- JDK 11 o superior
- Gradle 8.5
- Navegador web Chrome (ultima versión)
## Variables de entorno ##

Configurar las variables de entorno que se encuentran en el archivo env.properties
```
USUARIO_GA
CONTRASENA_GA
```

## Ejecución de pruebas ##

###### **Ejecutar Todos los Runner**

```
gradle clean test -Dproperties=serenity.conf aggregate
```

###### **Ejecutar Runner Especifico**

```
gradle clean test --tests nombreClaseRunner -Dproperties=serenity.conf aggregate
```

###### **Ejecutar Escenario Especifico por Etiqueta**

```
gradle clean test -Dproperties=serenity.conf -Dcucumber.filter.tags="@nombreEtiqueta" aggregate
```