package projetos.estruturaSequencial;

import projetos.Projeto;

public class Division extends Projeto
{
    @Override
    public void Executar()
    {
        int a, b;
        double result;

        a = 5;
        b = 2;

        result = a / b;

        System.out.println(result);
    }
}
