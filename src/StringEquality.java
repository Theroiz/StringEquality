import java.util.Scanner;
public class StringEquality {
   public static void main (String[]args)
   {
       Scanner entrada = new Scanner(System.in);
       String nome = null;
       System.out.println("Insira seu nome");
       nome = entrada.nextLine();
       if(nome.equals("Moe"))
       {
           System.out.println("Voce e o rei do rock and roll!");
       }else
       {
           System.out.println("Voce nao e o rei!");
       }
   }
    
}

