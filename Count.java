package newsort;

public class Count {

    public int[] valor;

    public Count(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }

    public void Inicio() {
        CountSort(0, valor.length);
    }

    public void CountSort(int menor, int maior) {
        
        int maiorValor = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > maiorValor) {
                maiorValor = valor[i];
            }
        }
        
        int[] vetorTemporario = new int[maiorValor + 1];

        for (int i = 0; i < vetorTemporario.length; i++) {
            vetorTemporario[i] = 0;
        }

        for (int i = 0; i < valor.length; i++) {
            vetorTemporario[valor[i]] += 1;
        }
        
        for (int i = 1; i < vetorTemporario.length; i++) {
            vetorTemporario[i] += vetorTemporario[i - 1];
        }
        
        int[] vetorAuxiliar = new int[valor.length];
        
        for (int j = 0; j < vetorAuxiliar.length; j++) {
            vetorAuxiliar[vetorTemporario[valor[j]]-1] = valor[j];            
            vetorTemporario[valor[j]] -= 1;
        }
                
        for (int i = 0; i < vetorAuxiliar.length; i++) {
            valor[i] = vetorAuxiliar[i];
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
