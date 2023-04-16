import java.util.HashSet;

public class Main {
    public static void main(String[] arg) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // хотіла записати коротше, щось типу = new int[20], але java тоді неправильно рахує
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                sum +=array[i];
            }
        }
        System.out.println(sum);

        ///задачка №2///////

        String inputString = "Alexx9800";

        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            uniqueChars.add(inputString.charAt(i));
        }
        for (Character ch : uniqueChars) {
            System.out.println(ch);
        }
    }



}



