import br.ufrn.imd.modelo.Girafa;

public class ZooView {
	
	public static void main(String[] args) {
		
		Girafa girafa1 = new Girafa();
		girafa1.setNome("Arta");
		girafa1.setPeso(140);
		girafa1.setAlimentacao("Maca");
		girafa1.setAlimentado(true);
		girafa1.setTamanoLingua(10);
		//girafa1.setDataNascimento();
		girafa1.comer();
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		
		bancoDeDados.adionarAnimal(girafa1);
		bancoDeDados.exibirAnimaisCadastrados();
		bancoDeDados.exibirAlimentosTotais();
		
		
	}
}
