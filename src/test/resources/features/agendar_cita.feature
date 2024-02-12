#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  Antecedentes:
    Dado que el usuario se encuentra en la pagina web de Shopping GA

  Escenario: Agendar cita exitosa para un usuario con Cédula de ciudadania
    Cuando agenda una cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con NIT
    Cuando agenda una cita para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con RUT
    Cuando agenda una cita para el servicio Dupliacado Pasaporte
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con CPNJ
    Cuando agenda una cita para el servicio Traspaso de vehículo blindado
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita multitramite
    Cuando agenda una cita para realizar varios tramites
    Entonces debe ver que la cita fue agendada de forma exitosa