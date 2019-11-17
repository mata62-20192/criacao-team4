package ufba.abstractfactory;

import ufba.app.TipoDocumento;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriadorDocumentacao(TipoDocumento.MARKDOWN);
		System.out.println(criador.geraDocumentacao());
	}

}
