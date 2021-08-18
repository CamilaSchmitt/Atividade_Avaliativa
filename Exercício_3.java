package Exercícios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Exercício_3 {
	public static void main(String[] args) {
		String dataSimulacao = JOptionPane.showInputDialog("Informe a data de simulação no formato dd/mm/aaaa");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            LocalDate data = LocalDate.parse(dataSimulacao, formato);
            
            data = data.plusDays(7);
            LocalDate data2 = data.plusDays(7);
            LocalDate data3 = data2.plusDays(7);
            LocalDate data4 = data3.plusDays(7);
            LocalDate data5 = data4.plusDays(7);
            
            JOptionPane.showMessageDialog(null,"Data Informada: " + dataSimulacao);
            JOptionPane.showMessageDialog(null,"Data de Pagamento 1: " + formato.format(data));
            JOptionPane.showMessageDialog(null,"Data de Pagamento 2: " + formato.format(data2));
            JOptionPane.showMessageDialog(null,"Data de Pagamento 3: " + formato.format(data3));
            JOptionPane.showMessageDialog(null,"Data de Pagamento 4: " + formato.format(data4));
            JOptionPane.showMessageDialog(null,"Data de Pagamento 5: " + formato.format(data5));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Data inválida!");
        }
	}
}
