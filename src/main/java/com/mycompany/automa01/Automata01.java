package com.mycompany.automa01;

import lombok.Setter;

/*@author kevin*/
public class Automata01 {

    @Setter private String cinta;
    
    public Automata01(String cinta) {
        this.cinta = cinta;
    }
    
    
    //Siempre el estado inicial va en public
    public boolean estadoA(int posicion){
       if(posicion == cinta.length()) return false;
       if(cinta.charAt(posicion)=='0') return estadoB(posicion+1);
       if(cinta.charAt(posicion)=='1') return estadoC(posicion+1);
       return false;
    }
    
    private boolean estadoB(int posicion){
       if(posicion == cinta.length()) return true; 
       if(cinta.charAt(posicion)=='0') return estadoB(posicion+1);
       if(cinta.charAt(posicion)=='1') return estadoB(posicion+1);
       return false;
    }

    private boolean estadoC(int posicion){
        if(posicion == cinta.length()) return true;
        if(cinta.charAt(posicion)=='0') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoC(posicion+1);
        return false;
    }
}
