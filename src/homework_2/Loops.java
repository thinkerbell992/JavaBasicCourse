package homework_2;

public class Loops {
    public static void main(String[] args){
        //for petlja

        int[] array ={1,2,3,4};

        int sumArray =0;

        for (int element: array){

            sumArray = sumArray + element;
        }
        System.out.println("Zbir niza je:" + sumArray);

        //while petlja

        int[] array2 ={5,3,8,4};
        int brojac =0;
        int sum =0;

        while (brojac<array2.length){
            System.out.println("brojac je:" + brojac + " suma je " + sum);
            //   sum = sum + brojac;
            sum = sum + array2[brojac];
            brojac++;
        }

        System.out.println("Zbir niza je:" + sum);



    }
}
