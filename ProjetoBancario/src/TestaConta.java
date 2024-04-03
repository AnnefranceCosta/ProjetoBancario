
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Annefrance Costa", 10000);

		// System.out.println("O numero da conta: " + c1.numero + " E o saldo do(a)
		// Sr(a) " + c1.titular + " é: " + c1.saldo);

		Conta c2 = new Conta("Maria Silva", 75);
		Conta c3 = new Conta("João Silva", 90);
		Conta c4 = new Conta("José Silva", 950);
		Conta c5 = new Conta("Roberta Souza", 10);
		Banco bancoDoBrasil = new Banco();

		bancoDoBrasil.adicionaConta(c1);
		bancoDoBrasil.adicionaConta(c2);
		bancoDoBrasil.adicionaConta(c3);
		bancoDoBrasil.adicionaConta(c4);
		bancoDoBrasil.adicionaConta(c5);

		// System.out.println("O banco possui " + bancoDoBrasil.getTotalContas());

		//bancoDoBrasil.adicionaConta(c3);

		System.out.println("O banco possui " + bancoDoBrasil.getTotalContas() + " contas.");
	}

}
