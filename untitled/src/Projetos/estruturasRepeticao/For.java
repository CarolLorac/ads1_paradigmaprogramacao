package projetos.estruturasRepeticao;
import java.util.Scanner;

import projetos.Projeto;

public class For extends Projeto
{
    @Override
    public void Executar()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 5 coisas");

        for (int i = 0; i < 5; i++) {
            System.out.printf("[%d] valor: ",i);
            sc.nextLine();
        }
    }
}
