package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class CriadorHTML extends CriadorDocumentacao {
    public CriadorHTML(){
    }

    public Cabecalho geraCabecalho() {
        return new CabecalhoHTML();
    }

    public Corpo geraCorpo() {
        return new CorpoHTML();
    }

    public Rodape geraRodape() {
        return new RodapeHTML();
    }
}