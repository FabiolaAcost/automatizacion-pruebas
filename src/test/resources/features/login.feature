
Feature: Inicio de sesión
  Como usuario del sistema
  Quiero iniciar sesión con mis credenciales
  Para acceder únicamente cuando sean válidas

  Scenario: Inicio de sesión con credenciales correctas
    Given que existe un usuario "admin" con contraseña "Admin123"
    When intento iniciar sesión con usuario "admin" y contraseña "Admin123"
    Then el acceso debe ser permitido

  Scenario Outline: Inicio de sesión con credenciales inválidas
    Given que existe un usuario "admin" con contraseña "Admin123"
    When intento iniciar sesión con usuario "<usuario>" y contraseña "<contrasena>"
    Then el acceso debe ser rechazado

    Examples:
      | usuario     | contrasena |
      | admin       | incorrecta |
      | desconocido | Admin123   |
      | admin       |            |
      |             | Admin123   |
