package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
     private String nome;
     private Set<Conteudo> conteudoInscritos;
     private Set<Conteudo> conteudoConcluidos;
     
     public Dev() {
    	 this.conteudoInscritos=new LinkedHashSet<>();
    	 this.conteudoConcluidos=new LinkedHashSet<>();
     }
     
	public Dev(String nome, Set<Conteudo> conteudoInscritos, Set<Conteudo> conteudoConcluidos) {
		this.nome = nome;
		this.conteudoInscritos = conteudoInscritos;
		this.conteudoConcluidos = conteudoConcluidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo=this.conteudoInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo...");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudoConcluidos.stream().mapToDouble(conteudo->conteudo.calcularXp()).sum();
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", conteudoInscritos=" + conteudoInscritos + ", conteudoConcluidos="
				+ conteudoConcluidos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluidos, conteudoInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}
 
}
