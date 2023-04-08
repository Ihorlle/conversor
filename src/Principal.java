import javax.swing.JOptionPane;

public class Principal {
	
	static Funcao moedas = new Funcao();
	static Funcao temperaturas = new Funcao();
	
	public static void main(String[] args) {
		
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {
						"Conversor de Moeda", "Conversor de Temperatura"
				}, "Escolha").toString();
		
		switch(opcoes) {
			case "Conversor de Moeda":
				String inputMoeda = JOptionPane.showInputDialog("Insira um valor");
				double valorRecebido = Double.parseDouble(inputMoeda);
				moedas.ConverterMoedas(valorRecebido);
				
			case "Conversor de Temperatura":
				String inputTemperatura = JOptionPane.showInputDialog("Insira um valor");
				double valorRecebidoTemperatura = Double.parseDouble(inputTemperatura);
				temperaturas.ConverterTemperaturas(valorRecebidoTemperatura);
			
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
		}
	}
}