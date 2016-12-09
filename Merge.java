
package newsort;

public class Merge {

    public int[] valor;

    public Merge(int[] valor) {

        this.valor = new int[valor.length];

        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {
        MergeSort(0, valor.length-1);
    }

    public void MergeSort(int inicio, int fim) {

        if (inicio < fim) {

            int media = inicio + (fim - inicio) / 2;
            MergeSort(inicio, media);
            MergeSort(media + 1, fim);
            MergeOrganizar(inicio, media, fim);

        }
    }

    public void MergeOrganizar(int inicio, int media, int fim) {

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
