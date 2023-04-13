package projetos.estruturaSequencial;
import projetos.Projeto;

public class Trapeze extends Projeto
{
    @Override
    public void Executar()
    {
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);
    }
}