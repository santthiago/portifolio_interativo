
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elenice
 */
public class JogoDado {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        char opcao = 's';
        Scanner teclado = new Scanner(System.in);
        while (opcao=='s') {            
           System.out.println("LANÇAMENTO DO DADO..........."); 
           int dado = (int)(Math.random()*6+1);
             System.out.println("face: " + dado);
             System.out.println(" deseja lançar o dado novamente? (s/n)?");
             opcao = teclado.next().charAt(0);
        }
          
            
         
    }
            
}
