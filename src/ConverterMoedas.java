import javax.swing.JOptionPane;

public class ConverterMoedas {
	
	public void ConverterReaisADolar(double valor) {
		double moedaDolar = valor / 5.14;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
	}
	
	public void ConverterReaisAEuro(double valor) {
		double moedaEuro = valor / 5.46;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
	}
	
	public void ConverterReaisALibra(double valor) {
		double moedaLibra = valor / 6.20;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras");
	}
	
	public void ConverterReaisAPesoArgentino(double valor) {
		double moedaPesoArgentino = valor / 0.02;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Pesos Argentinos");
	}
	
	public void ConverterReaisAPesoChileno(double valor) {
		double moedaPesoChileno = valor / 0.01;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
	}
	
	public void ConverterDolarAReais(double valor) {
		double moedaReal = valor * 5.14;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal + " Reais");
	}
	
	public void ConverterEuroAReais(double valor) {
		double moedaReal = valor * 5.46;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal + " Reais");
	}
	
	public void ConverterLibraAReais(double valor) {
		double moedaReal = valor * 6.20;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal + " Reais");
	}
	
	public void ConverterPesoArgentinoAReais(double valor) {
		double moedaReal = valor * 0.02;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal + " Reais");
	}
	
	public void ConverterPesoChilenoAReais(double valor) {
		double moedaReal = valor * 0.01;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal + " Reais");
	}
}