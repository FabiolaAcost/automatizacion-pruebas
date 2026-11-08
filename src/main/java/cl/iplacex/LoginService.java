package cl.iplacex;

public class LoginService {
    private static final String USUARIO_VALIDO = "admin";
    private static final String CONTRASENA_VALIDA = "Admin123";

    public boolean iniciarSesion(String usuario, String contrasena) {
        return USUARIO_VALIDO.equals(usuario)
                && CONTRASENA_VALIDA.equals(contrasena);
    }
}
