package menuopcoes;
import java.util.Scanner;

public class MenuOpcoes {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opc;

        System.out.print("Digite uma opção: \n");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");

        opc = leia.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Você escolheu soma!");
                break;
            case 2:
                System.out.println("Você escolheu subtração!");
                break;
            case 3:
                System.out.println("Você escolheu multiplicação!");
                break;
            case 4:
                System.out.println("Obrigado por utilizar nosso programa!");
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        leia.close();
    }
}
