package Models;

public class Jogo {

    private Character a1 = ' ';
    private Character a2 = ' ';
    private Character a3 = ' ';
    private Character b1 = ' ';
    private Character b2 = ' ';
    private Character b3 = ' ';
    private Character c1 = ' ';
    private Character c2 = ' ';
    private Character c3 = ' ';
    private Boolean xVenceu;
    private Boolean oVenceu;


    public void tabuleiro()
    {
        System.out.println("[ "+a1+" ] [ "+a2+" ] [ "+a3+" ]");
        System.out.println("[ "+b1+" ] [ "+b2+" ] [ "+b3+" ]");
        System.out.println("[ "+c1+" ] [ "+c2+" ] [ "+c3+" ]");
    }

    public void reiniciaJogo()
    {
                a1 = ' ';
                a2 = ' ';
                a3 = ' ';
                b1 = ' ';
                b2 = ' ';
                b3 = ' ';
                c1 = ' ';
                c2 = ' ';
                c3 = ' ';
        ControllerJogo jogo = new ControllerJogo();
        jogo.iniciaJogo();
    }

    public void jogada(Integer linha, Integer coluna, Character opcao)
    {

        if(linha == 1){
            switch (coluna){
                case 1:
                    a1 = opcao;
                    break;
                case 2:
                    a2 = opcao;
                    break;
                case 3:
                    a3 = opcao;
                    break;
            }
        }

        if(linha == 2){
            switch (coluna){
                case 1:
                    b1 = opcao;
                    break;
                case 2:
                    b2 = opcao;
                    break;
                case 3:
                    b3 = opcao;
                    break;
            }
        }

        if(linha == 3){
            switch (coluna){
                case 1:
                    c1 = opcao;
                    break;
                case 2:
                    c2 = opcao;
                    break;
                case 3:
                    c3 = opcao;
                    break;
            }
        }


    }

    public void vencedor()
    {

       xVenceu =
         a1 == 'x' && a2 == 'x' && a3 == 'x'
         ||b1 == 'x' && b2 == 'x' && b3 == 'x'
         ||c1 == 'x' && c2 == 'x' && c3 == 'x'
         ||a1== 'x' && b2 == 'x' && c3 == 'x'
                 ||a3== 'x' && b2 == 'x' && c1 == 'x'
         ||a1== 'x' && b1 == 'x' && c1 == 'x'
         ||a2== 'x' && b2 == 'x' && c2 == 'x'
         ||a3== 'x' && b3 == 'x' && c3 == 'x';

        oVenceu =
                a1 == 'o' && a2 == 'o' && a3 == 'o'
                        ||b1 == 'o' && b2 == 'o' && b3 == 'o'
                        ||c1 == 'o' && c2 == 'o' && c3 == 'o'
                        ||a1== 'o' && b2 == 'o' && c3 == 'o'
                        ||a3== 'o' && b2 == 'o' && c1 == 'o'
                        ||a1== 'o' && b1 == 'o' && c1 == 'o'
                        ||a2== 'o' && b2 == 'o' && c2 == 'o'
                        ||a3== 'o' && b3 == 'o' && c3 == 'o';


        if(xVenceu){
            System.out.println("x venceu!");
            reiniciaJogo();
        }

        if(oVenceu){
            System.out.println("o venceu!");
            reiniciaJogo();
        }

    }




}
