public class Ordenacao {

    public static int[] selectionSort(int[] lista){
        int min, aux;
        for( int i = 0; i < lista.length; i++){
            min = i;
            for(int j = i+1; j < lista.length; j++){
                if (lista[j] < lista[min]){
                    min = j;
                }
            }
            aux = lista[min];
            lista[min] = lista[i];
            lista[i] = aux;

        }
        return lista;
    }

    public static int[] insertionSort(int[] lista){
        int aux, j;
        for (int i = 1; i < lista.length; i++){
            aux = lista[i];
            j = i - 1;
            while (aux < lista[j] & j>=0){
                lista[j+1] = lista[i];
                j--;
            }
            lista[j+1] = aux;
        }
        return lista;







    }
    public static void main(String[] args) {
        int lista[] = {0, 1, 2 , 5, 8};
        System.out.println(Ordenacao.selectionSort(lista));

    }
}
