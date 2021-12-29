package v;

import m.Preguntas;
import m.Premio;

public class Vista {

    Preguntas preg = new Preguntas();
    Premio ptj = new Premio();

    public void mostrarPreguntasRon(String categoria, int x) {
        if (x < 5) {
            System.out.println("pregunta:\n");
            preg.imprimirPreguntasRon(categoria, x);
            System.out.println("Respuestas:\n");
            preg.imprimirRespuestasRon(categoria, x);
            System.out.println("\n9. SALIR");
        }else{
            System.out.println("GRACIAS POR JUGAR\nDigite cualquier numero igual o mayor a ->5<- para finalizar.");
        }

    }

    public void mostrarPuntaje(int ronda, double premio) {
        ptj.puntaje(ronda, premio);
    }

}
