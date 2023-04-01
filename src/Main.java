public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{98, 44, 33999, 55, 3, 300};
        method2(array);
    }

    static void method2(int[] array) {
        System.out.print("array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;

            }
        }
        System.out.println("MAX: " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            }System.out.println("MIN: " + min);
            System.out.print("array: ");
            for (int j = 0; j < array.length; j++) {
                if (j == indexMax) {
                    array[j] = min;
                } else if (j == indexMin) {
                    array[j] = max;
                }
                System.out.print(array[j] + " ");
            }



    }
}