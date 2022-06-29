// Написать метод, который проверяет массив на наличие дублей.


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5};
        System.out.println(isRepeat(array));

    }

    private static boolean isRepeat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int b = array[j];
                if (a == b) {
                    return true;
                }
            }
        }
        return false;
    }
}
