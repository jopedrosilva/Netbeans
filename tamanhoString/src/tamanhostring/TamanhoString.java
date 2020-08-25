/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamanhostring;

/**
 *
 * @author joope
 */
public class TamanhoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        int cont = 566;
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j < 18; j++) {
                for (int k = 1; k < 18; k++) {
                    soma = (i*1) + (j*3) + (k*(-3));
                    if (soma == 28 && (j+k+i)==19){
                        System.out.println("i: "+i+" j: "+j+" k: "+k);
                        break;
                    }
                }
                
            }
            
        }
    
    }
    
}
