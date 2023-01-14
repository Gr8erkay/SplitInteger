import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println( splitInteger(20, 6));

    }

    public static List<Integer> splitInteger(int num, int parts) {

        ArrayList <Integer> arr= new ArrayList<>();

        int count = parts;

        while (count > 0) {
            int arrNum = num/parts;
            if(num % parts != 0){
                arr.add(arrNum);
                num -= arrNum;
                parts--;
                arr.remove(arr.get(0));

//                for (int i < parts; i > 0; i--){
//                    int rem = num % parts;
//                    arr[i] + 1;
//                    rem --;
//                    if (int rem = 0){
//                        break;
//                    }
//                }
            }
            arr.add(arrNum);
            count--;
        }

        return arr;
    }
}
