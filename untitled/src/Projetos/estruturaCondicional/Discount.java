package projetos.estruturaCondicional;
import java.util.Scanner;

import projetos.Projeto;

public class Discount extends Projeto
{
    @Override
    public void Executar() 
    {
        System.out.println("Digite o valor em R$");
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double discount = 0;

        if (price > 100.0) {
            discount = price * 0.1;
        }
        System.out.println("Desconto: R$" + discount);
    }
}
