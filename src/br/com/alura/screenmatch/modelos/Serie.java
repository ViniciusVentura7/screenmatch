package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosTemp;
    private int minEp;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosTemp() {
        return episodiosTemp;
    }

    public void setEpisodiosTemp(int episodiosTemp) {
        this.episodiosTemp = episodiosTemp;
    }

    public int getMinEp() {
        return minEp;
    }

    public void setMinEp(int minEp) {
        this.minEp = minEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosTemp * minEp;
    }
}
