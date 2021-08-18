package Exerc�cios;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Exerc�cio_2 {

	public static void main(String[] args) {
		String diaria = JOptionPane.showInputDialog(null, "Informe o valor da di�ria: R$");
        Double val = Double.parseDouble(diaria);
        
        String dataLoc = JOptionPane.showInputDialog("Informe a data de loca��o no formato dd/mm/aaaa");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String dataDev = JOptionPane.showInputDialog("Informe a data de devolu��o no formato dd/mm/aaaa");
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        try {
            LocalDate data = LocalDate.parse(dataLoc, formato);
            LocalDate date = LocalDate.parse(dataDev, form);
            
            JOptionPane.showMessageDialog(null, "Valor da Di�ria: R$" + val);
            JOptionPane.showMessageDialog(null, "Data de Loca��o: " + dataLoc);
            JOptionPane.showMessageDialog(null, "Data de Devolu��o: " + dataDev);
            Period periodo = Period.between(data, date);
            JOptionPane.showMessageDialog(null, "Dias de Loca��o: " + periodo.getDays());
            JOptionPane.showMessageDialog(null, "Valor total da loca��o: R$" + periodo.getDays() * val);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Data inv�lida!");
        }
    }
        

}
