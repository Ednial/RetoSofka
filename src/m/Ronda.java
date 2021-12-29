package m;
import v.Vista;

public class Ronda {
    int num;
    Preguntas preg = new Preguntas();
    Vista view = new Vista();

    public Ronda(){
        this.num=num;
    }
               
       public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
        public void rondas(String cat, int x){    
        setNum(x+1);

        if (getNum() == x+1) {
            if (cat == preg.addPreguntasMate()) {
                view.mostrarPreguntasRon(cat,x);
            }            
            if (cat == preg.addPreguntasTec()) {
                view.mostrarPreguntasRon(cat,x);
            }
            if (cat == preg.addPreguntasHisto()) {
                view.mostrarPreguntasRon(cat,x);
            }
            if (cat == preg.addPreguntasGame()) {
                view.mostrarPreguntasRon(cat,x);
            }
            if (cat == preg.addPreguntasAnime()) {
                view.mostrarPreguntasRon(cat,x);
            }
        }// fin del if(getnum==x)
    }//fin del metodo Rondas();
}
