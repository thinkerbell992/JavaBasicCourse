package homework_2;

public class ToLowercase {
    public static void main(String[] args) {
        //niz stringova u lowercase

        String[] arrayString ={"PRVI","DRUGI","TRECI"};


        // for(int i=0; i<arrayString.length; i++){
        //     System.out.print(arrayString[i] + " ");
        // }

        for (int i=0; i< arrayString.length; i++){
            // arrayString[i] = arrayString[i].toLowerCase();
            String pretvorenoUMalaSlova = arrayString[i].toLowerCase();
            System.out.println(pretvorenoUMalaSlova);
            // arrayString[i] = pretvorenoUMalaSlova;
        }

        for(int i=0; i<arrayString.length; i++){
            System.out.print(arrayString[i] + " ");
        }
    }
}
