package Test;

import java.util.Scanner;

public class testConjectura {
    public static void main(String[] args) {
        long cont1 = 2;
        long res = 0;
        long contImpar = 0;
        long contPar = 0;
        long contTotalPar = 0;
        long contTotalImpar =0;
        long contadorZao = 0;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Insira um intervalo: ");
        long entrada = leia.nextInt();
        while(cont1<=entrada){
            res = cont1;
            //System.out.println("Para: "+res);
            double auxLoc = res;
            while(res!=1){
                if(res%2==0){
                    contPar = contPar+1;
                    contadorZao = contadorZao + 1;
                    //System.out.print(contadorZao+"°: ");
                    res = par(res);
                } else {
                    contImpar = contImpar+1;
                    contadorZao = contadorZao + 1;
                    //System.out.print(contadorZao+"°: ");
                    res = impar(res);
                }
            }
            //if(auxLoc%2!=0){
            //System.out.println("=========================================");
               // System.out.println("Para: "+auxLoc);
                /*System.out.println("Função Impar contador: "+contImpar);
                System.out.println("Funçaõ Par contador: "+contPar);*/
                //System.out.println("PA de "+cont1+" = "+((6*cont1)+2));
                /*float n1 = (auxLoc+1)/2;
                //System.out.println("n1: "+n1);
                System.out.println("P1: "+((contImpar*(6*n1-2))/(contImpar*contPar*2)));
                System.out.println("P2: "+((contImpar*(6*n1+4))/(contImpar*contPar*2)));
                System.out.println("P3: "+((contImpar*(6*n1-2))/((contImpar+contPar)*2)));
                System.out.println("P4: "+((contImpar*(6*n1+4))/((contImpar+contPar)*2)));
                float n2 = (auxLoc-1)/2;
                //System.out.println("n1: "+n2);
                System.out.println("P5: "+((contImpar*(6*n2-2))/(contImpar*contPar*2)));
                System.out.println("P6: "+((contImpar*(6*n2+4))/(contImpar*contPar*2)));
                System.out.println("P7: "+((contImpar*(6*n2-2))/((contImpar+contPar)*2)));
                System.out.println("P8: "+((contImpar*(6*n2+4))/((contImpar+contPar)*2)));*/
               // System.out.println("=======================================");
            //}
            cont1 = cont1 + 1;
            contTotalImpar = contTotalImpar + contImpar;
            contTotalPar = contTotalPar + contPar;
            contImpar = 0;
            contPar = 0;
            //System.out.println("=========================================");
        }
        long EA = contTotalPar+contTotalImpar;
        System.out.println("Porcentagem Par: "+((contTotalPar*100)/EA)+"%");
        System.out.println("Porcentagem Ímpar: "+((contTotalImpar*100)/EA)+"%");
        
    }
    


    private static long par(long res){
        res = res/2;
        //System.out.println("Função par: "+res);
        return res;
    }
    
    private static long impar(long res){
        res = (res*3)+1;
        //System.out.println("Função Ímpar: "+res);
        return res;
    }
}
