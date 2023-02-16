import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Final_Java {

    public static void main(String[] args) {

        Integer[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list2 = new ArrayList<>();
        String choice;
        int wanted_num;

        while (true) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Menu of Searching and Sorting Testbed.\n\n 1)  Linear searching\n 2)   Binary Searching\n 3) " +
                    "  0(n^2) type of sorting\n 4)   0(n*log(n)) type of sorting\n 5)   Sorting performance" +
                    "\n\n");
            System.out.println("");
            System.out.println("q/Q Quit\n\n");
            System.out.println("Your choice: ");
            choice = sc.nextLine();

            System.out.println(" ");

            if (Objects.equals(choice, "Quit") || Objects.equals(choice, "Q") || Objects.equals(choice, "q")) {
                break;
            }

            System.out.println("");
            //////////////////////Switch Cases for Every Option\\\\\\\\\\\\\\\\\\\\\\\\
            switch (choice) {
                case "1":

                    System.out.print("In the list are values 0, ..., 9; which value would you " +
                            "like to search with Linear Search? ");
                    wanted_num = sc.nextInt();

                    boolean result1 = Linear_Search.linearSearch(list, 0, 9, wanted_num);
                    if (result1)
                        System.out.println("Found\n");
                    else
                        System.out.println("Not Found\n");
                    break;



                case "2":

                    System.out.println("In the list are values, ..., 9; which value would you" +
                            "like to search with Binary Search? ");
                    wanted_num = sc.nextInt();

                    boolean result2 = Binary_Search.binarySearch(list, 0, 9, wanted_num);
                    if (result2)
                        System.out.println("Found \n");
                    else
                        System.out.println("Not Found\n");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);


                case "3":

                    System.out.println("Data set before insertion sorting:");
                    for (int i = 0; i < 9; i++) {
                        list2.add((int) (Math.random()*(201)-100));
                        System.out.print(list2.get(i)+ " ");
                    }
                    Integer[] list2_1 = list2.toArray(new Integer[0]);
                    Insertion_Sorting.insertionSort(list2_1);
                    System.out.println("\n\nData set after insertion sorting:");
                    System.out.println(Arrays.toString(list2_1)+"\n");


                    list2.clear();
                    break;

                case "4":

                    System.out.println("Data set before insertion sorting:");
                    for (int i = 0; i < 9; i++) {
                        list2.add((int) (Math.random()*(201)-100));
                        System.out.print(list2.get(i)+ " ");
                    }
                    Integer[] list2_2 = list2.toArray(new Integer[0]);
                    Quick_Sorting.quickSort(list2_2);
                    System.out.println("\n\nData set after insertion sorting:");
                    System.out.println(Arrays.toString(list2_2)+"\n");

                    list2.clear();
                    break;

                case "5":
                    System.out.println("Stage 5 not completed");

                break;





            }
        }
    }
}
