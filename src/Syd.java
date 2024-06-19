
public class Syd {
    public static void main(String[] args){
        int[] numbers = { 1, 1, 2, 3, 4, 4, 1, 4, 5, 6, 4, 3, 4, 3, 2, 1, 2 };
        System.out.println("Все числа:");
        for ( int i =0; i<numbers.length;i++ )//цикл по всем переменным
            System.out.print(numbers[i] + " ");
        System.out.println();

        int[] counters = new int [ numbers.length ];

        for ( int i = 0; i < numbers.length; ++i ) {
            counters[i] = 0;

            for ( int j = 0; j < numbers.length; ++j )
                if ( numbers[i] == numbers[j] )
                    counters[i] += 1;
        }


        for ( int i = 0; i < numbers.length - 1; ++i ) {
            for ( int j = i + 1; j < numbers.length; ++j ) {
                if ( counters[j] > counters[i] ) {
                    int tmp = counters[i];
                    counters[i] = counters[j];
                    counters[j] = tmp;
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
                else if ( counters[i] == counters[j] && numbers[i] > numbers[j] ) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }

        System.out.println("Число\tКол-во вхождения");
        for ( int i = 0; i < numbers.length; i += counters[i] )
            System.out.println(numbers[i] + "\t\t" + counters[i]);
    }
}