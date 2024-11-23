package bancoDigital;

public class Principal {

	public static void main(String[] args) {
		Clientes fulano = new Clientes();
		fulano.setNome("Adriana");
		
		Conta cc = new ContaCorrente(fulano);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(fulano);
		cc.transferir(100, cp);
		
		
		cc.ImprimirInfosComuns();
		cp.ImprimirInfosComuns();
		
	}

}
