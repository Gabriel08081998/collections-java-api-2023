package Operaçoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome,double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<Item>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	 public double calcularValorTotal() {
		 double valorTotal = 0.0; 

		    for (Item item : itemList) {
		        double precoItem = item.getPreco();
		        int quantidade = item.getQuantidade();
		        valorTotal += precoItem * quantidade;
		    }
		    return valorTotal;
	}
	 public void exibirItens() {
		 System.out.println(itemList);
		 }
	
	 
	 public int itemNocarinho() {
			return itemList.size();
	 }
	 
	public static void main(String[] args) {
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		
		compras.adicionarItem("caneta", 1.50 , 3 );
		compras.adicionarItem("caderno", 7.50 , 2 );
		compras.adicionarItem("bolsa", 60.00 , 1 );
		compras.adicionarItem("luva", 30.00 , 1 );
		System.out.println("O numero total de elementos na lista e: " + compras.itemNocarinho());
		
		compras.removerItem("caneta");
		System.out.println("O numero total de elementos na lista e: " + compras.itemNocarinho());
		
		
		double valorTotal = compras.calcularValorTotal();
		System.out.println("Valor total dos itens no carrinho: R$" + valorTotal);

		compras.exibirItens();
	}
	
}
