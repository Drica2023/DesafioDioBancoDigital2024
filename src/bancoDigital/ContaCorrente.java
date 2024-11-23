package bancoDigital;

public class ContaCorrente extends Conta {
	public ContaCorrente(Clientes clientes) {
		super(clientes);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO DE CONTA CORRENTE***");
		super.ImprimirInfosComuns();
	}




}
