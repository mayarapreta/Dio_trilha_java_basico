import java.util.Scanner;

public class Contaterminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
    
		System.out.println("***BANCO DO BRASIL***"); //imprimir a saida do inicio

	
		    Scanner input = new Scanner(System.in); // começa da compilacao
		System.out.println("Por favor, digite o número da Agência !" );

		String textNameString = input.nextLine();   // string input agencia
System.out.println("sua agencia é: " + textNameString );

String nome_cliente = input.nextLine();
		nome_cliente = "MARIO ANDRADE"; 
		System.out.println("Usuario: " + nome_cliente );
		
	System.out.println("Inserir sua conta:  ");	 
int numconta = input.nextInt();

System.out.println("Inserir o valor do seu saldo:");
		double saldonum = input.nextDouble();
			input.close();

	System.out.println("ÓLA CLIENTE ORBIAGDO POR CRIAR UMA CONTA EM NOSSO BANCO, SUA AGENCIA É: "+ textNameString + 
			" CONTA " + numconta+ "O SEU SALDO " + saldonum +
			" JÁ ESTA DISPONIVEL PARA SAQUE");
	
			
			
    }
}
