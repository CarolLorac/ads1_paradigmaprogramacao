package projetos;

import java.util.Scanner;
import projetos.Animais.ProjetoAnimais;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ProjetoAnimais projetoAnimais = new ProjetoAnimais(); 
        ChatBot chatBot = new ChatBot();
        DaoCrud daoCrud = new DaoCRUD();
        Polimorfismo polimorfismo = new Polimorfismo();

        System.out.println("Digite qual exercício você deseja: ");
        System.out.println("1 - Animais");
        System.out.println("2 - Banco");
        System.out.println("3 - ChatBot");
        System.out.println("4 - DAO/CRUD");
        System.out.println("5 - Estrutura Condicional");
        System.out.println("6 - Estrutura Sequencial");
        System.out.println("7 - Estrutura Repetição");
        System.out.println("8 - Polimorfismo");
        System.out.println("9 - Unidade Empresa");
        int exercicio = sc.nextInt();
        
        switch(exercicio)
        {
            case 1:
                projetoAnimais.Execute();
                break;
            case 2:

                break;
            case 3:
                chatBot.Execute();
                break;
            case 4:
                daoCRUD.Execute();
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                polimorfismo.Executar();
                break;
            case 9:

                break;
        }

        sc.close();
    }
}