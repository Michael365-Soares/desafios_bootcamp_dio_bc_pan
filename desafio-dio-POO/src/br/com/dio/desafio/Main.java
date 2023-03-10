package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
		Conteudo curso1=new Curso("Curso Java","Descrição curso java",8);
		
		Conteudo curso2=new Curso("Curso Js","Descrição curso Js",4);
		
		Conteudo mentoria1=new Mentoria("Mentoria de Java","Description Mentoria Java",LocalDate.now());
		
	     Set<Conteudo> conteudos=new LinkedHashSet<>();
	     conteudos.add(curso1);
	     conteudos.add(curso2);
	     conteudos.add(mentoria1);
	     
	    Bootcamp bootcamp=new Bootcamp("Java Developer Banco Pan","Bootcamp Pan DIO");
	    
	    bootcamp.setConteudos(conteudos);
		
		Dev dev1=new Dev();
		dev1.setNome("Michael Soares");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Michael Soares conteúdos inscritos: "+dev1.getConteudoInscritos().toString());
		dev1.progredir();
		System.out.println("------");
		System.out.println("Michael Soares conteúdos inscritos: "+dev1.getConteudoInscritos().toString());
		System.out.println("Michael Soares conteúdos concluídos: "+dev1.getConteudoConcluidos().toString());
		System.out.println("XP: "+dev1.calcularTotalXp());
		System.out.println("================================================================================");
		
		Dev dev2=new Dev();
		dev2.setNome("Lucas Ryan");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Lucas Ryan conteúdos inscritos: "+dev2.getConteudoInscritos().toString());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("------");
		System.out.println("Lucas Ryan conteúdos inscritos: "+dev2.getConteudoInscritos().toString());
		System.out.println("Michael Soares conteúdos concluídos: "+dev1.getConteudoConcluidos().toString());
		System.out.println("XP: "+dev2.calcularTotalXp());
		
	}
}
