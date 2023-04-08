import javax.swing.JOptionPane;

public class ConverterTemperaturas {
	
	public void ConverterCelsiusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + kelvin + " graus Kelvin");
	}
	
	public void ConverterKelvinACelsius(double valor) {
		double celsius = valor - 273.15;
		celsius = (double) Math.round(celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + celsius + " graus Celsius");
	}
	
	public void ConverterCelsiusAFahrenheit(double valor) {
		double fahrenheit = (valor * 1.8) + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + fahrenheit + " graus Fahrenheit");
	}
	
	
	public void ConverterFahrenheitACelsius(double valor) {
		double celsius = (valor - 32) / 1.8;
		celsius = (double) Math.round(celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + celsius + " graus Celsius");
	}
	
	public void ConverterKelvinAFahrenheit(double valor) {
		double fahrenheit = valor + 255.92;
		fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + fahrenheit + " graus Fahrenheit");
	}
	
	public void ConverterFahrenheitAKelvin(double valor) {
		double kelvin = valor - 255.92;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + kelvin + " graus Kelvin");
	}

}
