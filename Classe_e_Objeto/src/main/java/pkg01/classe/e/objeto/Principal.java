package pkg01.classe.e.objeto;

/**
 *
 * @author mps_g
 */

public class Principal {
    
    public static void main (String [] args ) {
    
        // Criando um objeto Aluno
        
    Aluno aluno1 = new Aluno ();
            
            aluno1.nome = "Marcos Paulo";
            aluno1.matricula = "0022133";
            aluno1.endereco = "Rua 10";
            aluno1.telefone = "11-9999-9999";
            aluno1.email = "mpsgar@gmail.com";
        
            
        System.out.println ("Nome"+ aluno1.getNome() + 
                "Matricula" + aluno1.matricula + 
                "Endereço" + aluno1.endereco + 
                "Telefone" + aluno1.telefone + 
                "E-mail" + aluno1.email);
        
        
    Aluno aluno2 = new Aluno ();
    
            aluno2.nome = "Jasminy Proença";
            aluno2.matricula = "0023422";
            aluno2.endereco = "Rua 11";
            aluno2.telefone = "11-97271-5034";
            aluno2.email = "jasminyproenca@gmail.com";
            
        System.out.println ("Nome" + aluno2.getNome() + 
                "Matricula" + aluno2.matricula + 
                "Endereço" + aluno2.endereco + 
                "Telefone" + aluno2.telefone +
                "E-mail" + aluno2.email );            
    }

}