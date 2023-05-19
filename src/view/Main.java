package view;

import control.NovaTabelaController;

public class Main {
	public static void main(String[] args) throws Exception {
		
		NovaTabelaController control = new NovaTabelaController();
		int[][] vetorAntiga = {	{0,12,647,128,136,467},
								{156,600,551},
								{263,414,882,945,914,953,629},
								{884,795,194,513},
								{591,847,66,337,979},
								{768,53},
								{114,803,90,339,550},
								{574,977,216,99,617},
								{142,148,227,939,585,338,206},
								{569,708,844} };
		
		control.carregarListaAntiga(vetorAntiga);
		control.iniciarListaNova();
		control.printListaNova();
		
	}
}
