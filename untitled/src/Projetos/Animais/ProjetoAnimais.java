package projetos.animais;// package Aula1;

import projetos.Projeto;
import projetos.animais.entities.Aquatico;
import projetos.animais.entities.Mamifero;

public class ProjetoAnimais extends Projeto
{
    @Override
    public void Executar() 
    {
        System.out.println("\n***********************");
        System.out.println("ANIMAIS\n");

        System.out.println("Os animais Mamiferos: " + Mamifero.caraAnimal1 + Mamifero.caraAnimal2
                            + Mamifero.caraMamiferos1 + Mamifero.caraMamiferos2);

        System.out.println("Os animais Aquaticos: " + Aquatico.caraAnimal1 + Aquatico.caraAnimal2
                            + Aquatico.caraAquatico1 + Aquatico.caraAquatico2);
    }
}
