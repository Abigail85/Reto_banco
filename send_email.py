# -*- coding: utf-8 -*-

import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

def send_email(subject, message):
    sender_email = os.getenv("SENDER_EMAIL")
    receiver_email = os.getenv("RECIPIENT_EMAIL")
    smtp_server = os.getenv("SMTP_SERVER")
    smtp_port = os.getenv("SMTP_PORT")
    smtp_username = os.getenv("SMTP_USERNAME")
    smtp_password = os.getenv("SMTP_PASSWORD")
    
    # Create message container - the correct MIME type is multipart/alternative.
    msg = MIMEMultipart('alternative')
    msg['Subject'] = subject
    msg['From'] = sender_email
    msg['To'] = receiver_email

    html = f"""
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
        <h2>Notificación de Resultados de Pruebas Automatizadas</h2>
        <p>{message}</p>
        <p>Puedes ver los resultados de las pruebas automaticas <a href="https://consultaprocesos.ramajudicial.gov.co/Procesos/NumeroRadicacion">aquí</a>.</p>
    </div>
</body>
</html>
"""

    # Attach HTML part to message container.
    part = MIMEText(html, 'html')
    msg.attach(part)

    # Send the message via SMTP server.
    with smtplib.SMTP_SSL(smtp_server, smtp_port) as server:
        server.login(smtp_username, smtp_password)
        server.sendmail(sender_email, receiver_email, msg.as_string())

if __name__ == "__main__":
    # Solo se ejecuta si se importa como módulo, no cuando se llama directamente desde la línea de comandos
    pass
