package projetos.estruturaSequencial;

import java.util.Scanner;

import projetos.Projeto;

public class ScannerExemplo extends Projeto
{
    @Override
    public void Executar()
    {
        System.out.println("Digite um 3 números e entre eles aperte a tecla ENTER");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados Digitados: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
