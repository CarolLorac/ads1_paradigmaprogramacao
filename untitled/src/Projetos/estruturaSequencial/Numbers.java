package projetos.estruturaSequencial;

import projetos.Projeto;

public class Numbers extends Projeto
{
    @Override
    public void Executar()
    {
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
    }
}
