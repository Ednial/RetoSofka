package m;

import java.util.ArrayList;

public class Preguntas {

    Categoria cat;
    ArrayList<String> preg = new ArrayList<String>();
    ArrayList<String> respuestasron1 = new ArrayList<String>();
    ArrayList<String> respuestasron2 = new ArrayList<String>();
    ArrayList<String> respuestasron3 = new ArrayList<String>();
    ArrayList<String> respuestasron4 = new ArrayList<String>();
    ArrayList<String> respuestasron5 = new ArrayList<String>();

    public Preguntas() {

    }

    public Preguntas(ArrayList text, ArrayList respuestas, Categoria cat) {

        //this.text = text;
        this.cat = cat;

    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public ArrayList<String> getRespuestasron1() {
        return respuestasron1;
    }

    public void setRespuestasron1(ArrayList<String> respuestasron1) {
        this.respuestasron1 = respuestasron1;
    }

    public ArrayList<String> getRespuestasron2() {
        return respuestasron2;
    }

    public void setRespuestasron2(ArrayList<String> respuestasron2) {
        this.respuestasron2 = respuestasron2;
    }

    public ArrayList<String> getRespuestasron3() {
        return respuestasron3;
    }

    public void setRespuestasron3(ArrayList<String> respuestasron3) {
        this.respuestasron3 = respuestasron3;
    }

    public ArrayList<String> getRespuestasron4() {
        return respuestasron4;
    }

    public void setRespuestasron4(ArrayList<String> respuestasron4) {
        this.respuestasron4 = respuestasron4;
    }

    public ArrayList<String> getRespuestasron5() {
        return respuestasron5;
    }

    public void setRespuestasron5(ArrayList<String> respuestasron5) {
        this.respuestasron5 = respuestasron5;
    }

    public ArrayList<String> getPreg() {
        return preg;
    }

    public void setPreg(ArrayList<String> preg) {
        this.preg = preg;
    }

    public String addPreguntasMate() {
        //RONDA 1
        preg.add("¿Cuanto es 2+2?");
        //RONDA 2
        preg.add("¿Cual es el area de un rectangulo con base 2cm y altura 4cm?");
        //RONDA 3
        preg.add("¿Cual es el valor de f(x)=4x^2 si x=-2?");
        //RONDA 4
        preg.add("¿Cuál es el valor de la cotangente de 30 grados?");
        //RONDA 5
        preg.add("¿Cómo se conoce la seccion normal de un diedro?");

        return "Matematicas";
    }

    public String addPreguntasTec() {
        //RONDA 1
        preg.add("¿Cual es un dispositivo de entrada?");
        //RONDA 2
        preg.add("¿Quien creo Apple?");
        //RONDA 3
        preg.add("¿Cual es un lenguaje de programacion?");
        //RONDA 4
        preg.add("¿Que velocidad tiene una camara para congelar una imagen?");
        //RONDA 5
        preg.add("¿Como consigue un robot escribir noticias sin ayuda?");

        return "Tecnologia";

    }

    public String addPreguntasGame() {
        //RONDA 1
        preg.add("¿Que personaje es MarioBros?");
        //RONDA 2
        preg.add("¿Que NO se puede hacer en -BLACK- ?");
        //RONDA 3
        preg.add("¿A cual compañia pertenese la PS5?");
        //RONDA 4
        preg.add("¿A cual compañia pertenese la XBOX series X?");
        //RONDA 5
        preg.add("¿En que año se lanzo ZELDA OCARINA OF TIME");

        return "Games";

    }

    public String addPreguntasHisto() {
        //RONDA 1
        preg.add("¿Quien Libero a America?");
        //RONDA 2
        preg.add("¿Quien descubrio a America?");
        //RONDA 3
        preg.add("¿Cuando inicio la primera guerra mundial?");
        //RONDA 4
        preg.add("¿Cuantos años tiene la tierra?");
        //RONDA 5
        preg.add("¿A que se dedicaba Anaximandro?");

        return "Historia";

    }

    public String addPreguntasAnime() {
        //RONDA 1
        preg.add("¿Quien es el Saiyajin mas fuerte de DBZ?");
        //RONDA 2
        preg.add("¿Cuantos casas hay en -Los Caballeros del zodiaco-?");
        //RONDA 3
        preg.add("¿Quien es el protagonista de Attack on titan?");
        //RONDA 4
        preg.add("¿Que es una Yandere?");
        //RONDA 5
        preg.add("¿De que trata -Stains Gate-?");

        return "Anime";

    }

    public String addRespuestasMate() {
        //RONDA 1
        respuestasron1.add("1. 56");
        respuestasron1.add("2. 22");
        respuestasron1.add("3. 4");//RESPUESTA
        respuestasron1.add("4. 16");
        //RONDA 2
        respuestasron2.add("1. 6cm^2");
        respuestasron2.add("2. 8cm^2");//RESPUESTA
        respuestasron2.add("3. 10cm^2");
        respuestasron2.add("4. 12cm^2");
        //RONDA 3
        respuestasron3.add("1. 18");
        respuestasron3.add("2. 61");
        respuestasron3.add("3. -4");
        respuestasron3.add("4. 16");//RESPUESTA
        //RONDA 4
        respuestasron4.add("1. 5^(1/2)");
        respuestasron4.add("2. 180");
        respuestasron4.add("3. 3^(1/2)"); //RESPUESTA
        respuestasron4.add("4. 360");
        //RONDA 5
        respuestasron5.add("1. Angulo rectilineo"); //RESPUESTA
        respuestasron5.add("2. Isoseles");
        respuestasron5.add("3. Dietro");
        respuestasron5.add("4. Angulo Llano");

        return "Matematicas";
    }

    public String addRespuestasTec() {
        //RONDA 1
        respuestasron1.add("1. Camara");
        respuestasron1.add("2. Headphone");
        respuestasron1.add("3. Teclado"); //RESPUESTA
        respuestasron1.add("4. Microfono");
        //RONDA 2
        respuestasron2.add("1. Bill Gates");
        respuestasron2.add("2. Steve Jobs");//RESPUESTA
        respuestasron2.add("3. Elon Musk");
        respuestasron2.add("4. Newton");
        //RONDA 3
        respuestasron3.add("1. HTML");
        respuestasron3.add("2. HTML5");
        respuestasron3.add("3. Wordpress");
        respuestasron3.add("4. Phyton"); //RESPUESTA
        //RONDA 4
        respuestasron4.add("1. 30fps ");
        respuestasron4.add("2. 15fps");
        respuestasron4.add("3. 25fps");//RESPUESTA
        respuestasron4.add("4. 60fps");
        //RONDA 5
        respuestasron5.add("1. Con programacion Estructurada");
        respuestasron5.add("2. Con red neuronal");//RESPUESTA
        respuestasron5.add("3. Con POO");
        respuestasron5.add("4. Con el cerebro");

        return "Tecnologia";

    }

    public String addRespuestasGame() {
        //RONDA 1
        respuestasron1.add("1. Carpintero");
        respuestasron1.add("2. Jardinero");
        respuestasron1.add("3. Bombero");
        respuestasron1.add("4. Plomero"); //RESPUESTA
        //RONDA 2
        respuestasron2.add("1. Matar");
        respuestasron2.add("2. Disparar");
        respuestasron2.add("3. Saltar"); //RESPUESTA
        respuestasron2.add("4. Apuntar");
        //RONDA 3
        respuestasron3.add("1. SONY"); //RESPUESTA
        respuestasron3.add("2. SEGA");
        respuestasron3.add("3. MICROSOFT");
        respuestasron3.add("4. ATARI");
        //RONDA 4
        respuestasron4.add("1. SONY");
        respuestasron4.add("2. SEGA");
        respuestasron4.add("3. MICROSOFT");//RESPUESTA
        respuestasron4.add("4. ATARI");
        //RONDA 5
        respuestasron5.add("1. 2002");
        respuestasron5.add("2. 1998"); //RESPUESTA
        respuestasron5.add("3. 1997");
        respuestasron5.add("4. 2007");

        return "Games";

    }

    public String addRespustasHisto() {
        //RONDA 1
        respuestasron1.add("1. Cristobal Colon");
        respuestasron1.add("2. Simon Bolivar");//RESPUESTA
        respuestasron1.add("3. Galan");
        respuestasron1.add("4. Pablo Escobar");
        //RONDA 2
        respuestasron2.add("1. Cristobal Colon");//RESPUESTA
        respuestasron2.add("2. Simon Bolivar");
        respuestasron2.add("3. Galan");
        respuestasron2.add("4. Pablo Escobar");
        //RONDA 3
        respuestasron3.add("1. 1996");
        respuestasron3.add("2. 1897");
        respuestasron3.add("3. 1972");
        respuestasron3.add("4. 1914");//RESPUESTA
        //RONDA 4
        respuestasron4.add("1. 4543miles de millones");//RESPUESTA
        respuestasron4.add("2. 5996miles de millones");
        respuestasron4.add("3. 2021miles");
        respuestasron4.add("4. 6687milones");
        //RONDA 5
        respuestasron5.add("1. Pintor");
        respuestasron5.add("2. Escultos");
        respuestasron5.add("3. Filosofo");//RESPUESTA
        respuestasron5.add("4. Fisico");

        return "Historia";

    }

    public String addRespuestasAnime() {
        //RONDA 1
        respuestasron1.add("1. Krilin");
        respuestasron1.add("2. Gohan");
        respuestasron1.add("3. Vegeta");
        respuestasron1.add("4. Goku");//RESPUESTA
        //RONDA 2
        respuestasron2.add("1. siete");
        respuestasron2.add("2. diez");
        respuestasron2.add("3. doce");//RESPUESTA
        respuestasron2.add("4. nueve");
        //RONDA 3
        respuestasron3.add("1. Army");
        respuestasron3.add("2. Mikasa");
        respuestasron3.add("3. Levy");
        respuestasron3.add("4. Eren");//RESPUESTA
        //RONDA 4
        respuestasron4.add("1. Una acosadora"); //RESPUESTA
        respuestasron4.add("2. Una egoista");
        respuestasron4.add("3. Una introvertida");
        respuestasron4.add("4. Una extrovertida");
        //RONDA 5
        respuestasron5.add("1. Accion en el cielo");
        respuestasron5.add("2. Parejas en japon");
        respuestasron5.add("3. Viajes en el tiempo");//RESPUESTA
        respuestasron5.add("4. Portales a otras dimenciones");

        return "Anime";

    }

    public void imprimirPreguntasRon1(String categoria) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#1" + preg.get(0) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#1" + preg.get(0) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#1" + preg.get(0) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#1" + preg.get(0) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#1" + preg.get(0) + "\n");
        }

    }

    public void imprimirPreguntasRon2(String categoria) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#2" + preg.get(1) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#2" + preg.get(1) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#2" + preg.get(1) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#2" + preg.get(1) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#2" + preg.get(1) + "\n");
        }

    }
    public void imprimirPreguntasRon3(String categoria) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#3" + preg.get(2) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#3" + preg.get(2) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#3" + preg.get(2) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#3" + preg.get(2) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#3" + preg.get(2) + "\n");
        }

    }

    public void imprimirPreguntasRon4(String categoria) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#4" + preg.get(3) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#4" + preg.get(3) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#4" + preg.get(3) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#4" + preg.get(3) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#4" + preg.get(3) + "\n");
        }

    }
    public void imprimirPreguntasRon5(String categoria) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#5" + preg.get(4) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#5" + preg.get(4) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#5" + preg.get(4) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#5" + preg.get(4) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#5" + preg.get(4) + "\n");
        }

    }

    public void imprimirRespuestasRon1(String categoria) {
        respuestasron1.clear();
        if (categoria == "Matematicas") {
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Tecnologia") {
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Historia") {
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Games") {
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Anime") {
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }

    }

    public void imprimirRespuestasRon2(String categoria) {
        respuestasron2.clear();
        if (categoria == "Matematicas") {
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Tecnologia") {
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Historia") {
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Games") {
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Anime") {
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }

    }

    public void imprimirRespuestasRon3(String categoria) {
        respuestasron3.clear();
        if (categoria == "Matematicas") {
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Tecnologia") {
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Historia") {
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Games") {
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Anime") {
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }

    }

    public void imprimirRespuestasRon4(String categoria) {
        respuestasron4.clear();
        if (categoria == "Matematicas") {
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Tecnologia") {
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Historia") {
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Games") {
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Anime") {
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }

    }

    public void imprimirRespuestasRon5(String categoria) {
        respuestasron5.clear();
        if (categoria == "Matematicas") {
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Tecnologia") {
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Historia") {
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Games") {
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Anime") {
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }

    }

}
