package ProjetoJogoDaForca;

import java.util.Scanner;

public class JogoDaForca1 {

private static final int status = 0;

public static void main (String args[]) {
	

        String palavraChave = "bicicleta";
        String letrasUsadas ="";
        String palavraAdivinhada = "";
        int maxTentativas = 10;
        
        

        for(int x = 0; x < palavraChave.length(); x++) {
            palavraAdivinhada += "_";

            for(int tentativas = 0; ; tentativas++) {
                if(tentativas == maxTentativas) {
                    System.out.printf("Infelizmente"
+ " acabaram suas 10 tentativas =\n... A palavra era '%s' "
+ "", palavraChave);
                    System.exit(status);

                                    }
            }
        }




    }

} 