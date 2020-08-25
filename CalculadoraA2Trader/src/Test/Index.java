package Test;

import java.util.Scanner;

public class Index {
    
    private int contador = 0;
    private int valorDia = 0;
    private int dias = 0;
    private int valorInvestido = 0;
    private Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Index id = new Index();
        System.out.print("Informe o número de dias: ");
        id.dias = id.leia.nextInt();
        System.out.print("Informe o valor Investido: ");
        id.valorInvestido = id.leia.nextInt();
        id.calcularInvestimento(id.dias, id.valorInvestido);
        */
        for (int i = 65; i <= 105; i++) {
            System.out.print("d"+i+"+");
            
        }
    }
    
    public void calcularInvestimento(int diasIn, int valorIn){
        contador = valorIn;
        for (int i = 0; i < diasIn; i++) {
            for (int z = valorIn; z >= 50; z=z-50) {
                valorDia = valorDia + 2;
                if(contador >= 50){
                    contador = contador - 50;
                }
            }
            System.out.println("dia: "+(i+1)+" valor "+valorDia);
            contador = contador + valorDia;
            valorIn = contador;
        }
        System.out.println(""+valorDia);   
    }
    
    
}
