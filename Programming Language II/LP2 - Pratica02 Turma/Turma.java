import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos;

	public Turma(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public double calcularMedia() {
		double total = 0;
		for (Aluno aluno : alunos) {
			total = total + aluno.getMedia();

			total = total / alunos.size();
		}
		return total;
	}


}