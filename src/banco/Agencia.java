package banco;

import java.util.Scanner;

public class Agencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlckBank blckBank = new BlckBank();

        System.out.println("Informe seu CPF");
        blckBank.setCpf(scanner.next());

        blckBank.setNome("Kadoo The Software Engineer");
        blckBank.setSaldo(25000);

        System.out.println("");

        String titular = blckBank.getNome();
        String cpf = blckBank.getCpf();
        double saldo = blckBank.getSaldo();

        System.out.println("Titular: " + titular);
        System.out.println("CPF do Titular: " + cpf);
        System.out.println("Saldo da conta: R$" + saldo);

        scanner.close();
    }
}
