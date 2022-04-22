package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        
        Livro l1 = new Livro ();
            l1.titulo = "IT";
            l1.autor = "Stephen King";
            l1.editora = "Editora Suma";
            l1.publicacao = 2019;
            l1.valor = 89.90f;
            l1.status();
    }
}
