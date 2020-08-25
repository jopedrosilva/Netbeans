package test;

public class Test_direto {
    public static void main(String[] args) {
        int cont1 = 113382;
        int res = 0;
        while(cont1!=1){
            res = cont1;
            if(cont1%2==0){
                res = par(res);
            } else {
                res = impar(res);
            }
            cont1 += cont1+1;
        }
    }
    
    private static int par(int res){
        res = res/2;
        System.out.println("Função par: "+res);
        return res;
    }
    
    private static int impar(int res){
        res = (res*3)+1;
        System.out.println("Função Ímpar: "+res);
        return res;
    }
}
