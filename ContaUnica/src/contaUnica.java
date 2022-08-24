import java.util.Scanner;

public class contaUnica {

	public static void main(String[] args) {
		
		int escolha;
		double valor;
		Scanner in = new Scanner(System.in);
		String aux;
		
		System.out.println("Digite o titular da conta: ");
		aux = in.nextLine();
		
		conta c1 = new conta(aux);
		
		do {
			
			
			
			System.out.println("");
			System.out.println("----Money Bank----");
			System.out.println("1 - Dados Bancarios");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("0 - Sair");
			System.out.println("Opcao: ");
			escolha = in.nextInt();
			System.out.println("");
			
			
			
			if(escolha == 1) {
				c1.dadosBancarios();
			}else if (escolha == 2){
				System.out.println("Digite o valor: ");
				valor = in.nextDouble();
				
				c1.depositar(valor);
			}else if(escolha == 3) {
				System.out.println("Digite o valor: ");
				valor = in.nextDouble();
				
				c1.Sacar(valor);
			}
			
		}while (escolha != 0);
		
	}
	
}
