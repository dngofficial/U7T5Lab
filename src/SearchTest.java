import java.util.ArrayList;
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

        int[] numArray = {3, -2, 9, 38, -23, 9, 100};

        // TEST PART A
        // write test code to search numArray for 38 and print result; should print 3
        System.out.println(Search.linearSearch(numArray, 38));

        // write test code to search numArray for 9 and print result; should print 2
        System.out.println(Search.linearSearch(numArray, 9));

        // write test code to search numArray for 5 and print result; should print -1
        System.out.println(Search.linearSearch(numArray, 5));

        // TEST PART B
        // use the same numArray and test the same three values as above, in the
        // same order, printing each result:  should print true, true, false

        System.out.println(Search.linearSearchBoolean(numArray, 38));

        System.out.println(Search.linearSearchBoolean(numArray, 9));

        System.out.println(Search.linearSearchBoolean(numArray, 5));





        // TEST PARTS C & D -- UNCOMMENT TEST CODE

        ArrayList<Integer> numArrayList = new ArrayList<Integer>(Arrays.asList(3, -2, 9, 38, -23, 9, 100));
        System.out.println("Tests of linear search Integer ArrayList:");
        System.out.println(Search.linearSearch(numArrayList, 3));
        System.out.println(Search.linearSearch(numArrayList, 9));
        System.out.println(Search.linearSearch(numArrayList, -23));
        System.out.println(Search.linearSearch(numArrayList, 99));

        System.out.println("Tests of linear search String array:");
        String[] arr1 = {"blue", "red", "purple", "green", "purple"};
        System.out.println(Search.linearSearch(arr1, "purple"));
        System.out.println(Search.linearSearch(arr1, "pink"));


        // TEST PART E -- UNCOMMENT TEST CODE

        int[] numArray2 = {5, 1, 5, 4, 7, 5, 2, 5, 8, 8, 5, 10, 5};
        System.out.println(Search.linearSearchLast(numArray2, 4));
        System.out.println(Search.linearSearchLast(numArray2, 8));
        System.out.println(Search.linearSearchLast(numArray2, 5));
        System.out.println(Search.linearSearchLast(numArray2, 9));


        // TEST PART F -- UNCOMMENT TEST CODE

        System.out.println(Search.linearSearchCount(numArray2, 5));
        System.out.println(Search.linearSearchCount(numArray2, 9));

        ArrayList<Integer> numArrayList2 = new ArrayList<Integer>(Arrays.asList(5, 1, 5, 4, 7, 5, 2, 5, 8, 8, 5, 10, 5));
        System.out.println(Search.linearSearchCount(numArrayList2, 5));
        System.out.println(Search.linearSearchCount(numArrayList2, 9));

    }


}
