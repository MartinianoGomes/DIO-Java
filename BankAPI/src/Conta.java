public class Conta {
	// Variáveis disponíveis para toda classe Conta.
	private Double saldo;

	public Conta (Double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(Double valor) {
		// Variável disponível somente para o método sacar().
		double novoValor = saldo - valor;

		saldo = novoValor;
	}

	public void imprimirSaldo(){
		// Variável "saldo" está disponível em toda classe Conta.
		System.out.println(saldo);

		// Somente o método "sacar" conhece a variável "novoSaldo".
		System.out.println(novoSaldo);
	}

	public double calcularDividaExponencial(){
		// Variáveis locais de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando variável zerada

		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}