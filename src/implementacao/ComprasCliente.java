package implementacao;

import java.util.ArrayList;
import java.util.List;

public class ComprasCliente implements Relatorio {
	private Cliente cliente;
	private List<Item> items;

	// inicializando os objetos para o teste
	public ComprasCliente() {
		this.cliente = new Cliente();
		this.cliente.setNome("JONATAS");
		this.cliente.setCPF("15491316519");
		this.cliente.setDataCadastro("14/12/2014");

		this.items = new ArrayList<>();

		Item item = new Item();
		item.setDataCompra("14/12/2014");
		item.setProduto("fone de ouvido");
		item.setValor(500d);

		this.items.add(item);
	}

	public Object gerarRelatorio(FormatoVisitante visitante) {
		visitante.visitarTitulo("Compras de " + cliente.getNome());
		visitante.visitarParagrafo("CPF " + cliente.getCPF());
		visitante.visitarParagrafo("Cliente desde " + cliente.getDataCadastro());
		visitante.visitarTabela();
		visitante.visitarTabelaCabecalho("Produto", "Data", "Valor");
		for (Item item : items) {
			visitante.visitarTabelaLinha(item.getProduto(), item.getDataCompra(), item.getValor());
		}
		visitante.visitarTabelaFim();
		return visitante.getResultado();
	}
}
