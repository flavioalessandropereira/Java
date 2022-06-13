package br.com.dio.Map;

/*
Dados os seguintes informações sobre meus livos favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor: Haning, Stephen - Livro = nome: Uma Breve História do Tempo, páginas: 256
Autor: Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408
Autor: Horari, Yuval Noah - Livro = nome: Lições para o Século XXI, páginas: 432
 */

import java.util.*;

public class Ex2_ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t");

        Map<String, Livro> meusLivros =  new HashMap<>(){{
            put("Haning, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Horari, Yuval Noah ", new Livro("Lições para o Século XXI", 432));

        }};

        for(Map.Entry<String, Livro>livro: meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("");
        System.out.println("--\tOrdem de Inserção\t--");

        Map<String, Livro> meusLivros1 =  new LinkedHashMap<>(){{
            put("Haning, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Horari, Yuval Noah ", new Livro("Lições para o Século XXI", 432));

        }};

        for(Map.Entry<String, Livro>livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("");
        System.out.println("--\tOrdem alfabética dos autores\t--");
        Map<String, Livro> meusLivros2 =  new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro>livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("");
        System.out.println("--\tOrdem alfabética nome dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
        for(Map.Entry<String, Livro>livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }
}
class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}