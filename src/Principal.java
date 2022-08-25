import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		boolean continuar = true;

		while (continuar) {
			
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversion", "Menu", JOptionPane.QUESTION_MESSAGE,
							null, new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Conversor de Moneda": {
				ConvertirMonedas Divisa = new ConvertirMonedas();
				Divisa.SeleccionarDivisas();
				continuar = QuiereContinuar();
				break;
			}
			case "Conversor de Temperatura": {
				ConvertirTemperaturas Temp = new ConvertirTemperaturas();
				Temp.ConvertirTemperatura();
				continuar = QuiereContinuar();
				break;
			}
			}
		}

	}
	
	static boolean QuiereContinuar() {
		int respuesta = JOptionPane.showConfirmDialog(null, "Deseas hacer otra conversión?");
		if(JOptionPane.OK_OPTION == respuesta) {
			return true;
		}
		JOptionPane.showMessageDialog(null, "Programa terminado");
		return false;
	}
}
