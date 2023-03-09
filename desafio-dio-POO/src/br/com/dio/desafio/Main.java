package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
		Curso curso1=new Curso("Curso Java","Descrição curso java",8);
		System.out.println(curso1);
		
		Curso curso2=new Curso("Curso Js","Descrição curso Js",4);
		System.out.println(curso2);
		Mentoria mentoria1=new Mentoria("Mentoria de Java","Description Mentoria Java",LocalDate.now());
		System.out.println(mentoria1);
		
	}
}
