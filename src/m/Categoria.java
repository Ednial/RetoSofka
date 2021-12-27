package m;
import java.util.ArrayList;
public class Categoria {    
    String name;
    ArrayList<String> cadCategorias = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {    
        this.name = name;
    }
    //Elige una categoria aleatoriamente.
    public String categoriaRandom(){
            String m,t,g,h,a;
            m="Matematicas";
            t="Tecnologia";
            g="Games";
            h="Historia";
            a="Anime";
            cadCategorias.add(m);
            cadCategorias.add(t);
            cadCategorias.add(g);
            cadCategorias.add(h);
            cadCategorias.add(a);
            int aleatorio = (int)(Math.random()*4); //Numero random.
            setName(cadCategorias.get(aleatorio));
            return cadCategorias.get(aleatorio);
    }   
}
