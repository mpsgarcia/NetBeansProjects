package com.mycompany.aula02;


public class Aula02 {
    public static void main(String[] args) {
       
        // Caneta 01        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        // Caneta 02
        
        Caneta c2 = new Caneta ();
        c2.modelo = "Mont Blank";
        c2.cor = "Preta";
        c2.tampar();
        c2.status();
        c2.rabiscar(); 

        // Caneta 03 
        
        Caneta c3 = new Caneta();
        c3.modelo = "Muji";
        c3.cor = "Vermelho";
        c3.tampar();
        c3.status();
        c3.rabiscar();
        
    }
}
