package m;

import m.Premio;
public class Jugador {
    private String name;
    private double score;
    
    Premio ptj = new Premio();
    
    public void asignarScore(){
        score= ptj.getPremio();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    
}
