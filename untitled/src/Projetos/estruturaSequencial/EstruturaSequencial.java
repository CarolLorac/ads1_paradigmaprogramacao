package projetos.estruturaSequencial;
import projetos.Projeto;

public class EstruturaSequencial extends Projeto
{
    @Override
    public void Executar() 
    {
        System.out.println("\n***********************");
        System.out.println("ESTRUTURA SEQUENCIAL");
        System.out.println("\nDivision: ");
        Run(new Division());
        System.out.println("\nMathFunction: ");
        Run(new MathFunction());
        System.out.println("\nNumbers: ");
        Run(new Numbers());
        System.out.println("\nNumbersDouble: ");
        Run(new NumbersDouble());
        System.out.println("\nProducts: ");
        Run(new Products());
        System.out.println("\nScannerExemplo: ");
        Run(new ScannerExemplo());
        System.out.println("\nTrapeze: ");
        Run(new Trapeze());
    }

    public static void Run(Projeto projeto)
    {
        projeto.Executar();
    }
}
