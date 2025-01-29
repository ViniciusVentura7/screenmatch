package Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {


    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    Serie lost = new Serie("Lost", 2000);
    Filme outroFilme = new Filme("Avatar", 2023);
    Filme favorito = new Filme("The Matrix", 1999);
    Filme outro = new Filme("John Wick", 2014);
    Serie serie = new Serie("La Casa de Papel", 2017);
    Filme filmeTest = new Filme("Clube da Luta", 1999);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        lista.add(filmeTest);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(outro);
        lista.add(favorito);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("John Stones");
        System.out.println(buscaPorArtista);
        System.out.println("Lista organizada:");
        Collections.sort(buscaPorArtista);
        System.out.print(buscaPorArtista);
        System.out.println("Lista de Títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

    }
}

