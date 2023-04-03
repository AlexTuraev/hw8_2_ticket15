import java.util.Arrays;

public class ArraysOperations {
    public static int[] incElements(int[] a) {
        return Arrays.stream(a).map(el->{
            return el%2 == 0 ? ++el : el;
        }).skip(3).limit(5).toArray();
    }

    public static int[] incElements2(int[] a) {
        int [] res = Arrays.copyOf(a, a.length);

        for (int i = 0; i < res.length; i++) {
            if (res[i] % 2 == 0) {
                res[i] = res[i] + 1;
            }
        }

        int [] result = new int[5];
        for (int i = 3; i < 8; i++) {
            result[i-3] = res[i];
        }
        return result;
    }
}
