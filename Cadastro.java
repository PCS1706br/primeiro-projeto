import java.util.ArrayList;
import java.util.List;

public class Cadastro {
      private List<Pessoa>lista;

      public Cadastro() {
        lista = new ArrayList<>();
      }

      //Adicionar uma nova pessoa
      public void Adicionar(Pessoa p) {
        lista.add(p);
      }

      //Remove uma pessoa pelo ID
      public boolean remover(int id) {
        for (Pessoa p: lista){
            if(p.getId() == id) {
                lista.remove(p);
                return true;
            }
        }
return false;
      }

      // Lista todas as pessoas cadastradas
     public void listar() {
        if(lista.isEmpty()) {
        System.out.println("Nenhuma pessoa cadastrada");
        } else {
            for (Pessoa p: lista) {
              System.out.println(p);
            }
        }
     }

     //Buscar uma pessoa pelo ID
     public Pessoa buscarPorld(int id) {
      for(Pessoa p: lista) {
        if(p.getId() == id) {
          return p;
        }
      }
      return null;
     }
}
