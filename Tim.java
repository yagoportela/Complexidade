package newsort;

import java.util.ArrayList;

public class Tim {

    public int[] valor;

    public Tim(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        timsort(0, valor.length , 4);

    }

    public void timsort(int inicio, int fim, int minrun) {

        if (fim <= inicio) {
            return;
        }
        int l = fim - inicio;
        if (l > minrun) {
            int meio = (inicio + fim) / 2;
            timsort(inicio, meio, minrun);
            timsort(meio + 1, fim, minrun);
            MergeSort(inicio, fim, meio);
        } else {
            InsertSort(inicio, fim);
        }
    }

    public void InsertSort(int inicio, int fim) {

        for (int i = inicio; i < fim; i++) {

            for (int j = i; j >= 1; j--) {
                if (valor[j] < valor[j - 1]) {
                    int aux = valor[j];
                    valor[j] = valor[j - 1];
                    valor[j - 1] = aux;
                }
            }

        }
    }

    public void MergeSort(int inicio, int fim, int media) {

        int i = inicio;
        int j = media + 1;
        int k = inicio;

        int[] aux = new int[valor.length];
        System.arraycopy(valor, 0, aux, 0, valor.length);

        while (i <= media && j <= fim) {
            
            if (aux[i] <= aux[j]) {
                valor[k] = aux[i];
                i++;
            } else {
                valor[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= media) {
            valor[k] = aux[i];
            i++;
            k++;
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
