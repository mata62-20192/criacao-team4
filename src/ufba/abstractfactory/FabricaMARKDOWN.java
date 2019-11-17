package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class FabricaMARKDOWN extends FabricaDocumentacao {
    public FabricaMARKDOWN() {
    }

    public Cabecalho criaCabecalho() {
        return new CabecalhoMarkdown();
    }

    public Corpo criaCorpo() {
        return new CorpoMarkdown();
    }

    public Rodape criaRodape() {
        return new RodapeMarkdown();
    }
}