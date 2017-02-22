package exercicio_1_1;

import javax.swing.JOptionPane;

public class Determina_Idade_1 {


	public static void main(String[] args) {
		
		String aAtual, aNasc;
		int anoAtual, anoNascimento, qtdeAnos;
		
		aAtual = JOptionPane.showInputDialog(null,"Entre com o ano atual: ");
		anoAtual = Integer.parseInt(aAtual);  
		
		aNasc = JOptionPane.showInputDialog(null,"Entre com o ano de nascimento: ");
		anoNascimento = Integer.parseInt(aNasc);
		
			qtdeAnos = anoAtual - anoNascimento;
			JOptionPane.showMessageDialog(null,"Em " + anoAtual +" você completou ou irá completar  "+ qtdeAnos);

	}
	
}
