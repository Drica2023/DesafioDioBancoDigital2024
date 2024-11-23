package bancoDigital;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO DE CONTA POUPANÇA***");
		super.ImprimirInfosComuns();
	}

	}
