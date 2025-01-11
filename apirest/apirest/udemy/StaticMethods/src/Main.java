class Matematica {
    static int soma(int a, int b) { // Já que o método é estático, ou seja, reconhecido pela JVM como um método da classe e não a uma instância
        return a + b; // Não é necessário criar um objeto no main
    }
}

public class Main {
    public static void main(String[] args) {
        int resultado = Matematica.soma(5, 3);
        System.out.println(resultado); // Saída: 8
    }
}