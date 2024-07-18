package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}

