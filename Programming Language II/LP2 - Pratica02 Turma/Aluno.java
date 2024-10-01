public class Aluno{
    private double prova1;
    private double prova2;
    private double mediaAluno;

    public Aluno(double prova1, double prova2){
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    public double calculaMedia(){
        return (prova1 + prova2)/2;
    }

    public void setMediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public double getMedia(){
        return mediaAluno;
    }
}