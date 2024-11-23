package bancoDigital;

public class Principal {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.ImprimirInfosComuns();
		cp.ImprimirInfosComuns();
		
	}

}
