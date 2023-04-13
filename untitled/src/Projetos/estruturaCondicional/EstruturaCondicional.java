package projetos.estruturaCondicional;

import projetos.Projeto;

public class EstruturaCondicional extends Projeto
{
    @Override
    public void Executar()
    {
        System.out.println("\n***********************");
        System.out.println("ESTRUTURA CONDICIONAL");
        System.out.println("\nAccount Value: ");
        Run(new AccountValue());
        System.out.println("\nDemoDoublePrice: ");
        Run(new DemoDoublePrice());
        System.out.println("\nDiscount: ");
        Run(new Discount());
        System.out.println("\nWeek: ");
        Run(new Week());
        System.out.println("\nWeekSwitchCase: ");
        Run(new WeekSwitchCase());
    }   
    
    public static void Run(Projeto projeto)
    {
        projeto.Executar();
    }
}
