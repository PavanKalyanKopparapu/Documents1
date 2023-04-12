package ExamsPractise;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 4, 5, 1, 3,2,2,2,3,3,4,4};
        System.out.println("DuplicateElements in the given array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
