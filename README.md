# Gestión de la atención - Pruebas Web E2E #

Proyecto que contiene pruebas E2E automatizadas para el proyecto Gestión de la Atención

En este readme, se explicarán las diferentes configuraciones necesarias para que se pueda ejecutar el proyecto correctamente.

## Prerrequisitos ##

- IDE
- JDK 11 o superior
- Gradle 8.5

## Variables de entorno ##

Configurar las variables de entorno que se encuentran en el archivo env.properties

```
USUARIO_GA
CONTRASENA_GA
```

## Ejecución de Pruebas ##

### **Localmente**

Sigue estos pasos para ejecutar las pruebas localmente:

1. Clona este repositorio en tu máquina local.
2. Navega hasta el directorio del proyecto clonado.
3. Configura las variables de entorno en el archivo `env.properties` según sea necesario.
4. Abre una terminal en el directorio del proyecto.
5. Ejecuta los siguientes comandos:

#### **Ejecutar Todos los Runners**

```bash
gradle clean test -Dproperties=serenity.conf -Dfile.encoding=UTF-8 aggregate
```

#### **Ejecutar Runner Especifico**

```bash
gradle clean test --tests nombreClaseRunner -Dproperties=serenity.conf -Dfile.encoding=UTF-8 aggregate
```

#### **Ejecutar Escenario Especifico por Etiqueta**

```bash
gradle clean test -Dproperties=serenity.conf -Dcucumber.filter.tags="@nombreEtiqueta" -Dfile.encoding=UTF-8 aggregate
```

#### **Ejecutar en Docker**

Si deseas ejecutar las pruebas en Docker, puedes utilizar la imagen jhonacevedor/quipux-test-automation. Sigue estos pasos:

1. Asegúrate de tener Docker instalado en tu máquina local.
2. descargar la imagen docker

```bash
docker pull jhonacevedor/quipux-test-automation 
```

3. Ejecuta las pruebas
```bash
docker run -it --rm jhonacevedor/quipux-test-automation /bin/bash
```
Dentro del contenedor, podrás ejecutar los comandos de Gradle mencionados anteriormente para ejecutar las pruebas.
