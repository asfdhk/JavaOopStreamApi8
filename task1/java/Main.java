import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,String> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0,
                        Collectors.mapping(Objects::toString,Collectors.joining(";"))));

        String evenNumbers = result.get(true);
        String oddNumbers = result.get(false);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

