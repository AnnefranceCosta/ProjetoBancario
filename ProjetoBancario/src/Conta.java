import java.util.Random;

public class Conta {
	int numero;
	String titular;
	double saldo;

	Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	Conta(String titular, double saldo) {
		Random aleatorio = new Random();
		this.numero = aleatorio.nextInt(50);
		this.titular = titular;
		this.saldo = saldo;
	}

	boolean deposita(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		}
		return false;
	}

	boolean saca(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	boolean transfere(Conta destino, double valor) {
		if (saca(valor)) {
			if (destino.deposita(valor)) {

				return true;
			} else {
				this.deposita(valor);
			}
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}
}
