import javax.swing.JOptionPane;

public class CarregarService {

	public int[] carregarNotas(int[] notas, boolean inicializado) {

		if (inicializado == false) {

			for (int i = 0; i < 7; i++) {
				notas[i] = 100;
			}

			return notas;
		} else {
			JOptionPane.showMessageDialog(null, "Você já inicializou as notas");
			return notas;
		}
	}

}
