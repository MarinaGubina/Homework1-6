import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

 // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

// Задание 2
        int max = 0;
        int min = 200_000;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];}
            if(arr[i] < min){
                min = arr[i];}
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

// Задание 3
        sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        double averageSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

// Задание 4
        char[] reverseFullName = {'n', 'a','v','I',' ', 'v','o','n','a','v','I'};
        for(int k = reverseFullName.length-1; k >= 0 ; k--){
            System.out.print(reverseFullName[k]);}

// Задание 5
        System.out.println();
        int[][] arr5 = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if((i == j)||((i == 0 || i ==2)&& (j == 0 || j ==2))){
                    arr5[i][j] = 1;
                }
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();}

// Задание 6
        int[] arr6 = {5,4,3,2,1};
        int[] newArr = new int[arr6.length];
        System.out.println(Arrays.toString(arr6));
        for(int l = 0 ; l < newArr.length; l++){
            newArr[l] = arr6[arr6.length-1-l];
        }
        System.out.println(Arrays.toString(newArr));

// Задание 7
        int[] arr7 = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr7));
        int swap = 0;
        for(int i = 0 ; i < 3; i++){
            swap = arr7[i];
            arr7[i] = arr7[arr7.length-1-i];
            arr7[arr7.length-1-i] = swap;
        }
        System.out.println(Arrays.toString(arr7));

// Задание 8
        int[] arrAdd = {-6,2,5,-8,8,10,4,-7,12,1};
        Arrays.sort(arrAdd);
        System.out.println(Arrays.toString(arrAdd));
        for(int k = 0; k < arrAdd.length-2; k++){
            if(arrAdd[k]-arrAdd[k+1]==-2){
                System.out.println(arrAdd[k] + " - " + arrAdd[k+1] + " = -2");
            }
        }

// Задание 9
        System.out.println();
        int[] arrAddHard = {-6,2,5,-8,8,10,4,-7,12,1};
        for(int k = 0; k < arrAddHard.length ; k++){
            for(int i = 0; i < arrAddHard.length; i++){
                if(arrAddHard[k]-arrAddHard[i]==-2){
                    System.out.println(arrAddHard[k] + " - " + arrAddHard[i] + " = -2");
                }
            }
        }

    }
}