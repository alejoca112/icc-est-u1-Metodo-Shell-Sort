public class SortShell {

    public SortShell(){
        System.out.println("Metodo Shell");
    }


    public void sort (int[] numeros) {
            int n = numeros.length;
            int comparaciones = 1;
            boolean cambios = true;
            for (int gap = n/2; gap > 0 ; gap /= 2) {
                for (int i = gap; i < n; i++) {
                    int temp = numeros[i] ;
                    int j = i;
                    comparaciones++;
                    while (j >= gap && numeros[j - gap] > temp) {
                        numeros[j] = numeros[j - gap];
                        j -= gap;
                    }
                    numeros[j] = temp;
                    if(cambios){
                        cambios = true;
                        comparaciones++;
                    }

                }
                
                System.out.println(" Comparaciones: " + comparaciones);
            }
    }
    
}
