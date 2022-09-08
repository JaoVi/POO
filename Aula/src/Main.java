import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto("Relogio","Rolex", 10);
        
        System.out.println("\nNome: "+p3.nome);
        System.out.println("\nMarca: "+p4.marca); 
       
        p1.codigo_barras = "1234123421341";
        p1.marca = "Intel";
        p1.nome = "Processador";
        p1.preco = 800.00;
        p1.quantidade = 10;
        p1.desconto = 0.1;
        
        p1.mostrarDados();
        System.out.println("O Preço com desconto fica: " +p1.calculaDesconto());
        
        System.out.println("________________________________");

        Scanner n = new Scanner (System.in);
        System.out.println("Digite o nome do produto:");
        String nome = n.nextLine();
        System.out.println("Digite o preço do produto:");
        double p = n.nextDouble();
        System.out.println("Digite o valor do desconto");
        double d = n.nextDouble();
        
        double res = p2.calculaDesconto2(p, d);
        System.out.println("Resultado: "+res);;
          
    }
    
}
