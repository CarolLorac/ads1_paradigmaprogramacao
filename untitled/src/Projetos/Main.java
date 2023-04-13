package projetos;

import java.util.Scanner;
import projetos.animais.ProjetoAnimais;
import projetos.animais.entities.Animais;
import projetos.chatbot.ChatBot;
import projetos.daoCRUD.DaoCRUD;
import projetos.estruturaCondicional.EstruturaCondicional;
import projetos.estruturaSequencial.EstruturaSequencial;
import projetos.estruturasRepeticao.EstruturasRepeticao;
import projetos.polimorfismo.Polimorfismo;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int exercicio;

        do 
        {
            System.out.println("\nDigite qual exercício você deseja: ");
            System.out.println("1 - Animais");
            System.out.println("2 - Banco");
            System.out.println("3 - ChatBot");
            System.out.println("4 - DAO/CRUD");
            System.out.println("5 - Estrutura Condicional");
            System.out.println("6 - Estrutura Sequencial");
            System.out.println("7 - Estrutura Repetição");
            System.out.println("8 - Polimorfismo");
            System.out.println("0 - Sair");
            exercicio = sc.nextInt();

            switch(exercicio)
            {
                case 1:
                    Run(new ProjetoAnimais());
                    break;
                case 2:
                    
                    break;
                case 3:
                    Run(new ChatBot());
                    break;
                case 4:
                    Run(new DaoCRUD());
                    break;
                case 5:
                    Run(new EstruturaCondicional());
                    break;
                case 6:
                    Run(new EstruturaSequencial());
                    break;
                case 7:
                    Run(new EstruturasRepeticao());
                    break;
                case 8:
                    Run(new Polimorfismo());
                    break;
                case 0:
                    System.out.println("Obrigada!!");
                    break;
            }
        } while (exercicio != 0);
    }

    public static void Run(Projeto projeto)
    {
        projeto.Executar();
    }
}