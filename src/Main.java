import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int max=0;

            System.out.println("Enter the number of elements :");
            int j = scanner.nextInt();
            int[] numbers = new int[j]; //  there are j elements in this array called numbers

            //int[] numbers = {5,17,17,18,2,10,15,3,8,1};

            for (int k=0;k<j;k++){

                System.out.println("Enter the element"+(k+1)+":");
                numbers[k] = scanner.nextInt();
            }


            int len = numbers.length;

            /*System.out.println(len);*/

            for (int i=0;i<len;i++){
                if (numbers[i]<max){
                    max = max;
                }
                else {
                    max = numbers[i];
                }
            }
            System.out.println("\nMax number is "+max);

        }catch (Exception e){
            System.out.println("Error : "+e);
        }

        }



    }
