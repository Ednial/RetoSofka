package principal;
import c.CrearJuego;
import java.util.Scanner;
public class Clase_Main {
   
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
                            juego.comenzarJuego();
                            System.out.println("Este programa presenta 5 preguntas por nivel (cinco niveles)\n"
                            + "Si contestas bien avanzaras, de lo contrario se mostrará tu puntaje.\n" 
                            + "Por favor ingrese la opcion deseada:"
                             + "\n1. Iniciar\n2. Salir");
                            opc = entrada.nextInt();
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
    
    public static void main(String[] args) {
        Clase_Main Ejecutar = new Clase_Main();
        CrearJuego juego = new CrearJuego(); 
        Ejecutar.menu();
        
    }
}
