package projetos.estruturasRepeticao;

import projetos.Projeto;

public class EstruturasRepeticao extends Projeto
{
    @Override
    public void Executar()
    {
        System.out.println("\n****************");
        System.out.println("ESTRUTURAS REPETIÇÃO");
        System.out.println("\nFor: ");
        Run(new For());
        System.out.println("\nWhile: ");
        Run(new While());
        System.out.println("\nDo...While: ");
        Run(new DoWhile());
    }

    public static void Run(Projeto projeto)
    {
        projeto.Executar();
    }
}
