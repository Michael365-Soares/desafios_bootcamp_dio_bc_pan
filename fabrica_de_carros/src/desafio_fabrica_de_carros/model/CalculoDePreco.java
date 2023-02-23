package desafio_fabrica_de_carros.model;

import java.text.DecimalFormat;

public class CalculoDePreco {
     private double valorCustoProducao;
     private double porcetagemDistribuidor;
     private double porcetagemImposto;
     
     public CalculoDePreco(double valorCustoProducao,double porcetagemDistribuidor,double porcetagemImposto) {
    	 this.valorCustoProducao=valorCustoProducao;
    	 this.porcetagemDistribuidor=porcetagemDistribuidor;
    	 this.porcetagemImposto=porcetagemImposto;
      }

	public double getValorCustoProducao() {
		return valorCustoProducao;
	}

	public void setValorCustoProducao(double valorCustoProducao) {
		this.valorCustoProducao = valorCustoProducao;
	}

	public double getPorcetagemDistribuidor() {
		return porcetagemDistribuidor;
	}

	public void setPorcetagemDistribuidor(double porcetagemDistribuidor) {
		this.porcetagemDistribuidor = porcetagemDistribuidor;
	}

	public double getPorcetagemImposto() {
		return porcetagemImposto;
	}

	public void setPorcetagemImposto(double porcetagemImposto) {
		this.porcetagemImposto = porcetagemImposto;
	}
     
    public String calculaPrecoFinal() {
    	double calculoImpostos=((this.valorCustoProducao*this.porcetagemDistribuidor)/100)+((this.valorCustoProducao*this.porcetagemImposto)/100);
    	double precoFinal=(this.valorCustoProducao+calculoImpostos);
    	DecimalFormat fmt=new DecimalFormat("##,###.000");
    	String preco=fmt.format(precoFinal);
    	return "Preço final: R$ "+preco;
    } 
     
}
