

public class App {
    public static void main(String[] args) {
 Cadastro cadastro = new Cadastro();

 Pessoa p1 = new Pessoa(1, "Paulo", "piau@gmail.com", "9999-9999");

 cadastro.Adicionar(p1);

 //cadastro.listar();

 Pessoa buscada = cadastro.buscarPorld(1);
 System.out.println(buscada);
    }
}

