package newsort;

public class Bubble {

    public int[] valor;

    public Bubble(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        BubbleSort();

    }

    public void BubbleSort() {

        boolean continuar = false;

        while (continuar == false) {
            continuar = true;

            for (int i = 0; i < valor.length - 1; i++) {
                if (valor[i] > valor[i + 1]) {

                    int aux = valor[i];
                    valor[i] = valor[i + 1];
                    valor[i + 1] = aux;
                    continuar = false;

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
