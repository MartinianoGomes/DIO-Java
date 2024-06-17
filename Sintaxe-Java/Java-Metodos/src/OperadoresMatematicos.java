public class OperadoresMatematicos {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return num1 + num2;
	}

	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{
		return dividendo / divisor;
	}
	
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
}