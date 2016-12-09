
package newsort;

public class Radix {    

    public int[] valor;

    public Radix(int[] valor) {

        this.valor = new int[valor.length];
        System.arraycopy(valor, 0, this.valor, 0, this.valor.length);
    }
    
    public void Inicio() {
        RadixSort();
    }
    
   public void RadixSort(){

        for(int posicao=1; posicao <= 1000000000; posicao *= 10){
            
            CountSort(posicao);
        }

    }

    private void CountSort(int posicao){
        int[] saida = new int[valor.length];
        int[] count = new int[10];

        for(int i=0; i < valor.length; i++){
            int digito = (valor[i]/posicao ) % 10;
            count[digito] += 1;
        }

        for(int i=1; i < count.length; i++){
            count[i] += count[i-1];
        }

        for(int i = valor.length-1; i >= 0; i--){
            int digito = (valor[i]/posicao ) % 10;
            saida[count[digito]-1] = valor[i];
            count[digito]--;
        }

        valor =  saida;

    }

    
    public void Impressao() {

        String impressao = "";

        for (int i = 0; i < valor.length; i++) {
            impressao += "[" + valor[i] + "] ";
        }

        System.out.println(impressao);
    }
    
}
