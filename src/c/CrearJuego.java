package c;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;//Esta clase permite generar String a partir de datos usando una especificación de formato.
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import m.*;
import v.Vista;

public class CrearJuego {

    Vista view = new Vista();
    Categoria cat = new Categoria();
    Jugador player = new Jugador();
    Ronda ron = new Ronda();
    Premio win = new Premio();
    ArrayList<String> text = new ArrayList<String>();

    Preguntas preg = new Preguntas();

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("Juego.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo
    
    public void controlListaPlayer(){
        
    }

    public void comenzarJuego() {
        abrirArchivo();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Crea tu NICKNAME...\n");
        String nickName = entrada.next();
        player.setName(nickName);
        
        int lvl = rondaUno();
        if(lvl==2){
            lvl=rondaDos();
        }
        if(lvl==3){
            lvl=rondaTres();
        }
        if(lvl==4){
            lvl=rondaCuatro();
        }
        if(lvl==5){
            lvl=rondaCinco();
        }
        if(lvl==6){
            agregarRegistros(lvl,nickName,cat.getName(),player.getScore());
            leerRegistros(lvl, nickName, cat.getName(), player.getScore());  
            cerrarArchivo();
            salir();
        }       
        agregarRegistros(lvl,nickName,cat.getName(),player.getScore());
        leerRegistros(lvl, nickName, cat.getName(), player.getScore());  
        cerrarArchivo();
    }//fin del metodo comenzarJuego();
    
    public void salir(){
        System.out.println("Gracias por jugar.");
        System.exit(0);
    }
    
    public int rondaUno(){
        Scanner entrada = new Scanner(System.in);
        int x = 1;
        ron.setNum(x);

        if (ron.getNum() == 1) {

            cat.categoriaRandom();
            String categoria = cat.getName();

            if (categoria == preg.addPreguntasMate()) {

                view.mostrarPreguntasRon1(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{ 
                    player.setScore(0.0);
                    view.mostrarPuntaje(x,player.getScore()); 
                }

            }
            if (categoria == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon1(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(0);
                    player.setScore(0.0);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon1(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==2){
                    x++;
                }else{
                    win.setPremio(0);
                    player.setScore(0.0);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon1(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(0);
                    player.setScore(0.0);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon1(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(0);
                    player.setScore(0.0);
                    view.mostrarPuntaje(x,player.getScore());
                }
            }

        }
        return x;
    }
    public int rondaDos(){
        Scanner entrada = new Scanner(System.in);
        int x = 2;
        ron.setNum(x);

        if (ron.getNum() == 2) {

            cat.categoriaRandom();
            String categoria = cat.getName();

            if (categoria == preg.addPreguntasMate()) {

                view.mostrarPreguntasRon2(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==2){
                    x++;
                }else{
                    win.setPremio(9.999);
                    player.setScore(9.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon2(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==2){
                    x++;
                }else{
                    win.setPremio(9.999);
                    player.setScore(9.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon2(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==1){
                    x++;
                }else{
                    win.setPremio(9.999);
                    player.setScore(9.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon2(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(9.999);
                    player.setScore(9.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon2(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(9.999);
                    player.setScore(9.999);
                    view.mostrarPuntaje(x,player.getScore());
                }
            }

        }
        return x;
    }
    public int rondaTres(){
        Scanner entrada = new Scanner(System.in);
        int x = 3;
        ron.setNum(x);

        if (ron.getNum() == 3) {

            cat.categoriaRandom();
            String categoria = cat.getName();

            if (categoria == preg.addPreguntasMate()) {

                view.mostrarPreguntasRon3(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(99.999);
                    player.setScore(99.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon3(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(99.999);
                    player.setScore(99.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon3(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(99.999);
                    player.setScore(99.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon3(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==1){
                    x++;
                }else{
                    win.setPremio(99.999);
                    player.setScore(99.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon3(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==4){
                    x++;
                }else{
                    win.setPremio(99.999);
                    player.setScore(99.999);
                    view.mostrarPuntaje(x,player.getScore());
                }
            }

        }
        return x;
    }
    public int rondaCuatro(){
        Scanner entrada = new Scanner(System.in);
        int x = 4;
        ron.setNum(x);

        if (ron.getNum() == 4) {

            cat.categoriaRandom();
            String categoria = cat.getName();

            if (categoria == preg.addPreguntasMate()) {

                view.mostrarPreguntasRon4(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(999.999);
                    player.setScore(999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon4(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(999.999);
                    player.setScore(999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon4(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==1){
                    x++;
                }else{
                    win.setPremio(999.999);
                    player.setScore(999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon4(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(999.999);
                    player.setScore(999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon4(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==1){
                    x++;
                }else{
                    win.setPremio(999.999);
                    player.setScore(999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }
            }

        }
        return x;
    }
    public int rondaCinco(){
        Scanner entrada = new Scanner(System.in);
        int x = 5;
        ron.setNum(x);

        if (ron.getNum() == 5) {

            cat.categoriaRandom();
            String categoria = cat.getName();

            if (categoria == preg.addPreguntasMate()) {

                view.mostrarPreguntasRon5(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==1){
                    x++;
                }else{
                    win.setPremio(9999.999);
                    player.setScore(9999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon5(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==2){
                    x++;
                }else{
                    win.setPremio(9999.999);
                    player.setScore(9999.999);
                    view.mostrarPuntaje(x,player.getScore());;
                }

            }
            if (categoria == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon5(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(9999.999);
                    player.setScore(9999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon5(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==2){
                    x++;
                }else{
                    win.setPremio(9999.999);
                    player.setScore(9999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }

            }
            if (categoria == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon5(categoria);
                System.out.println("\n9. SALIR");
                int r = entrada.nextInt();
                if(r==9){
                    salir();
                }
                if(r==3){
                    x++;
                }else{
                    win.setPremio(9999.999);
                    player.setScore(9999.999);
                    view.mostrarPuntaje(x,player.getScore());
                }
            }

        }
        return x;
    }
    
    
    // agrega registros al archivo
    public void agregarRegistros(int ronda, String name,String categoría , double score ) {

        Categoria cat = new Categoria();
        Jugador player = new Jugador();
        Ronda ron = new Ronda();
        
        player.setName(name);
        player.setScore(score);
        cat.setName(categoría);
        ron.setNum(ronda);
        
                if (ron.getNum()>0) {
                    // escribe el nuevo registro
                    salida.format("%d %s %s %.2f\n", ron.getNum(),player.getName() ,
                             cat.getName(),player.getScore());
                    
                } // fin de if
                else {
                    System.out.println(
                            "No se encuentra jugador.");
                }

    }
    
        public void leerRegistros( int ronda, String name,String categoría , double score){
  
        System.out.printf("%-9s%-15s%-18s%10s\n", "Ronda", "NICKNAME", "Categoria", "Score" );
      
        Categoria cat = new Categoria();
        Jugador player = new Jugador();
        Ronda ron = new Ronda();
        
        player.setName(name);
        player.setScore(score);
        cat.setName(categoría);
        ron.setNum(ronda);

        // muestra el contenido del registro
        System.out.printf( "<%-9d%-15s%-18s%10.2f\n",ron.getNum(),player.getName() ,
                             cat.getName(),player.getScore());
     }//Fin del metodo leerRegistros. 
    
        public void cerrarArchivo() {
            if (salida != null) {
            salida.close();
            }
        }

}
