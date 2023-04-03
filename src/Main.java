import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
        int [] result = ArraysOperations.incElements(a);
        Arrays.stream(result).forEach(System.out::println);

        int [] newArray = ArraysOperations.incElements2(a);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}