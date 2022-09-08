public class Produto {
    public String nome;
    public String marca;
    public int quantidade;
    public double preco;
    public String codigo_barras;
    public double desconto;
    
    Produto(){
        nome = "s/n";
        marca = "s/n";
        quantidade = 0;
    }
    
    Produto(String nome, String marca, int quantidade){
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }
    
    void mostrarDados(){
        
        System.out.println("Dados do Produto: "
        + "\nNome: "+nome
        + "\nCodigo de Barras: "+codigo_barras
        + "\nMarca: "+marca
        + "\nPreço: "+preco
        + "\nQuantidade: "+quantidade
        );
    }
    double calculaDesconto(){
        double valor = preco - (preco * desconto);
        return valor;
    }
    
    double calculaDesconto2(double p, double d){
        double result = p -(p*d);
        return result;
    }
}


