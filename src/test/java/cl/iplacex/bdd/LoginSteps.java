package cl.iplacex.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cl.iplacex.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
     
    private LoginService loginService;
    private boolean resultado;

    @Given("que existe un usuario {string} con contraseña {string}")
    public void existeUsuario(String usuario, String contrasena) {
        loginService = new LoginService();
    }

    @When("intento iniciar sesión con usuario {string} y contraseña {string}")
    public void intentoIniciarSesion(String usuario, String contrasena) {
        resultado = loginService.iniciarSesion(usuario, contrasena);
    }

    @Then("el acceso debe ser permitido")
    public void accesoPermitido() {
        assertEquals(true, resultado);
    }

    @Then("el acceso debe ser rechazado")
    public void accesoRechazado() {
        assertEquals(false, resultado);
    }
}
