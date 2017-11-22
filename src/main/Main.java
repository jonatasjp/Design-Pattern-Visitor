package main;

import implementacao.ComprasCliente;
import implementacao.FormatoVisitante;
import implementacao.Relatorio;
import implementacao.VisitanteHTML;

public class Main {

	public static void main(String[] args) {
		
		Relatorio r = new ComprasCliente();

		FormatoVisitante fv = new VisitanteHTML();
		String resultado = (String) r.gerarRelatorio(fv);
		
		System.out.println(resultado);
	}
}
