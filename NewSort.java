
package newsort;

import java.util.Random;

public class NewSort {

    public static void main(String[] args) {
        int[] valor = new int[10];

        Random random = new Random();
        String impressao = "";
        for (int i = 0; i < valor.length; i++) {
            valor[i] = random.nextInt(10) + 1;
            impressao += "["+valor[i]+"] ";
        }
        System.out.println(impressao);
        
        System.out.println("\nMerger: ");
        Merge merge = new Merge(valor);
        merge.Inicio();
        merge.Impressao();
        
        System.out.println("\nQuick: ");
        Quick quick = new Quick(valor);
        quick.Inicio();
        quick.Impressao();
        
        System.out.println("\nSelect: ");
        Select select = new Select(valor);
        select.Inicio();
        select.Impressao();
    }
    
}
