public class Usuario {

    String nombreUsuario;
    Usuario[] listaAmigos;
    String[] notificaciones;

    int cantidadAmigos;
    int cantidadNotificaciones;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        listaAmigos = new Usuario[10];
        notificaciones = new String[10];

        cantidadAmigos = 0;
        cantidadNotificaciones = 0;
    }

    public void recibirNotificacion(String mensaje) {
        if (cantidadNotificaciones < 10) {
            notificaciones[cantidadNotificaciones] = mensaje;
            cantidadNotificaciones++;
        }
    }
}
