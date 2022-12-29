//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

public class Main {
    public static void main(String[] args) {
        int n = 100;
        double arr[] = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        double max = arr[0];
        double min = arr[0];
        double avg = 0;
        for (int i =0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
            avg += arr[i]/arr.length; // avg += arr... == avg = avg + arr...
        }
        System.out.println("Максимальное элекмент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Среднее: " + avg);
    }
}
