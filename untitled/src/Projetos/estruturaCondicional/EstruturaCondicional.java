package projetos.estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional 
{
    public void Executar() 
    {
        Locale.setDefault(Locale.US);
        System.out.println("Digite o valor em R$");
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta R$ %.2f%n", conta);

        sc.close();
    }
}