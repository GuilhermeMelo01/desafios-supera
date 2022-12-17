package desafio3;

public class AlvoBetween {
    public static int entreValor(int[] array, int alvo){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] > array[j]) {
                    if (array[i] - array[j] == alvo) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = entreValor(new int[]{1, 5, 3, 4, 2}, 2);
        System.out.println(i);
    }
}
