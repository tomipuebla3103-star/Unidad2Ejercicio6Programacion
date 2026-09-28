//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Usuario usuario1 = new Usuario("Tomi");
    Usuario usuario2 = new Usuario("Juan");

    RedSocial redSocial = new RedSocial();

    redSocial.enviarSolicitud(usuario1, usuario2);

    System.out.println();
    System.out.println("Notificaciones de " + usuario2.nombreUsuario + ":");

    for (int i = 0; i < usuario2.cantidadNotificaciones; i++) {
        System.out.println("- " + usuario2.notificaciones[i]);
    }
}

