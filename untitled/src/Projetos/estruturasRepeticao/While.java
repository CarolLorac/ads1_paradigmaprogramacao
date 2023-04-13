package projetos.estruturasRepeticao;
import java.util.Scanner;

import projetos.Projeto;

public class While extends Projeto
{
    @Override
    public void Executar()
    {
            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("digite bom dia");
                String bomdia = sc.nextLine();
                if (bomdia.toLowerCase().contains("bom dia")){
                    System.out.println("Tenha um bom dia! :)");
                    break;
                }
                System.out.println("por favor me da bom dia ngm me da bomdia:(");
            }
        }

}
