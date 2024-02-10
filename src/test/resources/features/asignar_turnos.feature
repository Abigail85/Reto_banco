#language:es

Característica: Asignar Turnos por medio de la pagina web
  Yo como usuario del sistema
  Quiero poder asignar turnos
  Para gestionar servicios de atencion en la orientacion

  Escenario: Listar Taquillas Activas al Asignar Turno
    Dado que el usuario ha iniciado sesion
    Cuando se le asigna un turno
    Entonces el sistema deberia listar las taquillas activas


Característica: Asignar Turnos con Configuración de Ocultar Tipo de Preferencia

  Escenario: Ocultar Tipo de Preferencia en el Ticket
    Dado que el sistema tiene configurado el parametro "Ocultar el tipo de preferencia en el ticket" en 'S'
    Cuando se asigna un turno preferencial
    Entonces el sistema deberia generar el ticket sin mostrar el tipo de preferencia

  Escenario: Mostrar Tipo de Preferencia en el Ticket
    Dado que el sistema tiene configurado el parametro "Ocultar el tipo de preferencia en el ticket" en 'N'
    Cuando se asigna un turno preferencial
    Entonces el sistema deberia generar el ticket mostrando el tipo de preferencia

