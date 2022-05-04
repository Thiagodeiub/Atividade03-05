import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("digite o nome do produto");
        produto.nome = scan.nextLine();
        System.out.println("digite o preço de custo");
        produto.precodecusto = scan.nextFloat();
        System.out.println("digite o preço de venda");
        produto.precodevenda = scan.nextFloat();

        System.out.println("Nome do produto: " + produto.nome + ". Preço de custo: R$"+ produto.precodecusto+
                " Preço de venda: R$"+ produto.precodevenda);


    }
}
//Criar uma classe produto, que tem os
//atributos nome, preço de custo e preço de venda, mostrar na classe principal os produtos e seus atributos;