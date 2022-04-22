package LabJava;

public class LabJava {

    public static void main(String[] args) {
        //Carro 01
        Carro c1 = new Carro();
        c1.modelo = "Ferrari";
        c1.ano = 2020;
        //c1.cor = "Vermelho";
        //c1.preco = 200f;
        c1.ligado = false;
        c1.status();
        //c1.dirigir();
        
        //Carro 02
        Carro c2 = new Carro();
        c2.modelo = "Porshe";
        c2.ano = 2021;
        c2.ligado = true;
        c2.status();
        
    }
}
