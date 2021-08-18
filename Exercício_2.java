package Exercícios;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Exercício_2 {

	public static void main(String[] args) {
		String diaria = JOptionPane.showInputDialog(null, "Informe o valor da diária: R$");
        Double val = Double.parseDouble(diaria);
        
        String dataLoc = JOptionPane.showInputDialog("Informe a data de locação no formato dd/mm/aaaa");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String dataDev = JOptionPane.showInputDialog("Informe a data de devolução no formato dd/mm/aaaa");
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        try {
            LocalDate data = LocalDate.parse(dataLoc, formato);
            LocalDate date = LocalDate.parse(dataDev, form);
            
            JOptionPane.showMessageDialog(null, "Valor da Diária: R$" + val);
            JOptionPane.showMessageDialog(null, "Data de Locação: " + dataLoc);
            JOptionPane.showMessageDialog(null, "Data de Devolução: " + dataDev);
            Period periodo = Period.between(data, date);
            JOptionPane.showMessageDialog(null, "Dias de Locação: " + periodo.getDays());
            JOptionPane.showMessageDialog(null, "Valor total da locação: R$" + periodo.getDays() * val);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Data inválida!");
        }
    }
        

}
