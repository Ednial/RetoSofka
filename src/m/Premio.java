package m;

public class Premio {    
    private double premio;
    
    public Premio(){
        this.premio=premio;
    }
    
    public double getPremio() {
        return premio;
    }
    
    public void setPremio(double premio) {
        this.premio = premio;
    }
       
    public void puntaje(int ronda, double prem){
        setPremio(prem);
        if(ronda==1){
            System.out.println("Mal... Premio "+getPremio()+"$");
        }
        if(ronda==2){
            System.out.println("Bien... Premio "+getPremio()+"$");
        }
        if(ronda==3){
            System.out.println("Mejor... Premio "+getPremio()+"$");
        }
        if(ronda==4){
            System.out.println("¡Bien Hecho!... Premio "+getPremio()+"$");
        }
        if(ronda==5){
            System.out.println("EXCELENTE... Premio "+getPremio()+"$");
        }         
    }
}
