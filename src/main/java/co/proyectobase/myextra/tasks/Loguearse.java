package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.EscribirTexto;
import co.proyectobase.myextra.model.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Loguearse implements Task {

    private List<Credenciales> datos;
    public Loguearse(List<Credenciales> datos){
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Escribir.elTexto(datos.get(0).getUsuario()).en(USUARIO) );
        actor.attemptsTo(Escribir.elTexto(datos.get(0).getContrasenia()).en(PASSWORD));
        actor.attemptsTo(Digitar.laTecla(Telca.ENTER.getTecla()));
        actor.attemptsTo(Escribir.elTexto(datos.get(0).getTexto().en(UBICACION)));
    }

    public static Loguearse enMyExtra(List<Credenciales> datos){
        return Tasks.instrumented(Loguearse.class, datos);
    }
}
