package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class CriadorMARKDOWN extends CriadorDocumentacao {
    public CriadorMARKDOWN() {
    }

    public Cabecalho geraCabecalho() {
        return new CabecalhoMarkdown();
    }

    public Corpo geraCorpo() {
        return new CorpoMarkdown();
    }

    public Rodape geraRodape() {
        return new RodapeMarkdown();
    }
}