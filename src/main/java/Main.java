import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] arrayBefore4(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("Array without 4");
    }

    public static boolean arrayContains1and4(int[] arr){
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1){
                has1 = true;
            }
            if (arr[i] == 4){
                has4 = true;
            }
        }
        return has1 && has4;
    }
}
