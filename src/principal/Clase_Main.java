package principal;

import java.util.Formatter;//Esta clase permite generar String a partir de datos usando una especificación de formato.
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import c.CrearJuego;
import m.Jugador;
import java.util.Scanner;
public class Clase_Main {
    
        private Formatter salida; // objeto usado para enviar texto al archivo
        public void menu() {
        System.out.println("Este programa presenta 5 preguntas por nivel (cinco niveles)\n"
                + "Si contestas bien avanzaras, de lo contrario se mostrará tu puntaje.\n" 
                + "Por favor ingrese la opcion deseada:"
                + "\n1. Iniciar\n2. Salir");

        try {
            Scanner entrada = new Scanner(System.in);
            int opc = entrada.nextInt();
            if (opc < 1 || opc > 2) {
                System.err.println("Dato invalido.");
                Clase_Main Ejecutar = new Clase_Main();
                Ejecutar.menu();
            } else {
                while (opc > 0 && opc < 3) {

                    switch (opc) {
                        case 1:
                            CrearJuego juego = new CrearJuego(); 
                            Jugador player = new Jugador();
                            player=juego.comenzarJuego();
                            String name = player.getName();
                            String categoria = player.getCategoria();
                            int ronda = player.getRonda();
                            double score = player.getScore();
                            agregarRegistros(ronda,name,categoria,score);
                            System.out.println("Este programa presenta 5 preguntas por nivel (cinco niveles)\n"
                            + "Si contestas bien avanzaras, de lo contrario se mostrará tu puntaje.\n" 
                            + "Por favor ingrese la opcion deseada:"
                            + "\n1. Iniciar\n2. Salir");
                            
                            entrada.nextLine();//limpia el buffer
                            opc = entrada.nextInt();
                            while(opc==2){ 
                                cerrarArchivo();
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("Bye...");
                            opc++;
                            break;
                        default:
                            System.out.println("Hasta pronto!");
                            opc++;
                            break;
                    }//Fin del switch
                }//Fin del while
            }//Fin del else
        } catch (Exception e) {
            System.out.println("¡Entrada invalida!");
            Clase_Main Ejecutar = new Clase_Main();
            Ejecutar.menu();
        }
    }//Fin metodo Menu();
        
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

    public void agregarRegistros(int ronda, String name,String categoría , double score ) {
        
        if (name!=null) {
            // escribe el nuevo registro
            salida.format("%d %s %s %.2f\n", ronda,name,
            categoría,score);
        } // fin de if
        else {
            System.out.println(
                    "No se encuentra jugador.");
        }
        
        System.out.printf("%-9s%-15s%-18s%10s\n", "Ronda", "NICKNAME", "Categoria", "Score" );
        // muestra el contenido del registro
        System.out.printf( "<%-9d%-15s%-18s%10.2f\n",ronda,name,
            categoría,score);
    }//Fin dle metodo agregarRegistros();
     
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    }
    
    public static void main(String[] args) {
        Clase_Main Ejecutar = new Clase_Main();
        Ejecutar.abrirArchivo();
        Ejecutar.menu();
        
    }
}
