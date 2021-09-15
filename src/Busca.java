public class Busca {
    public static void main(String[] args) {
//      int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = new int[10];
        for (int elemento = 0; elemento < array.length; elemento++) {
        array[elemento] = elemento +1;
        }

        int busca = 6;
        for (int i = 0; i < array.length; i++){
            if (array[i] == busca) {
                System.out.println("O número " + busca + " foi encontrado na posicao " + i + " do array.");
            }
        }
    }
}
