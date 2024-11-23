package bancoDigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Clientes clientes) {
		super(clientes);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO DE CONTA POUPANÇA***");
		super.ImprimirInfosComuns();
	}

	}
