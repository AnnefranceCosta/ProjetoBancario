
public class TestaBanco {

	public static void main(String[] args) {

		Conta c1 = new Conta("José Silva", 950);
		Conta c2 = new Conta("Maria Silva", 0);
		Conta c3 = new Conta("João Silva", 90);
		Banco bancoDoBrasil = new Banco(20);

		bancoDoBrasil.adicionaConta(c1);

		bancoDoBrasil.adicionaConta(c2);

		// System.out.println("O banco possui " + bancoDoBrasil.getTotalContas());

		bancoDoBrasil.adicionaConta(c3);

		System.out.println("O banco possui " + bancoDoBrasil.getTotalContas());

	}
}
