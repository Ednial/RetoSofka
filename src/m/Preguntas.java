package m;

import java.util.ArrayList;

public class Preguntas {

    
    ArrayList<String> preg = new ArrayList<String>();
    ArrayList<String> respuestasron1 = new ArrayList<String>();
    ArrayList<String> respuestasron2 = new ArrayList<String>();
    ArrayList<String> respuestasron3 = new ArrayList<String>();
    ArrayList<String> respuestasron4 = new ArrayList<String>();
    ArrayList<String> respuestasron5 = new ArrayList<String>();

    public Preguntas(){
        this.preg=preg;
        this.respuestasron1=respuestasron1;
        this.respuestasron2=respuestasron2;
        this.respuestasron3=respuestasron3;
        this.respuestasron4=respuestasron4;
        this.respuestasron5=respuestasron5;
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
    
    public boolean respuestasCorrecta(int x,int ronda,String cat){
        boolean pass= false;
        //RESPUESTA MATEMATICAS RONDA 1
        if(x==3&&ronda==1&&cat=="Matematicas"){
            pass=true;
        }
        //RESPUESTA MATEMATICAS RONDA 2
        if(x==2&&ronda==2&&cat=="Matematicas"){
            pass=true;
        }
        //RESPUESTA MATEMATICAS RONDA 3
        if(x==4&&ronda==3&&cat=="Matematicas"){
            pass=true;
        }
        //RESPUESTA MATEMATICAS RONDA 4
        if(x==3&&ronda==4&&cat=="Matematicas"){
            pass=true;
        }
        //RESPUESTA MATEMATICAS RONDA 5
        if(x==1&&ronda==5&&cat=="Matematicas"){
            pass=true;
        }
        //RESPUESTA TECNOLOGIA RONDA 1
        if(x==3&&ronda==1&&cat=="Tecnologia"){
            pass=true;
        }
        //RESPUESTA TECNOLOGIA RONDA 2
        if(x==2&&ronda==2&&cat=="Tecnologia"){
            pass=true;
        }
        //RESPUESTA TECNOLOGIA RONDA 3
        if(x==4&&ronda==3&&cat=="Tecnologia"){
            pass=true;
        }
        //RESPUESTA TEGNOLOGIA RONDA 4
        if(x==3&&ronda==4&&cat=="Tecnologia"){
            pass=true;
        }
        //RESPUESTA TECNOLOGIA RONDA 5
        if(x==2&&ronda==5&&cat=="Tecnologia"){
            pass=true;
        }
        //RESPUESTA GAMES RONDA 1
        if(x==4&&ronda==1&&cat=="Games"){
            pass=true;
        }
        //RESPUESTA GAMES RONDA 2
        if(x==3&&ronda==2&&cat=="Games"){
            pass=true;
        }
        //RESPUESTA GAMES RONDA 3
        if(x==1&&ronda==3&&cat=="Games"){
            pass=true;
        }
        //RESPUESTA GAMES RONDA 4
        if(x==3&&ronda==4&&cat=="Games"){
            pass=true;
        }
        //RESPUESTA GAMES RONDA 5
        if(x==2&&ronda==5&&cat=="Games"){
            pass=true;
        }
        //RESPUESTA HISTORIA RONDA 1
        if(x==2&&ronda==1&&cat=="Historia"){
            pass=true;
        }
        //RESPUESTA HISTORIA RONDA 2
        if(x==1&&ronda==2&&cat=="Historia"){
            pass=true;
        }
        //RESPUESTA HISTORIA RONDA 3
        if(x==4&&ronda==3&&cat=="Historia"){
            pass=true;
        }
        //RESPUESTA HISTORIA RONDA 4
        if(x==1&&ronda==4&&cat=="Historia"){
            pass=true;
        }
        //RESPUESTA HISTORIA RONDA 5
        if(x==3&&ronda==5&&cat=="Historia"){
            pass=true;
        }
        //RESPUESTA ANIME RONDA 1
        if(x==4&&ronda==1&&cat=="Anime"){
            pass=true;
        }
        //RESPUESTA ANIME RONDA 2
        if(x==3&&ronda==2&&cat=="Anime"){
            pass=true;
        }
        //RESPUESTA ANIME RONDA 3
        if(x==4&&ronda==3&&cat=="Anime"){
            pass=true;
        }
        //RESPUESTA ANIME RONDA 4
        if(x==1&&ronda==4&&cat=="Anime"){
            pass=true;
        }
        //RESPUESTA ANIME RONDA 5
        if(x==3&&ronda==5&&cat=="Anime"){
            pass=true;
        }        
        return pass;
    }

    public void imprimirPreguntasRon(String categoria, int x) {
        preg.clear();
        if (categoria == "Matematicas") {
            addPreguntasMate();
            System.out.println("RONDA#"+(x+1)+ preg.get(x) + "\n");
        }
        if (categoria == "Tecnologia") {
            addPreguntasTec();
            System.out.println("RONDA#"+(x+1)+ preg.get(x) + "\n");
        }
        if (categoria == "Historia") {
            addPreguntasHisto();
            System.out.println("RONDA#"+(x+1)+ preg.get(x) + "\n");
        }
        if (categoria == "Games") {
            addPreguntasGame();
            System.out.println("RONDA#"+(x+1)+ preg.get(x) + "\n");
        }
        if (categoria == "Anime") {
            addPreguntasAnime();
            System.out.println("RONDA#"+(x+1)+ preg.get(x) + "\n");
        }

    }
    public void imprimirRespuestasRon(String categoria, int x) {
        x++;
        //RONDA UNO
        if (categoria == "Matematicas"&& x==1) {
            respuestasron1.clear();
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Tecnologia" && x==1) {
            respuestasron1.clear();
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Historia" && x==1) {
            respuestasron1.clear();
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Games" && x==1) {
            respuestasron1.clear();
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        if (categoria == "Anime" && x==1) {
            respuestasron1.clear();
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron1.get(i));
            }
        }
        //RONDA DOS
        if (categoria == "Matematicas"&& x==2) {
            respuestasron2.clear();
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Tecnologia" && x==2) {
            respuestasron2.clear();
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Historia" && x==2) {
            respuestasron2.clear();
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Games" && x==2) {
            respuestasron2.clear();
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        if (categoria == "Anime" && x==2) {
            respuestasron2.clear();
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron2.get(i));
            }
        }
        //RONDA TRES
        if (categoria == "Matematicas"&& x==3) {
            respuestasron3.clear();
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Tecnologia" && x==3) {
            respuestasron3.clear();
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Historia" && x==3) {
            respuestasron3.clear();
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Games" && x==3) {
            respuestasron3.clear();
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        if (categoria == "Anime" && x==3) {
            respuestasron3.clear();
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron3.get(i));
            }
        }
        //RONDA CUATRO
        if (categoria == "Matematicas"&& x==4) {
            respuestasron4.clear();
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Tecnologia" && x==4) {
            respuestasron4.clear();
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Historia" && x==4) {
            respuestasron4.clear();
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Games" && x==4) {
            respuestasron4.clear();
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        if (categoria == "Anime" && x==4) {
            respuestasron4.clear();
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron4.get(i));
            }
        }
        //RONDA CINCO
        if (categoria == "Matematicas"&& x==5) {
            respuestasron5.clear();
            addRespuestasMate();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Tecnologia" && x==5) {
            respuestasron5.clear();
            addRespuestasTec();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Historia" && x==5) {
            respuestasron5.clear();
            addRespustasHisto();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Games" && x==5) {
            respuestasron5.clear();
            addRespuestasGame();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }
        if (categoria == "Anime" && x==5) {
            respuestasron5.clear();
            addRespuestasAnime();
            for (int i = 0; i < 4; i++) {
                System.out.println(respuestasron5.get(i));
            }
        }

    }//Fin del metodo imprimirRespues();

}
