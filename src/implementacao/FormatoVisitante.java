package implementacao;

public interface FormatoVisitante {
	
	public void visitarTitulo(String titulo);

	public void visitarSubtitulo(String subtitulo);

	public void visitarParagrafo(String paragrafo);

	public void visitarTabela();

	public void visitarTabelaCabecalho(String... cabecalhos);

	public void visitarTabelaLinha(Object... linhas);

	public void visitarTabelaFim();

	public void visitarImagem(String path);

	public Object getResultado();

}