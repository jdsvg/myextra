# language:es
#Author: jvillamil@choucairtesting.com

@Regresion
Característica: Trabajar con MyExtra

	@CasoExitoso
  Escenario: Ingresar a MyExtra
    Dado que John desea realizar una consulta en AS400, John abre my extra
    Cuando el realiza la autenticación con el usuario
    |usuario|contrasenia|texto|
    |cyearias|pruebas08|Ubicarse:|
    Y el navega al menú
    Entonces el verifica que inicio sesión correctamente

