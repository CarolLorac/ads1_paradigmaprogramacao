package projetos.loja;

import java.util.Scanner;

import projetos.Projeto;

public class Loja extends Projeto
{
    @Override
    public void Executar() 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("digite o nome do produto:");
            String nome = sc.nextLine();
            System.out.println("digite o preco do produto:");
            double preco = sc.nextDouble();
            System.out.println("digite a quantidade do produto:");
            int quantidade = sc.nextInt();
            Produto produto1 = new Produto(nome, preco,quantidade);
            System.out.println(produto1.toString());
        }
    }
}