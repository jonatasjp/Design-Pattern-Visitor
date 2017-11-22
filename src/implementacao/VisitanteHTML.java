package implementacao;

public class VisitanteHTML implements FormatoVisitante {

	private StringBuilder sb = new StringBuilder();

	public void visitarTitulo(String titulo) {
		sb.append("<h1>" + titulo + "</h1>");
	}

	public void visitarSubtitulo(String subtitulo) {
		sb.append("<h2>" + subtitulo + "</h2>");
	}

	public void visitarParagrafo(String paragrafo) {
		sb.append("<p>" + paragrafo + "</p>");
	}

	public void visitarTabela() {
		sb.append("<table>");
	}

	public void visitarTabelaCabecalho(String... cabecalhos) {
		sb.append("<tr>");
		for (String s : cabecalhos)
			sb.append("<th>" + s + "</th>");
		sb.append("</tr>");
	}

	public void visitarTabelaLinha(Object... linhas) {
		sb.append("<tr>");
		for (Object o : linhas)
			sb.append("<td>" + o.toString() + "</td>");
		sb.append("</tr>");
	}

	public void visitarTabelaFim() {
		sb.append("</table>");
	}

	public void visitarImagem(String path) {
		sb.append("<img src='" + path + "'>");
	}

	public Object getResultado() {
		return sb.toString();
	}

}
