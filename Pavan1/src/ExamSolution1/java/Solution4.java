package ExamSolution1.java;

public class Solution4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 2, 1, 3, 3};
        System.out.println("--------------------");
        System.out.println("Sockmerchantoutput" + Sockmerchant(7, arr));
        System.out.println("--------------------");
    }

    private static int Sockmerchant(int i, int[] arr) {
        int pairs = 0;
            int frequencyArray[] = new int[arr.length];
            int frequencyTemp = -1;
            for (i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequencyArray[j] = frequencyTemp;
                    }
                }
                frequencyArray[i] = count;
            }

            for (i = 0; i < frequencyArray.length; i++) {
                if (frequencyArray[i] != frequencyTemp) {
                    int divide = frequencyArray[i] / 2;
                    pairs += divide;
                }
            }
            return pairs;
        }
    }

