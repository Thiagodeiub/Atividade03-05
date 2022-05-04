
import java.util.Scanner;

public class AtividadePOO {
    public static void main(String[] args) {

        Pessoa pessoa1, pessoa2;

        Scanner scan = new Scanner(System.in);
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa();

        System.out.println("Digite o nome");
        pessoa1.nome = scan.next();
        System.out.println("Digite o peso de " + pessoa1.nome);
        pessoa1.peso = scan.nextFloat();
        System.out.println("Digite a altura de " + pessoa1.nome);
        pessoa1.altura = scan.nextFloat();
        System.out.println("Digite a idade de " + pessoa1.nome);
        pessoa1.idade = scan.nextInt();

        System.out.println("Digite o segundo nome");
        pessoa2.nome = scan.next();
        System.out.println("Digite o peso de " + pessoa2.nome);
        pessoa2.peso = scan.nextFloat();
        System.out.println("Digite a altura de " + pessoa2.nome);
        pessoa2.altura = scan.nextFloat();
        System.out.println("Digite a idade de " + pessoa2.nome);
        pessoa2.idade = scan.nextInt();

        if (pessoa1.idade > pessoa2.idade) {
            System.out.println("O mais velho é: " + pessoa1.nome);
        }else if (pessoa2.idade > pessoa1.idade) {
            System.out.println("O(A) mais velho(a) é: " + pessoa2.nome);
        }else {
            System.out.println("ambos tem a mesma idade");
        }
        if (pessoa1.peso > pessoa2.peso) {
            System.out.println("O(A) mais pesado(a) é: " + pessoa1.nome);
        }else if (pessoa2.peso > pessoa1.peso) {
            System.out.println("O mais pesado é: " + pessoa2.nome);
        }else {
            System.out.println("ambos tem o mesmo peso");
        }


}
    }
