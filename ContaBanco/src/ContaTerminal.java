import java.util.Scanner; //Importe da classe Scanner

//Classe Conta Terminal
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Método para leitura de dados fornecidos pelo usuário.
        Scanner scanner = new Scanner(System.in);
        
        //Usuário faz input do seu nome.
        System.out.println("Por favor, informe o seu nome: ");
        String name = scanner.nextLine();

        //Usuário faz input da sua agência.
        System.out.println("Por favor, informe a sua Agência Bancária: ");
        String agencia = scanner.next();
        
        //Usuário faz input da sua conta.
        System.out.println("Por favor, informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        //Usuário faz input do seu saldo.
        System.out.println("Por favor, informe o seu saldo: ");
        float saldo = scanner.nextFloat();

        //Sistema informa os dados fornecidos pelo usuário e agradeço por criar uma conta bancária no Banco.
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque! \n", name, agencia, numeroConta, saldo);
    }
}
