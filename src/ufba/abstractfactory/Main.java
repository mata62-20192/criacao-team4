package ufba.abstractfactory;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class Main {
    public static void main(String[] Args) {
        FabricaDocumentacao fabricaHTML = new FabricaHTML();
        CriadorDocumentacao criador = new CriadorDocumentacao(fabricaHTML);
        
        Cabecalho cabecalho = criador.geraCabecalho();
        Corpo corpo = criador.geraCorpo();
        Rodape rodape = criador.geraRodape();
        System.out.println(cabecalho.getOutput());
        System.out.println(corpo.getOutput());
        System.out.println(rodape.getOutput());
        
        FabricaDocumentacao fabricaMARKDOWN = new FabricaMARKDOWN();
        criador.setFabrica(fabricaMARKDOWN);
        
        cabecalho = criador.geraCabecalho();
        corpo = criador.geraCorpo();
        rodape = criador.geraRodape();
        System.out.println(cabecalho.getOutput());
        System.out.println(corpo.getOutput());
        System.out.println(rodape.getOutput());
        
        
    }
}