package implementacao;

import java.util.ArrayList;
import java.util.List;

public class ComprasCliente implements Relatorio {
	private Cliente cliente;
	private List<Item> items;
	
	//inicializando os objetos para o teste
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

	public Object gerarRelatorio(FormatoVisitante fv) {
		fv.visitarTitulo("Compras de " + cliente.getNome());
		fv.visitarParagrafo("CPF " + cliente.getCPF());
		fv.visitarParagrafo("Cliente desde " + cliente.getDataCadastro());
		fv.visitarTabela();
		fv.visitarTabelaCabecalho("Produto", "Data", "Valor");
		for (Item i : items) {
			fv.visitarTabelaLinha(i.getProduto(), i.getDataCompra(), i.getValor());
		}
		fv.visitarTabelaFim();
		return fv.getResultado();
	}
}
