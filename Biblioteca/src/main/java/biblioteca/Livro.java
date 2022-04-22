package biblioteca;

public class Livro {
    String titulo;
    String autor;
    String editora;
    int publicacao;
    float valor;
    
    void status() {
     System.out.println ("Titulo " + this.titulo);
     System.out.println ("Autor " + this.autor);
     System.out.println ("Editora " + this.editora);
     System.out.println ("Ano de Publicação " + this.publicacao);
     System.out.println ("Valor " + this.valor);
    }
}
