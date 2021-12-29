package c;

import java.util.Scanner;
import m.*;
import v.Vista;

public class CrearJuego {

    Vista view = new Vista();
    Categoria cat = new Categoria();
    Jugador player = new Jugador();
    Ronda ron = new Ronda();
    Premio win = new Premio();
    Preguntas preg = new Preguntas();

    
    public CrearJuego(){

    }
    
    public Jugador comenzarJuego() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Crea tu NICKNAME...\n");
        
        String nickName = entrada.next();
        player.setName(nickName);
        entrada.nextLine();//Limpia el buffer
        
        for (int i = 0; i < 6; i++) {
            cat.categoriaRandom();
            String categoria = cat.getName();
            ron.rondas(categoria, i);
            int respuesta = entrada.nextInt();          
            boolean r=preg.respuestasCorrecta(respuesta, ron.getNum(),categoria);
            if(respuesta==9){
                salir();
            }
            if(r==false){               
                view.mostrarPuntaje(i+1, 99*i);
                break;
            }else{
                view.mostrarPuntaje(i+1, 99*i);
                player.setScore(10.0*i);
                }
            player.setCategoria(categoria);
            player.setRonda(i+1);
        } 
        return player;        
    }//fin del metodo comenzarJuego();
  
    public void salir(){
        System.out.println("\nGAME OVER.\nGracias por jugar.");
        System.exit(0);
    }   
}
