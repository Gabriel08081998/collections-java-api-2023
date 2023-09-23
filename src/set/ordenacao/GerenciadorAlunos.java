package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunos;
	
	public void GerenciadorAluno() {
		this.alunos = new HashSet<>();
	}
	public void adicionarAluno (String nome, long matricula, double media) {
		alunos.add(new Aluno(nome, matricula, media));
	}
	public void removerAlunoPorMatricula(long matricula) {
		Aluno alunoParaRemover = null;
	    if (!alunos.isEmpty()) {
	      for (Aluno a : alunos) {
	        if (a.getMatricula() == matricula) {
	          alunoParaRemover = a;
	          break;
	        }
	      }
	      alunos.remove(alunoParaRemover);
	    }else {
	    	throw new RuntimeException("O conjunto está vazio!");
	    	
	    }
	    if (alunoParaRemover == null) {
	    	
	    }
	}
	public void exibirAlunosPorNome() {
	    Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
	    if (!alunos.isEmpty()) {
	      System.out.println(alunosPorNome);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	}
	
	public void exibirAlunosPorNota() {
	    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
	    if (!alunos.isEmpty()) {
	      alunosPorNota.addAll(alunos);
	      System.out.println(alunosPorNota);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }
	
	public static void main(String[] args) {
	    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    System.out.println("Alunos no gerenciador:");
	    System.out.println(gerenciadorAlunos.alunos);

	    gerenciadorAlunos.removerAlunoPorMatricula(000L);
	    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
	    System.out.println(gerenciadorAlunos.alunos);

	    gerenciadorAlunos.exibirAlunosPorNome();

	    gerenciadorAlunos.exibirAlunosPorNota();
	  }
	}
	
	

