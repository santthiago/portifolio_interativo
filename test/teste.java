
import java.util.Scanner;
import javax.swing.JTextArea;  
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elenice
 */



public class teste {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**System.out.print("digite o valor da tabuada:" );
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(numero + " x " + i + " = ");
        }**/

	String ex = "";
        int b = 12;
	for(int a =1;a<=10;a++){
            //for(int b=1;b<=5;b++){
            ex +=(b+ "x" +a+ "=" +(b*a)+" \t");  
           // }		
            ex +=(" ");
            ex +=("\n");
	}
            ex +=(" ");
            ex +=("\n");
            /**for(int a =1;a<=10;a++){
		for(int b=6;b<=10;b++){
		 ex +=(b+ "x" +a+ "=" +(b*a)+" \t");  
                    }*/	
				ex +=(" ");
				ex +=("\n");
			
				JTextArea JtxArea = new JTextArea(ex);  
   				JOptionPane.showMessageDialog(null, JtxArea); 
                }                       
    }



