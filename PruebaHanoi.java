import java.util.Scanner;
public class PruebaHanoi {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        TorresHanoi pruebaTH = new TorresHanoi();
        
        int nivel;
        String res;
        
        nivel = sc.nextInt();
        res = pruebaTH.moverTorresHanoi(nivel);
        
        System.out.println(res);
    }
}
