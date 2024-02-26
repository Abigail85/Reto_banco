#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  @prueba
  Escenario: Agendar cita exitosa para un usuario con Cédula de ciudadania
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con NIT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para un usuario identificación para el servicio Duplicado licencia de conducción moto
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con RUT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para un usuario identificación para el servicio Traspaso de vehículo blindado
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con CNPJ
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para un usuario identificación para el servicio Traspaso de vehículo blindado
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita multitramite
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para tramitar diferentes servicios
      | EntidadPrestadoraDeServicio   | ServicioRequerido                     |
      | Alcaldía de Medellín          | Cambio de matricula                   |
      | Secretaría Movilidad Medellín | Duplicado licencia de conducción moto |
    Entonces debe ver que la cita fue agendada de forma exitosa

  @Reagendar_cita
  Escenario: Reagendar cita
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando reagenda la cita para el servicio Lavado de carro
    Entonces debe ver que la cita fue reagendada de forma exitosamente