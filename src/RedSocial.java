public class RedSocial {

    public void enviarSolicitud(Usuario remitente, Usuario receptor) {

        String mensaje = remitente.nombreUsuario
                + " te ha enviado una solicitud de amistad.";

        receptor.recibirNotificacion(mensaje);

        System.out.println("Solicitud enviada correctamente.");
    }
}
