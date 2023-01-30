public class Main {
    public static void main(String[] args) {
        //store a role number
        // int a = 19;

        //store a person's name
        // String name = "Johnny Bo";

        //store 5 role numbers
        //datatype[] variable_name = new datatype[size];
//        int[] rnos = new int[5];
//        //or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually creating the object in memory on the stack

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {
//            System.out.println(element);
//        }



    }
}