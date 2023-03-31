public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{16, 44, 200, 55, 3};
        method(array);
    }
    static void method(int[] array) {
        System.out.print("array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
       int max = array[0];
       int min = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("MAX: "+max);
        for (int k : array) {
            if (k < min) {
                min = k;
                System.out.println("MIN: " + min);
            }
        }
        System.out.print("array: ");
            for (int j = 0; j <array.length ; j++) {
                if(array[j]==max){
                    array[j] = min;
                }else if(array[j]==min){
                    array[j] = max;
                }
                System.out.print(array[j]+" ");
        }

    }
    
}