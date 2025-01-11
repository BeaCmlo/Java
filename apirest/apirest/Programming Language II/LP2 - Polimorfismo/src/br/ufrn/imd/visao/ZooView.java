package br.ufrn.imd.visao;

import br.ufrn.imd.dao.BancoDeDados;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ZooView {

    public static void main(String[] args) {

        Girafa girafa1 = new Girafa();
        girafa1.setNome("Arta");
        girafa1.setPeso(140);
        girafa1.setAlimentacao("Maca");
        girafa1.setAlimentado(true);
        girafa1.setTamanoLingua(10);
        Date date1 = new Date(1970, 10,03);
        girafa1.setDataNascimento(date1);
        girafa1.calcularIdade();
        girafa1.comer();

        Tigre tigre1 = new Tigre();
        tigre1.setNome("Fofao");
        tigre1.setPeso(140);
        tigre1.setAlimentacao("Carne");
        Date date2 = new Date(1990, 12,01);
        tigre1.setDataNascimento(date2);
        tigre1.calcularIdade();
        tigre1.setAlimentado(true);
        tigre1.setTipoTigre("Malhado");
        tigre1.comer();



        BancoDeDados bancoDeDados = new BancoDeDados();

        bancoDeDados.adionarAnimal(girafa1);
        bancoDeDados.adionarAnimal(tigre1);
        bancoDeDados.exibirAnimaisCadastrados();
        bancoDeDados.consultar(girafa1);
        bancoDeDados.exibirAlimentosTotais();

        bancoDeDados.listarIdade();
    }
}
