
public class Banco {
	Conta[] listaContas;

	Banco(int n) {
		listaContas = new Conta[n];
	}

	Banco() {
		listaContas = new Conta[30];
	}

	boolean adicionaConta(Conta c) {
		for (int i = 0; i < listaContas.length; i++) {
			if (listaContas[i] == null) {
				listaContas[i] = c;
				return true;
			}
		}

		return false;
	}

	Conta getConta(int numeroConta) {
		for (Conta conta : listaContas) {
			if (conta.getNumero() == numeroConta) {
				return conta;
			}
		}
		return null;
	}

	int getTotalContas() {
		int total = 0;
		for (Conta conta : listaContas) {
			if (conta != null) {
				total++;
			}
		}
		return total;
	}

}
