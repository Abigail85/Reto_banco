import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

def enviar_correo(radicado):
    # Configuración del servidor SMTP
    smtp_server = 'smtp.gmail.com'
    smtp_port = 587
    smtp_usuario = 'jeacevedo92@utp.edu.co'
    smtp_contrasena = 'sdpg whcd kbnz fstp'

    # Configuración del mensaje
    asunto = 'Actualización de radicado'
    mensaje_html = f"""
<html>
<head>
    <style>
        body {{
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
        }}
        .container {{
            width: 80%;
            margin: 20px auto;
            background-color: #ffffff;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
        }}
        h1, p {{
            text-align: center;
            color: #333333;
        }}
        a {{
            color: #007bff;
            text-decoration: none;
        }}
        a:hover {{
            text-decoration: underline;
        }}
    </style>
</head>
<body>
    <div class="container">
        <h1>Actualización de radicado</h1>
        <p>El radicado número {radicado} ha sido actualizado.</p>
        <p>Puedes ver el detalle de la actualización <a href="https://consultaprocesos.ramajudicial.gov.co/Procesos/NumeroRadicacion">aquí</a>.</p>
    </div>
</body>
</html>
"""


    # Crear el objeto MIMEText
    mensaje = MIMEMultipart('alternative')
    mensaje['Subject'] = asunto
    mensaje['From'] = smtp_usuario
    mensaje['To'] = 'cristiancolorado98@gmail.com'

    # Adjuntar el mensaje HTML al objeto MIMEText
    mensaje.attach(MIMEText(mensaje_html, 'html'))

    # Conectar al servidor SMTP y enviar correo
    with smtplib.SMTP(smtp_server, smtp_port) as servidor_smtp:
        servidor_smtp.starttls()
        servidor_smtp.login(smtp_usuario, smtp_contrasena)
        servidor_smtp.sendmail(smtp_usuario, 'cristiancolorado98@gmail.com', mensaje.as_string())

    print("Correo enviado con éxito.")

# Ejemplo de uso
radicado = '66001311000320210005100'
enviar_correo(radicado)



 <div class="container">
          <h2>Notificación de Resultados de Pruebas Automatizadas</h2>
          <p>{message}</p>
        </div>