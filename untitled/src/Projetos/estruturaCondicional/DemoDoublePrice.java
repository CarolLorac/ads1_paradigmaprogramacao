package projetos.estruturaCondicional;

import projetos.Projeto;

public class DemoDoublePrice extends Projeto
{
    @Override
    public void Executar() 
    {
        double preco = 25;
        double desconto;

        if(preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }

        preco += desconto;

        System.out.printf("Desconto aplicado de R$ %.2f%n", desconto);
        System.out.println("O preço com desconto é de R$ " + preco);
    }
}
