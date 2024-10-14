package parcelafinanciamento;
import java.util.Scanner;

public class ParcelaFinanciamento {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Valor total da compra: R$ ");
        double valorTotal = leia.nextDouble();

        System.out.print("Quantidade de parcelas (2, 4, 6, 8): ");
        int parcelas = leia.nextInt();

        double juros;

        switch (parcelas) {
            case 2:
                juros = 0.32; 
                break;
            case 4:
                juros = 0.74;
                break;
            case 6:
                juros = 0.96; 
                break;
            case 8:
                juros = 1.28;
                break;
            default:
                System.out.println("Número de parcelas inválido!");
                leia.close();
                return;
        }

        double valorComJuros = valorTotal * (1 + juros);
        double valorParcela = valorComJuros / parcelas;

        System.out.printf("O valor de cada parcela é: R$ %.2f%n", valorParcela);

        leia.close();
    }
    
}
