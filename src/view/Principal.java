package view;

import br.gui.arvoreint.Arvore;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore arvore = new Arvore();
		
		for (int i : vetor) {
			arvore.insert(i);
		}
		
		try {
			arvore.prefixSearch();
			System.out.println();
			arvore.infixSearch();
			System.out.println();
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());	
		}

	}

}
