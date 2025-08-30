public class Pessoa {

    int id;
    String nome;
    String email;
    String telefone;

    public Pessoa(int id, String nome, String email, String telefone) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    }
    public int getId() {
        return id;
    }
     public String getNome() {
        return nome;
    }
     public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
public void setNome(String nome) {
    this.nome = nome;
}

public void setEmail(String email) {
    this.email = email;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Pessoa {" + "\n" +
    "Nome: " + nome + "\n" +
    "ID: " + id + "\n" +
    "Email: " + email + "\n" +
    "Telefone: " + telefone +
    "}";  
}
}
