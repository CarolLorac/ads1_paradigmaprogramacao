package projetos.estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

import projetos.Projeto;

public class AccountValue extends Projeto
{
    @Override
    public void Executar() 
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor em R$");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100) 
        {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta R$ %.2f%n", conta);
    }
}