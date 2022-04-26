package aula04;


public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("NIC", 1.0f, "PRETA");
        Caneta c2 = new Caneta("TAURUS", 0.4f, "AMARELA");
        c1.status();
        c2.status();
    }
}
