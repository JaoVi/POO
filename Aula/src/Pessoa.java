public class Pessoa {
    public String nome;
    public String telefone;

    
    public Pessoa(String nome, String telefone){
        super();
        this.telefone = telefone;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
