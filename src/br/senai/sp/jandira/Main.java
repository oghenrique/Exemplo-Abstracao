package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Alunos;
import br.senai.sp.jandira.model.Pessoas;

public class Main {

    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("João", 18);
        Pessoas pessoa2= new Pessoas("Maria", 26);

        System.out.println("O nome é: " + pessoa1.getNome());
        System.out.println("O nome é: " + pessoa2.getNome());

        pessoa1.setNome("Emily");
        System.out.println("O nome é: " + pessoa1.getNome());

        //Aplicando Herança

        Pessoas aluno1 = new Alunos("João", 16, 2323);
        System.out.println(aluno1.getNome());

        //Exemplo Polimorfismo
        aluno1.passarTempo();

        //Exemplo Abstracao
        aluno1.exibirInformacao();

    }
}
