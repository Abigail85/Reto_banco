#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  @prueba
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

  @agendarCitaSinPlacaVehiculo
  Escenario: Agendar cita para un servicio que no solicita la placa del vehiculo
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita sin incluir la placa del vehiculo para el servicio 'Venta'
    Entonces debe ver que la cita fue agendada de forma exitosa

  @camposObligatorios
  Escenario: Agendar cita con campos obligatorios
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita diligenciando los campos requeridos para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  @agendarCitaConComentario
  Escenario: Agendar cita incluyendo un comentario
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita incluyendo un comentario para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  @Reagendar_cita
  Escenario: Reagendar cita
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando reagenda la cita para el servicio Lavado de carro
    Entonces debe ver que la cita fue reagendada de forma exitosamente