package pkg01.flor;

/**
 *
 * @author mps_g
 */
public class Principal {
   
    public static void main (String [] args) {
        
        // Criando objeto Flor
        
     Flor flor1 = new Flor ();
         flor1.nome = "Margarida";
         flor1.numero_petalas = 10;
         flor1.preco = 50.49f;
         
    System.out.println (" Nome  " + flor1.getNome () +" Número de Pétalas  " + flor1.numero_petalas + " Preço  " + flor1.preco); 
        
    }
}


