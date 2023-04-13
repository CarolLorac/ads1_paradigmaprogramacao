package projetos.polimorfismo;
import java.util.ArrayList;
import java.util.List;

// Teste de Polimorfismo
public class Polimorfismo 
{
    public void Executar() 
    {
        //Explicação professor:
        System.out.println("polimorfismo: Soma 10+20:");
        Execute ex = new Soma();
        System.out.println(ex.execute(10, 20));

        System.out.println("polimorfismo Parametrico: 10*20:");
        System.out.println(execute(10, 20, new Multiplica()));

        // Polimorfismo Parametrico
        List<Execute> list = new ArrayList<Execute>();
        list.add(ex);

        // Utilizacao de um polimorfismo por sobrecarga
        System.out.println("polimorfismo por sobrecarga = Soma 10+20:");
        Soma ex1 = new SuperSoma();
        System.out.println(execute(10, 20, ex1));

        // Polimorfismo por Coercao
        System.out.println("polimorfismo por coercao = Soma 1+2.0:");
        double x = 1 + 2.0;
        System.out.println(x);

        // - - - - - - - - - - - - - - - - - - - - - - -- 
        // Exercício:

        System.out.println("\nPOLIMORFISMO");
        System.out.println("Valores 10 e 5");
        Execute operacao = new Soma();
        System.out.println("Soma: " + operacao.execute(10, 5));

        operacao = new Subtrai();
        System.out.println("Subtração: " + operacao.execute(10, 5));

        operacao = new Multiplica();
        System.out.println("Multiplicação: " + operacao.execute(10, 5));

        operacao = new Divide();
        System.out.println("Divisão: " + operacao.execute(10, 5));

        System.out.println("\nPOLIMORFISMO POR SOBRECARGA:");
        System.out.println("Valores: 5 e 2.5");
        System.out.println("Soma: " + execute(5, 2.5, new Soma()));
        System.out.println("Subtração: " + execute(5, 2.5, new Subtrai()));
        System.out.println("Multiplicação: " + execute(5, 2.5, new Multiplica()));
        System.out.println("Divisão: " + execute(5, 2.5, new Divide()));
    }


    /**
     * Este codigo pode somar, multiplicar ...
     */
    public static double execute(double val1, double val2, Execute ex) 
    {
        return ex.execute(val1, val2);
    }

}
