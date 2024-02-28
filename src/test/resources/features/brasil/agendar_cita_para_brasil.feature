#language:pt
Característica: Agende consultas pelo site
  Eu como usuário
  Quero poder agendar consultas
  Para processar serviços relacionados ao meu veículo

  Cenario: Agendar cita exitosa para un usuario con CPF
    Dado que o usuário está no site do Shopping GA
    Quando agenda una cita para un usuario identificación para el servicio Traspaso de vehículo blindado
    Entao debe ver que la cita fue agendada de forma exitosa

  Cenario: Agendar cita exitosa para un usuario con CNPJ
    Dado que o usuário está no site do Shopping GA
    Quando agenda una cita para un usuario identificación para el servicio Traspaso de vehículo blindado
    Entao debe ver que la cita fue agendada de forma exitosa

  Cenario: Agendar cita multitramite
    Dado que o usuário está no site do Shopping GA
    Quando agenda una cita para tramitar diferentes servicios
      | EntidadPrestadoraDeServicio   | ServicioRequerido                     |
      | Alcaldía de Medellín          | Cambio de matricula                   |
      | Secretaría Movilidad Medellín | Duplicado licencia de conducción moto |
    Entao debe ver que la cita fue agendada de forma exitosa