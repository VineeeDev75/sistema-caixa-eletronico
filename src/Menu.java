import javax.swing.JOptionPane;

public class Menu {

	public static void carregarMenu(CarregarService carregar, RetirarService retirar, int[] notas) {

		int opc = 0;
		boolean inicializado = false;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "" 
					+ "Menu Principal \n" 
					+ "1 – Carregar Notas \n"
					+ "2 – Retirar Notas \n" 
					+ "3 – Estatística \n" 
					+ "9 – Fim "));

			switch (opc) {
			case 1:
				carregar.carregarNotas(notas, inicializado);
				inicializado = true;
				break;

			case 2:
				retirar.retirarNotas(notas, inicializado);
				break;

			case 3:
				System.out.println("Estátistica");
				break;

			case 9:
				System.out.println("Encerrando...");
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Você escolheu uma opção inválida.");
				break;
			}
		}

	}

}
