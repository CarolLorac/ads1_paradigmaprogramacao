package projetos.animais;// package Aula1;

import projetos.Animais.Entities.Aquatico;
import projetos.Animais.Entities.Mamifero;

public class ProjetoAnimais 
{
    public void Execute() 
    {
        System.out.println("Os animais Mamiferos: " + Mamifero.caraAnimal1 + Mamifero.caraAnimal2
                            + Mamifero.caraMamiferos1 + Mamifero.caraMamiferos2);

        System.out.println("Os animais Aquaticos: " + Aquatico.caraAnimal1 + Aquatico.caraAnimal2
                            + Aquatico.caraAquatico1 + Aquatico.caraAquatico2);
    }
}
