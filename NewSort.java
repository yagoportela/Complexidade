
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
        
        System.out.println("\nBubble: ");
        Bubble bubble = new Bubble(valor);
        bubble.Inicio();
        bubble.Impressao();
        
        System.out.println("\nInsert: ");
        Insert insert = new Insert(valor);
        insert.Inicio();
        insert.Impressao();
        
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
        
        System.out.println("\nHeap: ");
        HeapSort heap = new HeapSort(valor);
        heap.Inicio();
        heap.Impressao();
        
        System.out.println("\nBucket: ");
        Bucket bucket = new Bucket(valor);
        bucket.Inicio();
        bucket.Impressao();
        
        System.out.println("\nCount: ");
        Count count = new Count(valor);
        count.Inicio();
        count.Impressao();
        
        System.out.println("\nRadix: ");
        Radix radix = new Radix(valor);
        radix.Inicio();
        radix.Impressao();
        
        System.out.println("\nTim: ");
        Tim tim = new Tim(valor);
        tim.Inicio();
        tim.Impressao();
    }
    
}
