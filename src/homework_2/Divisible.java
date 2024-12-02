package homework_2;

public class Divisible {
    public static void main(String[] args) {



        //for (int i = 0; i < brojevi.length; i++) {
        //    System.out.println("selektovan broj" + i );
        //  divisibleBy(brojevi[i]);
        //  }


        int[] numbers = {1, 2, 3, 4, 5};
        int counter =0;

        while ( counter < numbers.length){

            if (numbers[counter] / 3 != 0) {
                System.out.println(numbers[counter] + " is divisible by 3");
            } else if (numbers[counter] / 5 != 0) {
                System.out.println(numbers[counter] + " is divisible by 5");
            } else if (numbers[counter] / 3 != 0 && numbers[counter] / 5 != 0) {
                System.out.println(numbers[counter] + " is divisible by 3 and 5");
            } else {
                System.out.println(numbers[counter] + " is not divisible by 3 nor 5");
            }
            counter++;

        }

    }
}
