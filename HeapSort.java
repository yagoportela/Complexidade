package newsort;

public class HeapSort {

    public int[] valor;
    int[] temporario;

    public HeapSort(int[] valor) {

        this.valor = new int[valor.length];
        temporario = new int[valor.length];

        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        HeapSort();

    }

    public void HeapSort() {
        for (int i = valor.length / 2 - 1; i >= 0; i--) {
            HeapOrganiza(i, valor.length);
        }
        int n = valor.length;
         for (int i = valor.length - 1; i > 0; i--) {
            int aux = valor[i];
            valor[i] = valor[0];
            valor[0] = aux;
            HeapOrganiza(0, --n);
        }
    }

    public void HeapOrganiza(int pai, int fim) {
        
        int max;
        int filho1 = pai * 2;
        int filho2 = pai * 2 + 1;
        
        if(filho1 < fim && valor[filho1] > valor[pai]){
            max = filho1;
        }else{
            max = pai;
        }
        
        if(filho2 < fim && valor[filho2] > valor[max]){
                max = filho2;
        }
                
        if(max != pai){
            int aux = valor[pai];
            valor[pai] = valor[max];
            valor[max] = aux;
            
            HeapOrganiza(max, fim);
        }
    }

    public void HeapSort(int posicao, int tamanhoVetor) {

    }

    public void Impressao() {

        String impressao = "";

        for (int i = 0; i < valor.length; i++) {
            impressao += "[" + valor[i] + "] ";
        }

        System.out.println(impressao);
    }

}
