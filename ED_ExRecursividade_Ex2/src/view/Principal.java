package view;

import controller.ConversaoBinario;

public class Principal {

	public static void main(String[] args) {
		
		ConversaoBinario cb = new ConversaoBinario();
		
		int num = 45;
		String conversaopBinario = cb.conversaopBinario(num);
		
	        System.out.println(conversaopBinario);
			
	    }


	}

