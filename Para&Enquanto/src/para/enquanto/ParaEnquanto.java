package para.enquanto;

public class ParaEnquanto {
    static int cont = 0;
    public static void main(String[] args) {
        primeiraSituacao();
        Enquanto();
    }
    
    public static void primeiraSituacao(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nº"+i+" Vanessa me ama!");
            segunaSituacao(); 
            cont = cont+i;
        }
        System.out.println(cont);
    }
    
    public static void segunaSituacao(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nº"+i+" Para Sempre!");
            cont = cont+i;
        }
        System.out.println(cont);
    }
    
    public static void Enquanto(){
        while (true) {
            System.out.println("okay");
            
        }
    }
    
}
