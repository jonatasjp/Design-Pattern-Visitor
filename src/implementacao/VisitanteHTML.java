package implementacao;

public class VisitanteHTML implements FormatoVisitante {

	private StringBuilder sb = new StringBuilder();

	public void visitarTitulo(String t) {
		sb.append("<h1>" + t + "</h1>");
	}

	public void visitarSubtitulo(String t) {
		sb.append("<h2>" + t + "</h2>");
	}

	public void visitarParagrafo(String p) {
		sb.append("<p>" + p + "</p>");
	}

	public void visitarTabela() {
		sb.append("<table>");
	}

	public void visitarTabelaCabecalho(String... ct) {
		sb.append("<tr>");
		for (String s : ct)
			sb.append("<th>" + s + "</th>");
		sb.append("</tr>");
	}

	public void visitarTabelaLinha(Object... obs) {
		sb.append("<tr>");
		for (Object o : obs)
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
