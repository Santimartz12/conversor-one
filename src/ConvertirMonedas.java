import javax.swing.JOptionPane;

public class ConvertirMonedas {

	// Valores divisas
	double dolar = 4392.33;
	double euro = 4387.19;
	double libras = 5190.42;
	double yen = 31.64;
	double won = 3.24;

	// Selector de divisas
	public void SeleccionarDivisas() {
		String divisas = JOptionPane.showInputDialog(null, "Elige la moneda a la que quieres convertir tu dinero",
				"Divisa", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "De Pesos Colombianos a Dólares", "De Pesos Colombianos a Euros",
						"De Pesos Colombianos a Libras Esterlinas", "De Pesos Colombianos a Yen Japonés",
						"De Pesos Colombianos a Won Surcoreano", "De Dólares a Pesos Colombianos",
						"De Euros a Pesos Colombianos", "De Libras Esterlinas a Pesos Colombianos",
						"De Yen Japonés a Pesos Colombianos", "De Won Surcoreano a Pesos Colombianos" },
				"Seleccionar").toString();

		switch (divisas) {
		case "De Pesos Colombianos a Dólares": {
			DePesoColombianoAMoneda(dolar, "$", "Dolares");
			break;
		}
		case "De Pesos Colombianos a Euros": {
			DePesoColombianoAMoneda(euro, "€", "Euros");
			break;
		}
		case "De Pesos Colombianos a Libras Esterlinas": {
			DePesoColombianoAMoneda(libras, "£", "Libras Esterlinas");
			break;
		}
		case "De Pesos Colombianos a Yen Japonés": {
			DePesoColombianoAMoneda(yen, "¥", "Yenes Japoneses");
			break;
		}
		case "De Pesos Colombianos a Won Surcoreano": {
			DePesoColombianoAMoneda(won, "₩", "Wones Surcoreanos");
			break;
		}
		case "De Dólares a Pesos Colombianos": {
			DeMonedaAPesoColombiano(dolar);
			break;
		}
		case "De Euros a Pesos Colombianos": {
			DeMonedaAPesoColombiano(euro);
			break;
		}
		case "De Libras Esterlinas a Pesos Colombianos": {
			DeMonedaAPesoColombiano(libras);
			break;
		}
		case "De Yen Japonés a Pesos Colombianos": {
			DeMonedaAPesoColombiano(yen);
			break;
		}
		case "De Won Surcoreano a Pesos Colombianos": {
			DeMonedaAPesoColombiano(won);
			break;
		}
		}

	}

	static boolean Validar(double x) {
		if(x == 0) {
			JOptionPane.showMessageDialog(null, "Valor no permitido");
			return false;
		}return true;
	}
	
	static double PedirMoneda() {
		String moneda = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir",
				"Moneda", JOptionPane.PLAIN_MESSAGE).toString();
		
		try {
			return Double.parseDouble(moneda);
		} catch (NumberFormatException e) {
			return 0 ;
		}
	}

	static void MostrarResultadoMoneda(double resultado, String logoDivisa, String nombreDivisa) {
		JOptionPane.showMessageDialog(null, "En total tienes " + logoDivisa + resultado + " " + nombreDivisa);
	}

	static void DePesoColombianoAMoneda(double ValorMonedaAConvertir, String logoDivisa, String nombreDivisa) {
		double moneda = PedirMoneda();
		if(Validar(moneda)) {
		double resultado = moneda / ValorMonedaAConvertir;
		resultado = (Math.round(resultado * 100d) / 100d);
		MostrarResultadoMoneda(resultado, logoDivisa, nombreDivisa);}
	}

	static void DeMonedaAPesoColombiano(double ValorMonedaAConvertir) {
		double moneda = PedirMoneda();
		if(Validar(moneda)) {
		double resultado = moneda * ValorMonedaAConvertir;
		resultado = (Math.round(resultado * 100d) / 100d);
		MostrarResultadoMoneda(resultado, "$", "Pesos Colombianos");}
	}

}
