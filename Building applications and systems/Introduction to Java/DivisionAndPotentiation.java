import javax.swing.*;

public class DivisionAndPotentiation {

	public static void main(String entrada[]) {

		// declaracao de variaveis
		int n1, n2, div;
		double pot;
		String message = "";

		// entrada de dados pela linha de comando
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Type a round number: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Type another round number: "));

		// processamento
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1, n2);

		// saida de resultados
		message = message + "The quocient of the division of "+ n1 + " by " + n2 + " = " + div + "\n";
		message = message + "The potentiation of " + n1 + " by " + n2 + " = " + pot + "\n";

		JOptionPane.showMessageDialog(null, message);

		System.exit(0);
	}
}
