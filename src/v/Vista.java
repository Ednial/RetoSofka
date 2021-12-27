package v;
import m.Preguntas;
import m.Premio;
public class Vista {
    
    Preguntas preg = new Preguntas();
    Premio ptj = new Premio();
    
    public void mostrarPreguntasRon1(String categoria){  
        System.out.println("pregunta:\n");
        preg.imprimirPreguntasRon1(categoria);
        System.out.println("Respuestas:\n");
        preg.imprimirRespuestasRon1(categoria);
    }
    public void mostrarPreguntasRon2(String categoria){  
        System.out.println("pregunta:\n");
        preg.imprimirPreguntasRon2(categoria);
        System.out.println("Respuestas:\n");
        preg.imprimirRespuestasRon2(categoria);
    }
    public void mostrarPreguntasRon3(String categoria){  
        System.out.println("pregunta:\n");
        preg.imprimirPreguntasRon3(categoria);
        System.out.println("Respuestas:\n");
        preg.imprimirRespuestasRon3(categoria);
    }
    public void mostrarPreguntasRon4(String categoria){  
        System.out.println("pregunta:\n");
        preg.imprimirPreguntasRon4(categoria);
        System.out.println("Respuestas:\n");
        preg.imprimirRespuestasRon4(categoria);
    }
    public void mostrarPreguntasRon5(String categoria){  
        System.out.println("pregunta:\n");
        preg.imprimirPreguntasRon5(categoria);
        System.out.println("Respuestas:\n");
        preg.imprimirRespuestasRon5(categoria);
    }
    
    public void mostrarPuntaje(int ronda, double premio){
        ptj.puntaje(ronda,premio);
    }
    
}
