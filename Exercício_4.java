package Exercícios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Exercício_4 {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Valor da compra: ");
		Double val = Double.parseDouble(x);
		
		String y = JOptionPane.showInputDialog("Quantidade de parcelas: ");
		int quantidade = Integer.parseInt(y);
		
		Double parcelas[] = new Double[quantidade];
		LocalDate date[] = new LocalDate[quantidade];
		
		LocalDate dataH = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
        try {
        	LocalDate data = LocalDate.parse("17/08/2021", formato);
            
            int aux = 0;

            for (int i = 0; i < quantidade; i++) {
                aux += 30;
                date[i] = dataH.plusDays(aux);
            }

            for (int i = 0; i < quantidade; i++) {
                parcelas[i] = val / quantidade;
            }
            JOptionPane.showMessageDialog(null,"Valor da Compra: R$" + val);
            JOptionPane.showMessageDialog(null,"Total de parcelas: " + quantidade);

            for (int i = 0; i < quantidade; i++) {
                JOptionPane.showMessageDialog(null,"Valor da Parcela: " +parcelas[i]+ " Data do " +(i + 1)+ "° vencimento: " +date[i]);
            }

        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null,"Algo deu errado! :(");        }

	}
}
