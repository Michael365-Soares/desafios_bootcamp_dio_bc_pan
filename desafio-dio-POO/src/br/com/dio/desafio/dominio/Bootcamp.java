package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio=LocalDate.now();
    private final LocalDate dataFim=dataInicio.plusDays(45);
    private Set<Conteudo> conteudos;
    private Set<Dev> devs;
    
    public Bootcamp() {
    	this.conteudos=new LinkedHashSet<>();
    	this.devs=new LinkedHashSet<>();
    }
    
    

	public Bootcamp(String nome, String descricao) {
		this.conteudos=new LinkedHashSet<>();
    	this.devs=new LinkedHashSet<>();
		this.nome = nome;
		this.descricao = descricao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}



	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}



	public Set<Dev> getDevs() {
		return devs;
	}



	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}



	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFim, dataInicio, descricao, devs, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFim, other.dataFim)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(nome, other.nome);
	}
    
    
    
}
