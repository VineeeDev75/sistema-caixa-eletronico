import javax.swing.JOptionPane;

public class RetirarService {

	public int[] retirarNotas(int[] notas, boolean inicializado) {
		int valorInicial = 0;
		int valorAtual = 0;

		if (inicializado == false) {
			JOptionPane.showMessageDialog(null, "Você precisa inicializar as notas.");
			return notas;
		} else {
			valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que deseja sacar."));
			valorAtual = valorInicial;

			if (valorInicial < 2 || valorInicial == 3) {
				JOptionPane.showMessageDialog(null, "Você inseriu um valor inválido.");
				return notas;
			} else if (valorInicial > 3000) {
				JOptionPane.showMessageDialog(null, "Valor excedeu o limite!");
				return notas;
			} else {
				while (valorAtual != 0) {
					if (valorAtual >= 200 && valorAtual != 201 && valorAtual != 203 && notas[6] > 0) {
						valorAtual -= 200;
						notas[6]--;
					} else if ((valorAtual >= 100 && valorAtual < 204 || valorAtual >= 100 && notas[6] < 1) && valorAtual != 101 && valorAtual != 103 && notas[5] > 0) {
						notas[5]--;
						valorAtual -= 100;
					} else if ((valorAtual >= 50 && valorAtual < 104 || valorAtual >= 50 && notas[5] < 1) && valorAtual != 51 && valorAtual != 53 && notas[4] > 0) {
						notas[4]--;
						valorAtual -= 50;
					} else if ((valorAtual >= 20 && valorAtual < 54 || valorAtual >= 20 && notas[4] < 1) && valorAtual != 21 && valorAtual != 23 && notas[3] > 0) {
						notas[3]--;
						valorAtual -= 20;
					} else if ((valorAtual >= 10 && valorAtual < 24 || valorAtual >= 20 && notas[3] < 1) && valorAtual != 11 && valorAtual != 13 && notas[2] > 0) {
						notas[2]--;
						valorAtual -= 10;
					} else if ((valorAtual >= 5 && valorAtual < 14 || valorAtual >= 5 && valorAtual < 14 && notas[2] < 1) && valorAtual % 2 != 0 && notas[1] > 0) {
						notas[1]--;
						valorAtual -= 5;
					} else if ((valorAtual >= 2 && valorAtual < 10 || valorAtual >= 2 && valorAtual < 10 && notas[1] < 1) && valorAtual % 2 == 0 && notas[0] > 0) {
						notas[0]--;
						valorAtual -= 2;
					}
					else {
						JOptionPane.showMessageDialog(null, "Não ");
						System.out.println("Quantidade de notas de 2: " + notas[0]);
						System.out.println("Quantidade de notas de 5: " + notas[1]);
						System.out.println("Quantidade de notas de 10: " + notas[2]);
						System.out.println("Quantidade de notas de 20: " + notas[3]);
						System.out.println("Quantidade de notas de 50: " + notas[4]);
						System.out.println("Quantidade de notas de 100: " + notas[5]);
						System.out.println("Quantidade de notas de 200: " + notas[6]);
						System.out.println("Valor inicial: " + valorInicial);
						System.out.println("Valor atual: " + valorAtual);
						return notas;
					}
				}

				System.out.println("Quantidade de notas de 2: " + notas[0]);
				System.out.println("Quantidade de notas de 5: " + notas[1]);
				System.out.println("Quantidade de notas de 10: " + notas[2]);
				System.out.println("Quantidade de notas de 20: " + notas[3]);
				System.out.println("Quantidade de notas de 50: " + notas[4]);
				System.out.println("Quantidade de notas de 100: " + notas[5]);
				System.out.println("Quantidade de notas de 200: " + notas[6]);
				System.out.println("Valor inicial: " + valorInicial);
				System.out.println("Valor atual: " + valorAtual);

				return notas;
			}
		}
	}

}
