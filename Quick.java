package newsort;

public class Quick {

    public int[] valor;

    public Quick(int[] valor) {

        this.valor = new int[valor.length];
        
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {
        QuickSort(0, valor.length - 1);
    }

    public void QuickSort(int menor, int maior) {
        int men = menor;
        int mai = maior;
        int pivo = valor[(maior + menor) / 2];

        if (men > mai) {
            return;
        }

        while (men <= mai) {
            while (valor[men] < pivo) {
                men++;
            }
            while (valor[mai] > pivo) {
                mai--;
            }

            if (men <= mai) {
                int aux = valor[men];
                valor[men] = valor[mai];
                valor[mai] = aux;
                mai--;
                men++;
            }
        }

        if (menor < mai) {
            QuickSort(menor, mai);
        }

        if (maior > men) {
            QuickSort(men, maior);
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
