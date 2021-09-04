package application;

public class ContaBanco {
	public int numConta = 0;
	protected String tipo;
	private String dono;
	private double saldo = 0.0;
	private boolean status;

	public ContaBanco(int numConta, String dono) {
		this.numConta = numConta;
		this.dono = dono;
		saldo = 0;
		status = false;
	}

	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (getTipo().equals("cc")) {
			setSaldo(50.0);
		} else if (getTipo().equals("cp")) {
			setSaldo(150.0);
		}
	}

	public void fecharConta() {
		setStatus(false);
	}

	public void depositar(double depositar) {
		saldo += depositar;
	}

	public void sacar(double sacar) {
		saldo -= sacar;
	}

	public void pagarMensal() {
		if (isStatus()) {
			if (getTipo().equals("cc")) {
				saldo -= 12;
			} else {
				saldo -= 20;
			}
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String resumoConta() {
		return String.format("\nResumo da Conta:" + "\nTitular: " + getDono() + "\nNº Conta: " + getNumConta()
				+ "\nTipo: " + getTipo() + "\nStatus: " + isStatus() + "\nSaldo: R$ " + getSaldo());
	}
}
