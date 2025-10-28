public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[]{5, 0, -1, 9, 6 ,-5, 9, 3};
        SortShell sortShell = new SortShell();
        View view = new View();


        System.out.println("Original: ");
        view.printArray(numeros);
        sortShell.sort(numeros);
        System.out.println("Ordenado: ");
        view.printArray(numeros);
    }
}
