#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  @manual:passed
  Escenario: Verificar el consecutivo de la cita cuando es reinicializado por dia
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando el parametro 1852 se encuentra en S
    Entonces se debe crear el consecutivo de la cita

  @manual:passed
  Escenario: Verificar el consecutivo de la cita siendo reinicializado cuando supera lo configurado en el parametro consecutivo.rangoMaximoCita
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando el parametro 1852 se encuentra en S
    Entonces se debe crear el consecutivo de la cita

  @manual:passed
  Escenario: Agendar cita para un servicio marcado con tiempo de tolerancia
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita teniendo un ticket en el sistema con el mismo servicio
    Y estando en el tiempo de tolerancia

  @manual:passed
  Escenario: El usuario requiere exportar las citas que se encuentren agendadas a un archivo excel
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando exporta las citas al archivo excel
    Entonces Se espera que el sistema permita realizar la exportacion a Excel de las citas agendadas

  @manual:passed
  Escenario: Configurar propiedad tiempoAlertaAgendarCitas en el archivo conf-gestion-atencion.properties
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando Configura la propiedad tiempoAlertaAgendarCitas en el archivo conf-gestion-atencion.properties
    Entonces Se configura propiedad 'tiempoAlertaAgendarCitas' correctamente

  @manual:passed
  Escenario: Asignar una cita y verificar el tiempo en el que se presenta el mensaje de confirmacion
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando El tiempo que presenta el mensaje de la asignación del la cita se ecuentra acorde al configurado en la propiedad 'tiempoAlertaAgendarCitas' correctamente

  Escenario: Agendar cita exitosa para un usuario con Cédula de ciudadania
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio 'Lavado de carro'
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con NIT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para un usuario que posee nit para el servicio 'Lavado de carro'
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con RUT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para un usuario que posee rut para el servicio 'Lavado de carro'
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita multitramite
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para tramitar diferentes servicios
      | EntidadPrestadoraDeServicio | ServicioRequerido |
      | Alcaldía de Medellín        | Lavado de carro   |
      | Alcaldía de Medellín        | Lavado de carro   |
      | Alcaldía de Medellín        | Lavado de carro   |
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita para un servicio que no solicita la placa del vehiculo
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita sin incluir la placa del vehiculo para el servicio 'Venta'
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita con campos obligatorios
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita diligenciando los campos requeridos para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita incluyendo un comentario
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita incluyendo un comentario para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Reagendar cita
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando reagenda la cita para el servicio 'Lavado de carro'
    Entonces debe ver que la cita fue reagendada de forma exitosa

  Escenario: Agendar cita para un usuario diferente
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita cambiando los datos para el servicio 'Venta'
    Entonces debe ver que la cita fue agendada de forma exitosa