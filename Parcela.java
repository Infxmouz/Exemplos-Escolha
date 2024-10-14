package parcela;
import java.util.Scanner;

public class Parcela {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = leia.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        double nota2 = leia.nextDouble();

        System.out.print("Informe o tipo de média (A,P): ");
        char tipoMedia = leia.next().charAt(0);

        double media;

        switch (Character.toUpperCase(tipoMedia)) {
            case 'A':
                media = (nota1 + nota2) / 2;
                System.out.printf("A média aritmética é: %.2f%n", media);
                break;
            case 'P':
                media = ((nota1 * 3) + (nota2 * 7)) / (3 + 7);
                System.out.printf("A média ponderada é: %.2f%n", media);
                break;
            default:
                System.out.println("Tipo de média inválido!");
                break;
        }

        leia.close();
    }
    
}
