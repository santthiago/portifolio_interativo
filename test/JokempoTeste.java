
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * teste de estrutura logica para jogo jokenpo
 *
 * @author thiago luiz
 */
public class JokempoTeste {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // logica do jogador
        int jogador;
        Scanner mao = new Scanner(in);
        System.out.println("____JOKENPO_____");
        System.out.println("________________");
        System.out.println("1.Pedra");
        System.out.println("2.Papel");
        System.out.println("3.Tesoura");
        System.out.println("Digite a opção desejada:");
        jogador = mao.nextInt();
        switch (jogador) {
            case 1:
                System.out.println("jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("jogador escolheu TESOURA");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;

        }

        // A LOGICA DO COMPUTADOR
        int computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("computador escolheu Pedra");
                break;
            case 2:
                System.out.println("computador escolheu Papel");
                break;
            case 3:
                System.out.println("computador escolheu Tesoura");
                break;
            default:
                System.out.println("opção inválida");

        }

        /**
         * logica para determinar o vencedor significados: != -> diferente == ->
         * comparador && -> conectivo 'e'
         */
        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("JOGADOR VENCEU");
            } else {
                System.out.println("COMPUTADOR VENCEU");
            }
        } else {
            System.out.println("EMPATE");
        }

    }

}
