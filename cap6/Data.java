package cap6;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Data {
	DecimalFormat df1 = new DecimalFormat();
	
	public static int getDia(String dia, String mes, String ano) {
		int d = 0;
		try {
		d = Integer.parseInt(dia);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("00");
		if(d < 1 || d > 31) {
			d = 00;
		} else {
		df.format(d);
		}
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos!!\n" + error.toString());
		}
		return d;
	}
	public static int getMes(String dia, String mes, String ano) {
		int m = 0;
		try {
		m = Integer.parseInt(mes);
		DecimalFormat df1 = new DecimalFormat();
		df1.applyPattern("00");
		if(m < 1 || m > 12) {
			m = 00;
		} else {
		df1.format(m);
		}
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos!!" + error.toString());
		}
		return m;
	}
	public static int getAno(String dia, String mes, String ano) {
		int a = 0;
		try {
		a = Integer.parseInt(ano);
		DecimalFormat df2 = new DecimalFormat();
		df2.applyPattern("0000");
		if(a < 1950 || a > 2019) {
			a = 0000;
		} else {
		df2.format(a);
		}
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos!!" + error.toString());
		}
		return a;
	}

}
