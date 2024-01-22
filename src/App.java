import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int abas = sc.nextInt();
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            String acao = sc.next();

            if(acao.equals("clicou")){
                abas--;
            }else if(acao.equals("fechou")){
                abas++;
            }
        }

        sc.close();
        System.out.println(abas);
    }
}
