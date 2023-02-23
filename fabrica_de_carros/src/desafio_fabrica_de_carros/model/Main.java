package desafio_fabrica_de_carros.model;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
		double valorCustoProducao=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o custo de produção do Produto:(SEM CARACTERES ESPECIAIS)"));
		double porcetagemDistribuidor=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a porcentagem do distribuidor:(SEM CARACTERES ESPECIAIS)"));
		double porcetagemImposto=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a porcentagem dos impostos:(SEM CARACTERES ESPECIAIS)"));
		CalculoDePreco calc=new CalculoDePreco(valorCustoProducao,porcetagemDistribuidor,porcetagemImposto);
		System.out.println(calc.calculaPrecoFinal());
	}
}
