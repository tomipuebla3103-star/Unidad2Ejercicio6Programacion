<img width="485" height="172" alt="WhatsApp Image 2026-09-28 at 16 27 38" src="https://github.com/user-attachments/assets/a779d14e-174d-4f6f-86f7-d3cbe74d8a6d" />

Red Social y Sistema de Notificación de Amistad

 Descripción
Este proyecto consiste en un sistema en Java que permite enviar solicitudes de amistad entre usuarios de una red social. La red social actúa como intermediaria y se encarga de enviar una notificación al usuario que recibe la solicitud.

 Clases
- **Usuario:** contiene el nombre de usuario, una lista de amigos y una bandeja de notificaciones. También tiene un método para recibir y guardar notificaciones.
- **RedSocial:** administra el envío de solicitudes de amistad mediante el método `enviarSolicitud(Usuario remitente, Usuario receptor)`.

 Funcionamiento
En el `main` se crean dos usuarios y se registra una solicitud de amistad a través de la red social. Luego, se verifica por consola que el usuario receptor haya recibido la notificación correspondiente.

 Recorrido del mensaje
1. El programa crea dos objetos `Usuario`.
2. Se crea el objeto `RedSocial`, que se encarga de gestionar las solicitudes.
3. El usuario remitente envía una solicitud de amistad llamando al método `enviarSolicitud()`.
4. La red social recibe los dos usuarios como parámetros y genera el mensaje de notificación.
5. El sistema llama al método `recibirNotificacion(String mensaje)` del usuario receptor.
6. El receptor guarda el mensaje en su bandeja de notificaciones.
7. Finalmente, se muestra por consola la notificación recibida.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de listas, el envío de objetos como parámetros y la interacción entre usuarios mediante un controlador central.
