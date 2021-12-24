package m;

public class Ronda {
    Preguntas pr;
    Preguntas re;
    Categoria cat;
    int num;
    boolean inicio;
    boolean fin;
    
       public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public Ronda(){
        pr = getPr();
        re = getRe();
        cat =getCat();
        inicio=true;
        fin=false;
        //this(pr,listPreg,cate,true,false);
    }
    
    public Ronda(Preguntas pr,Preguntas re,Categoria cat,boolean inicio,boolean fin){
            setCat(cat);
            setPr(pr);
            setRe(re);
            setInicio(inicio);
            setFin(fin);
    }
    
    
   /* public Preguntas obtenerPregutas(){
        Categoria cate = new Categoria();
        cate.getName();
        
        Preguntas listPreg = new Preguntas(pr.getText(), pr.getRespuestas(), cate);
        
        listPreg.addPreguntas();
        return listPreg;
    }*/
    

        

    public boolean isInicio() {
        return inicio;
    }

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    
    public Preguntas getPr() {
        return pr;
    }

    public void setPr(Preguntas pr) {
        this.pr = pr;
    }

    public Preguntas getRe() {
        return re;
    }

    public void setRe(Preguntas re) {
        this.re = re;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
    
}
