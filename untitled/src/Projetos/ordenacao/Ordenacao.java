package projetos.ordenacao;

import java.util.Arrays;

import projetos.Projeto;

public class Ordenacao extends Projeto
{
    @Override 
    public void Executar() 
    {
        int arrayLength = (int) (Math.random() * 40);
        // tamanho maximo do array é 40
        // System.out.println(arrayLength);

        int[] arrayAtividade = new int[arrayLength];
        System.out.println(arrayLength);
        //for (int i=0;i<arrayLength;i++){
        for (int i=0;i<arrayAtividade.length;i++){
            arrayAtividade[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arrayAtividade));
        Arrays.sort(arrayAtividade);
        System.out.println(Arrays.toString(arrayAtividade));
    }

}
