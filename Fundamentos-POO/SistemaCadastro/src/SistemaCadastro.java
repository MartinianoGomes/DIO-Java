import com.cadastromais.model.Pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//continua ...
		marcos.setEndereco("Endereço tal");

		System.out.println(marcos);
	}
}