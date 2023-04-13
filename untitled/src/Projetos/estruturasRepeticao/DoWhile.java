package projetos.estruturasRepeticao;
import java.util.Scanner;

import projetos.Projeto;

public class DoWhile extends Projeto
{
    @Override
    public void Executar()
    {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        do {
            System.out.println("digite o numero 1: ");
            try 
            {
                a = Integer.parseInt(sc.nextLine());
            }
            catch (Exception e)
            {
                System.out.println("opa voce não digitou um numero");
            }

            if (a!=1)
            {
                System.out.println("e nao digitou o numero 1, tente denovo");
            }
        } while(a!=1);

        System.out.println("\n");
    }
}
