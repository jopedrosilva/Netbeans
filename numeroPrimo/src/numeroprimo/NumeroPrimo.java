/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

/**
 *
 * @author joope
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int somaFinal = 0;
        int somaPartes = 0;
        int valorInicial = 1;
        int valorFinal = 10;
        while(valorInicial<100){        
            int cont = 0;
            for (int i = valorInicial; i < valorFinal; i++) {
                int contLoc = 0;
                for (int j = 1; j <= i; j++) {
                    if(i%j==0){
                        contLoc += 1;
                    }
                }
                if(contLoc==2||i==1){
                    cont += 1;
                }
            }
            if(cont!=0){
                somaFinal+= cont;
                System.out.println(valorInicial+" - "+valorFinal+" = "+cont+" --- "+somaFinal);
            } else {
                System.out.println(valorInicial+" - "+valorFinal+" = "+cont+" --- "+somaFinal);
            } 
            valorInicial += 10;
            valorFinal += 10;
        }
        System.out.println("Soma Final: "+somaFinal);
    }
    
}
