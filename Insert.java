
package newsort;

public class Insert {

    public int[] valor;

    public Insert(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {

        InsertSort(0, valor.length);

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
    
    public void Impressao() {
        

        String impressao = "";

        for (int i = 0; i < valor.length; i++) {
            impressao += "[" + valor[i] + "] ";
        }

        System.out.println(impressao);
    }
}
