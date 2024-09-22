
public class CaixaEletronico {

	public static void main(String[] args) {
		
		int[] notas = new int[7] ;
		Menu menu = new Menu();
		CarregarService carregar = new CarregarService();
		RetirarService retirar = new RetirarService();
		
		menu.carregarMenu(carregar, retirar, notas);
		

	}

}
