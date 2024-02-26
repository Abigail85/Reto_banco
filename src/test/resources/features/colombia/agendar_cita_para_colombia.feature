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