#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  Escenario: Agendar cita exitosa
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue agendada de forma exitosa

  @Reagendar_cita
  Escenario: Reagendar cita
    Dado  que el usuario se encuentra en la pagina web
    Cuando reagenda la cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue reagendada de forma exitosamente