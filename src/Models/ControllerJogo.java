package Models;

import java.util.Scanner;

public class ControllerJogo extends  Jogo {
    Scanner teclado = new Scanner(System.in);

    private Integer linha;
    private Integer coluna;
    private Character opcao = 'o';
    public void iniciaJogo(){

        tabuleiro();

        for (int i=0; i< 9; i++){

            this.vencedor();

if(opcao == 'o'){
    opcao = 'x';

}else if(opcao == 'x'){
    opcao = 'o';
}
            System.out.println("Insira a linha: ");
            linha = teclado.nextInt();
            System.out.print("Insira a coluna: ");
            coluna = teclado.nextInt();
            jogada(linha, coluna, opcao);
            tabuleiro();

        }




    }
}
