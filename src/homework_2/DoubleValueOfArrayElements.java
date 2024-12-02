package homework_2;

public class DoubleValueOfArrayElements {
    public static void main(String[] args) {

        int[] arrayNumbers = {10,15,20,25,30};

        // for (int i=0; i<arrayNumbers.length; i++){

        //    int element = arrayNumbers[i] *2;
        //    System.out.println("elementiniza " + element);
        // }
        System.out.println("ispisujem pocetni niz: ");
        for(int i=0; i<arrayNumbers.length ;i++){
            System.out.print( arrayNumbers[i] +  " ");
        }
        for(int i=0; i<arrayNumbers.length ;i++){
            // arrayNumbers[i] = arrayNumbers[i] *2;

            // int element = arrayNumbers[i] * 2;
            // arrayNumbers[i] = element;

            int element = arrayNumbers[i];
            element = element * 2;
            arrayNumbers[i] = element;
        }

        System.out.println("\nispisujem Izmenjeni niz:");
        for(int i=0; i<arrayNumbers.length ;i++){
            System.out.print( arrayNumbers[i] +  " ");
        }

    }
}
