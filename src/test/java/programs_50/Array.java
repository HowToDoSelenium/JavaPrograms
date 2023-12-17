package programs_50;

public class Array { 
 
    private static int missingNumber(int arr1[], int arr2[]) {
 
        int missingNumber = arr1[0];
        
        for (int i = 1; i < arr1.length; i++) {
            missingNumber ^= arr1[i];
        }
 
        for (int i = 0; i < arr2.length; i++) {
            missingNumber ^= arr2[i];
        }
        return missingNumber;
    }
 
    public static void main(String[] args) {
 
        int array1[] = { 1, 2, 3, 4, 5};
        int array2[] = { 1, 2, 4, 5 };
 
        int missingNumber = missingNumber(array1, array2);
        System.out.println(missingNumber);
 
        
    }
}