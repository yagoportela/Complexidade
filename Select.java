package newsort;

public class Select {

    public int[] valor;
    int[] temporario;

    public Select(int[] valor) {

        this.valor = new int[valor.length];
        temporario = new int[valor.length];

        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        SelectSort();
        
    }

    public void SelectSort() {

        for (int i = 0; i < valor.length; i++) {

            int menor = valor[i];
            int posicao = i;

            for (int j = i + 1; j < valor.length; j++) {
                if (menor > valor[j]) {
                    menor = valor[j];
                    posicao = j;

                }

            }

            valor[posicao] = valor[i];
            valor[i] = menor;
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
