package control;

import model.Lista;

public class NovaTabelaController {
	
	private Lista[] antiga;
	private Lista[] nova;
	
	public NovaTabelaController() {
		
		nova = new Lista[5];
		antiga = new Lista[10];
		for(int i=0;i<10;i++) {
			antiga[i] = new Lista();
		}
		for(int i=0;i<5;i++) {
			nova[i] = new Lista();
		}
	}
	
	public void carregarListaAntiga(int[][] vetor) throws Exception {
		int tamanho = vetor.length;
		for(int i=0;i<tamanho;i++) {
			int tamanho5 = vetor[i].length;
			for(int j=0;j<tamanho5;j++) {
				int num = vetor[i][j];
				if(antiga[i].isEmpty()) {
					antiga[i].addFirst(num);
				}else {
					antiga[i].addLast(num);
				}
			}
		}
	}
	
	public void iniciarListaNova() throws Exception{
		int tamanho = antiga.length;
		for(int i=0;i<tamanho;i++) {
			int tamanhoNova = antiga[i].size();
			for(int j=0;j<tamanhoNova;j++) {
				int num = antiga[i].get(j);
				int hash = hashCode(i);
				if(nova[hash].isEmpty()) {
					nova[hash].addFirst(num);
				}else {
					nova[hash].addLast(num);
				}
			}
		}
	}
	
	public void printListaNova() throws Exception {
		int tamanho = nova.length;
		for(int i=0;i<tamanho;i++) {
			int tamanho2 = nova[i].size();
			for(int j=0;j<tamanho2;j++) {
				System.out.print("["+nova[i].get(j)+"]");
			}
			System.out.println();
		}
	}
	
	public int hashCode(int i) {
		int pos = i / 2;
		return pos;
	}
}
