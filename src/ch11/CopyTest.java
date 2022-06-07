package ch11;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyTest {
    public static <E> void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4};
        int[] dataNew = new int[]{0, 1, 2, 3, 4};
        ArrayList<Object> dataList = new ArrayList<>(5);
        ArrayList<E> dataList2 = new ArrayList<E>(5);
        int[] sCopy = null;
        int[] dCopy = null;

        sCopy = shallowCopy(data);
        dCopy = deepCopy(data);


        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(sCopy));
        System.out.println(Arrays.toString(dCopy));

        data[0] = 5;

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(sCopy));
        System.out.println(Arrays.toString(dCopy));

    }

    private static int[] shallowCopy(int[] data) {
        return data;
    }

    private static int[] deepCopy(int[] data) {
        if (data == null) return null;
        int[] result = new int[data.length];


        System.arraycopy(data, 0, result, 0, data.length);
        return result;
    }
}
