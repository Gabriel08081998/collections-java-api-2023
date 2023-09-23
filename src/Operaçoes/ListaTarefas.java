package Operaçoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefas> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descriçao) {
		tarefaList.add( new Tarefas(descriçao));
		
	}
	
	public void removerTarefa(String descriçao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		for(Tarefas t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descriçao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescriçoesTarefas() {
		System.out.println(tarefaList);
		
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa =new ListaTarefas();
		
		listaTarefa.adicionarTarefa("tarefa 1");
		listaTarefa.adicionarTarefa("tarefa 2");
		listaTarefa.adicionarTarefa("tarefa 3");
		
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("tarefa 3");
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescriçoesTarefas();
	}
}
