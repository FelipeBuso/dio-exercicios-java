package conta_bancaria;

public class Conta {

	private double saldo = 0;
	private double limite = 0;
	
	public Conta(double abertura) {
		if (abertura > 500) {
			this.limite = abertura * 0.5;
		} else {
			this.limite = 50;
		}
		this.saldo = abertura + this.limite;
	}

	public double getLimite() {
		return limite;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		if (this.saldo < limite) {
			double limiteUsado = this.limite - this.saldo;
			double taxaLimiteUsado = limiteUsado * 0.2;
			this.saldo = this.saldo + deposito - taxaLimiteUsado;
		} else {
			this.saldo = this.saldo + deposito;	
		}
	}
	
	private void retiraValor(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente para realizar a operação");
			
		} else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void pagamento(double pagamento) {
		retiraValor(pagamento);
	}
	
	public void saque(double saque) {
		retiraValor(saque);
	}
	
	public void limiteUsado() {
		if (this.saldo < this.limite) {
			double limiteUsado = this.limite - this.saldo;
			System.out.println("Limite usado: " + limiteUsado);
		} else {
			System.out.println("Não está usando o limite");
		}
			
	}


}
