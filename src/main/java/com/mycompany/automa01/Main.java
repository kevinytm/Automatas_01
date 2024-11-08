package com.mycompany.automa01;

/*@author kevin*/
public class Main {

    public static void main(String[] args) {
        String cinta = "0101010101011010";
        Automata01 automata01 = new Automata01(cinta);
        System.out.println("La cadena "+cinta+" es valida? "+automata01.estadoA(0));
        
    }
}
