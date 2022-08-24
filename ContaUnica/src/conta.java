
public class conta {

	private int numero;
	private String titular;
	private double saldo;
	//Pro valor ser estatico na classe, pra ir somando, se nao fosse estatico nao somaria 
	static int quantidadeContas = 0;
	
	//Construtor	
	public conta(String parametrosTitular) {
		
		this.titular = parametrosTitular;
		quantidadeContas++;
		this.numero = quantidadeContas;
		this.saldo = 0;
	}
	
	//Void porque nao vai voltar valor 
	public void dadosBancarios() {
		
		System.out.println("");
		System.out.println("-----Dados Bancarios----");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Titular da conta: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("");
		
	}
	
	public void depositar (double pValor) {
		
		System.out.println("");
		System.out.println("----DEPOSITAR----");
		System.out.println("Saldo Anterior: " + this.saldo);
		this.saldo += pValor; // pro saldo receber o valor que o cliente digitar
		System.out.println("Saldo Atual: " + this.saldo);
		System.out.println("");
		
	}
	
	public void Sacar (double pSacar){
		
		System.out.println("");
		System.out.println("Saldo Anterior " + this.saldo);
		if(pSacar <= this.saldo) {
			this.saldo -= pSacar;
			System.out.println("Saldo Atual: " + this.saldo);
			} else {
				System.out.println("Saldo Insuficiente");
			}
		System.out.println("");
	
		
	}
	
}
