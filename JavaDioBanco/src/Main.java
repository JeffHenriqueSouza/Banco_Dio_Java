
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		cc.sacar(50);
	
		Conta cp = new ContaPoupanca();
		
		cc.transferir(25, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
