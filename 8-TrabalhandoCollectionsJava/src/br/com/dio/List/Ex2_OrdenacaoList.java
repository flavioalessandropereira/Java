package br.com.dio.List;

/*
Dados as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista
exibindo: nome / idade / cor

Gato1: Jon, 18 meses, preto
Gato2: Simba, 06 meses, tigrado
Gato3: Jon, 12 meses, amarelo
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2_OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18,"preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("Jon", 12,"amarelo"));
        }};

        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem Idade\t--");
        //Collections.sort(meusGatos, new Gato.ComparatorIdade());
        meusGatos.sort(new Gato.ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem Cor\t--");
        //Collections.sort(meusGatos, new Gato.ComparatorCor());
        meusGatos.sort(new Gato.ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("");
        System.out.println("--\tOrdem Nome / Cor Idade\t--");
        //Collections.sort(meusGatos, new Gato.ComparatorCor());
        meusGatos.sort(new Gato.ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }


    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }

    }

    static class ComparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0 ) return nome;

            int cor =  g1.getCor().compareToIgnoreCase(g2.getNome());
            if (cor != 0 ) return cor;

            return Integer.compare(g1.getIdade(),g2.getIdade()) ;
        }
    }

}