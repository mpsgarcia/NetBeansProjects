package LabJava;
public class Carro {
    public String modelo;
    public int ano;
    private String cor;
    private float preco;
    protected boolean ligado;
    
    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ano " + this.ano);
        System.out.println("Cor " + this.cor);
        System.out.println("Preco " + this.preco);
        System.out.println("Esta ligado? " + this.ligado);
    }
    
    public void dirigir(){
        if(this.ligado == true) {
            System.out.println("Pronto para pilotar!");
        } else {
            System.out.println("ERRO!Carro desligado");
        }
    }
    
    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;    
    }
    
}
