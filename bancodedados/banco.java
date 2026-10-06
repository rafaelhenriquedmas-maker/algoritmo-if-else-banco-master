import java.util.Scanner;

public class banco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeFundo;
        double taxaJuros;
        double tetoRegulatorio = 13.0;
        boolean risco = false;

        System.out.print("Digite o nome do fundo: ");
        nomeFundo = entrada.nextLine();

        System.out.print("Digite a taxa de juros do CDB (%): ");
        taxaJuros = entrada.nextDouble();

        System.out.println("\n===== RELATÓRIO PRELIMINAR =====");
        System.out.println("Fundo analisado: " + nomeFundo);
        System.out.println("Taxa oferecida: " + taxaJuros + "%");
        System.out.println("Teto regulatório: " + tetoRegulatorio + "%");

        if (taxaJuros > tetoRegulatorio) {
            System.out.println("\n[ALERTA CRÍTICO]");
            System.out.println("Captação agressiva identificada.");
            risco = true;
        } else {
            System.out.println("\n[REGULAR]");
            System.out.println("O ativo está dentro do limite regulatório.");
            risco = false;
        }

        System.out.println("\n===== PARECER FINAL =====");

        if (risco) {
            System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissões.");
        } else {
            System.out.println("Parecer do Auditor: Ativo liberado para comercialização.");
        }

        entrada.close();
    }
}