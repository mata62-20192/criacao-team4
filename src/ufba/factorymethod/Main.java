package ufba.factorymethod;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class Main {

    public static void main(String[] Args) {
    	
        CriadorDocumentacao criador = new CriadorHTML();

        Cabecalho cabecalhoHTML = criador.geraCabecalho();
        Corpo corpoHTML = criador.geraCorpo();
        Rodape rodapeHTML = criador.geraRodape();

        cabecalhoHTML.setTitulo("Padroes de projeto");
        cabecalhoHTML.setEmpresa("Universidade Federal da Bahia");
        corpoHTML.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        rodapeHTML.setData(new Date());
        System.out.println(cabecalhoHTML.getOutput());
        System.out.println(corpoHTML.getOutput());
        System.out.println(rodapeHTML.getOutput());
    	
    	criador = new CriadorMARKDOWN();

        Cabecalho cabecalhoMARKDOWN = criador.geraCabecalho();
        Corpo corpoMARKDOWN = criador.geraCorpo();
        Rodape rodapeMARKDOWN = criador.geraRodape();

        cabecalhoMARKDOWN.setTitulo("Padroes de projeto");
        cabecalhoMARKDOWN.setEmpresa("Universidade Federal da Bahia");
        corpoMARKDOWN.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        rodapeMARKDOWN.setData(new Date());
        System.out.println(cabecalhoMARKDOWN.getOutput());
        System.out.println(corpoMARKDOWN.getOutput());
        System.out.println(rodapeMARKDOWN.getOutput());


    }
}