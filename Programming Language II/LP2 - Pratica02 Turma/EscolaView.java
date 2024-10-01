import java.util.ArrayList;
import java.util.Scanner;

public class EscolaView {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Aluno 1: ");

                double nota1 = sc.nextDouble();
                double nota2 = sc.nextDouble();
                Prova prova1Aluno1 = new Prova();
                prova1Aluno1.setNotaParte1(nota1);
                prova1Aluno1.setNotaParte2(nota2);
                double notaProva1Aluno1 = prova1Aluno1.calculaNotaMedia();
                prova1Aluno1.setNotaParte1(notaProva1Aluno1);

                double nota3 = sc.nextDouble();
                double nota4 = sc.nextDouble();
                Prova prova2Aluno1 = new Prova();
                prova2Aluno1.setNotaParte2(nota3);
                prova2Aluno1.setNotaParte2(nota4);
                double notaProva2 = prova2Aluno1.calculaNotaMedia();
                prova2Aluno1.setNotaParte2(notaProva2);

                Aluno aluno1 = new Aluno(prova1Aluno1.getNotaParte1(), prova1Aluno1.getNotaParte2());
                double mediaAluno1 = aluno1.calculaMedia();
                aluno1.setMediaAluno(mediaAluno1);

                //

                System.out.println("Aluno 2: ");

                double nota5 = sc.nextDouble();
                double nota6 = sc.nextDouble();
                Prova prova1Aluno2 = new Prova();
                prova1Aluno2.setNotaParte2(nota5);
                prova1Aluno2.setNotaParte2(nota6);
                double notaProva1Aluno2 = prova1Aluno2.calculaNotaMedia();
                prova1Aluno2.setNotaParte2(notaProva1Aluno2);

                double nota7 = sc.nextDouble();
                double nota8 = sc.nextDouble();
                Prova prova2Aluno2 = new Prova();
                prova2Aluno2.setNotaParte2(nota7);
                prova2Aluno2.setNotaParte2(nota8);
                double notaProva2Aluno2 = prova2Aluno2.calculaNotaMedia();
                prova2Aluno2.setNotaParte2(notaProva2Aluno2);

                Aluno aluno2 = new Aluno(prova1Aluno2.getNotaParte1(), prova1Aluno2.getNotaParte2());
                double mediaAluno2 = aluno1.calculaMedia();
                aluno2.setMediaAluno(mediaAluno2);

                //

                System.out.println("Aluno 3: ");

                double nota9 = sc.nextDouble();
                double nota10 = sc.nextDouble();
                Prova prova1Aluno3 = new Prova();
                double notaProva1Aluno3 = prova1Aluno2.calculaNotaMedia();
                prova1Aluno3.setNotaParte2(notaProva1Aluno2);

                double nota11 = sc.nextDouble();
                double nota12 = sc.nextDouble();
                Prova prova2Aluno3 = new Prova();
                double notaProva2Aluno3 = prova2Aluno2.calculaNotaMedia();
                prova2Aluno3.setNotaParte2(notaProva2Aluno2);

                Aluno aluno3 = new Aluno(prova1Aluno3.getNotaParte1(), prova1Aluno3.getNotaParte2());
                double mediaAluno3 = aluno3.calculaMedia();
                aluno3.setMediaAluno(mediaAluno3);

                //

                ArrayList<Aluno> alunos = new ArrayList<>();
                alunos.add(aluno1);
                alunos.add(aluno2);
                alunos.add(aluno3);

                Turma turma = new Turma(alunos);



        }
}