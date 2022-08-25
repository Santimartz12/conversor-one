import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

	public void ConvertirTemperatura() {
		String eleccion = JOptionPane
				.showInputDialog(null, "Elige los grados a convertir", "Grados", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius",
								"De Kelvin a Fahrenheit", "De Celsius a Fahrenheit", "De Celsius a Kelvin" },
						"Elegir").toString();
		
		switch (eleccion) {
		case "De Fahrenheit a Celsius": {
			DeFrhaCls();
			break;
		}
		case "De Fahrenheit a Kelvin": {
			DeFrhaKlv();
			break;
		}
		case "De Kelvin a Celsius": {
			DeKlvaCls();
			break;
		}
		case "De Kelvin a Fahrenheit": {
			DeKlvaFrh();
			break;
		}
		case "De Celsius a Fahrenheit": {
			DeClsaFrh();
			break;
		}
		case "De Celsius a Kelvin": {
			DeClsaKlv();
			break;
		}
		}
	}
	
	static double PedirTemperatura() {
		String temp = JOptionPane.showInputDialog(null, "Ingresa la temperatura a convertir",
				"Temperatura", JOptionPane.PLAIN_MESSAGE).toString();
		try {
			return Double.parseDouble(temp);
		} catch (NumberFormatException e) {
			return 0 ;
		}

	}
	
	static boolean Validar(double x) {
		if(x == 0) {
			JOptionPane.showMessageDialog(null, "Valor no permitido");
			return false;
		}return true;
	}
	
	static void DeFrhaCls() {
		double x = PedirTemperatura();
		if(Validar(x)) {
			double resultado = (x -32) * 5/9;
			resultado = (Math.round((resultado * 100d)/100d));
			JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Celsius");
		}

	}
	
	static void DeFrhaKlv() {
		double x = PedirTemperatura();
		if(Validar(x)) {
		double resultado = (x - 32) * 5/9 + 273.15;
		resultado = (Math.round((resultado * 100d) / 100d));
		JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Kelvin");}
	}
	
	static void DeKlvaCls() {
		double x = PedirTemperatura();
		if(Validar(x)) {
		double resultado = x - 273.15;
		resultado = (Math.round((resultado * 100d) / 100d));
		JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Celsius");}
	}
	
	static void DeKlvaFrh() {
		double x = PedirTemperatura();
		if(Validar(x)) {
		double resultado = (x - 273.15) * 9/5 + 32;
		resultado = (Math.round((resultado * 100d) / 100d));
		JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Fahrenheit");}
	}
	
	static void DeClsaFrh() {
		double x = PedirTemperatura();
		if(Validar(x)) {
		double resultado = (x * 9/5) + 32;
		resultado = (Math.round((resultado * 100d) / 100d));
		JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Fahrenheit");}
	}
	
	static void DeClsaKlv() {
		double x = PedirTemperatura();
		if(Validar(x)) {
		double resultado = x + 273.15;
		resultado = (Math.round((resultado * 100d) / 100d));
		JOptionPane.showMessageDialog(null, "Son " + resultado + " Grados Kelvin");}
	}
}
