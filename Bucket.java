package newsort;

import java.util.ArrayList;

public class Bucket {

    public int[] valor;

    public Bucket(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        BucketSort();

    }

    public void BucketSort() {

        int numBaldes = 5;

        ArrayList[] balde = new ArrayList[numBaldes];

        for (int i = 0; i < balde.length; i++) {
            balde[i] = new ArrayList<>();
        }

        for (int i = 0; i < valor.length; i++) {
            int j = numBaldes - 1;

            while (true) {
                if (j < 0) {
                    break;
                }

                if (valor[i] >= (j * 5)) {
                    balde[j].add(valor[i]);
                    break;
                }
                j--;
            }

        }

        for (int i = 0; i < balde.length; i++) {
            InsertSort(balde[i]);
        }

        int k = 0;
        for (int i = 0; i < balde.length; i++) {

            for (int j = 0; j < balde[i].size(); j++) {
                valor[k] = (int) balde[i].get(j);
                k++;
            }
        }
    }

    public void InsertSort(ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {

            for (int j = i; j >= 1; j--) {
                if (array.get(j) < array.get(j - 1)) {
                    int aux = array.get(j);
                    array.remove(j);
                    array.add(j, array.get(j - 1));
                    array.remove(j - 1);
                    array.add(j - 1, aux);
                }
            }

        }
    }

    public void Impressao() {

        String impressao = "";

        for (int i = 0; i < valor.length; i++) {
            impressao += "[" + valor[i] + "] ";
        }

        System.out.println(impressao);
    }
}
