package xadrez;

import jogo_de_tabuleiro.Peca;
import jogo_de_tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca {

    private Cor color;

    public PecaDeXadrez(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro);
        this.color = color;
    }

    public Cor getColor() {
        return color;
    }



}
