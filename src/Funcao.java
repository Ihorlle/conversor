import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoedas moedas = new ConverterMoedas();
	ConverterTemperaturas temperaturas = new ConverterTemperaturas();
	
	public void ConverterMoedas(double valorRecebido) {
		String opcaoMoeda = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro ", 
				"Moedas", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"De Reais a Dólares", 
						"De Reais a Euros", 
						"De Reais a Libras", 
						"De Reais a Peso Argentino", 
						"De Reais a Peso Chileno", 
						"De Dólares a Reais", 
						"De Euros a Reais", 
						"De Libras a Reais", 
						"De Peso Argentino a Reais", 
						"De Peso Chileno a Reais"}, "Escolha")).toString();
		
		switch (opcaoMoeda) {
		case "De Reais a Dólares":
			moedas.ConverterReaisADolar(valorRecebido);
			break;
		case "De Reais a Euros":
			moedas.ConverterReaisAEuro(valorRecebido);
			break;
		case "De Reais a Libras":
			moedas.ConverterReaisALibra(valorRecebido);
			break;
		case "De Reais a Peso Argentino":
			moedas.ConverterReaisAPesoArgentino(valorRecebido);
			break;
		case "De Reais a Peso Chileno":
			moedas.ConverterReaisAPesoChileno(valorRecebido);
			break;
		case "De Dólares a Reais":
			moedas.ConverterDolarAReais(valorRecebido);
			break;
		case "De Euros a Reais":
			moedas.ConverterEuroAReais(valorRecebido);
			break;
		case "De Libras a Reais":
			moedas.ConverterLibraAReais(valorRecebido);
			break;
		case "De Peso Argentino a Reais":
			moedas.ConverterPesoArgentinoAReais(valorRecebido);
			break;
		case "De Peso Chileno a Reais":
			moedas.ConverterPesoChilenoAReais(valorRecebido);
			break;
		}
	}
	
	
	
	public void ConverterTemperaturas(double valorRecebido) {
		String opcaoTemperatura = (JOptionPane.showInputDialog(null, "Escolha a temperatura para a qual você deseja converter ", 
				"Temperaturas", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"De Celsius a Kelvin", 
						"De Kelvin a Celsius", 
						"De Celsius a Fahrenheit", 
						"De Fahrenheit a Celsius", 
						"De Kelvin a Fahrenheit", 
						"De Fahrenheit a Kelvin"}, "Escolha")).toString();
		
		switch (opcaoTemperatura) {
		case "De Celsius a Kelvin":
			temperaturas.ConverterCelsiusAKelvin(valorRecebido);
			break;
		case "De Kelvin a Celsius":
			temperaturas.ConverterKelvinACelsius(valorRecebido);
			break;
		case "De Celsius a Fahrenheit":
			temperaturas.ConverterCelsiusAFahrenheit(valorRecebido);
			break;
		case "De Fahrenheit a Celsius":
			temperaturas.ConverterFahrenheitACelsius(valorRecebido);
			break;
		case "De Kelvin a Fahrenheit":
			temperaturas.ConverterKelvinAFahrenheit(valorRecebido);
			break;
		case "De Fahrenheit a Kelvin":
			temperaturas.ConverterFahrenheitAKelvin(valorRecebido);
			break;
		}
	}
}