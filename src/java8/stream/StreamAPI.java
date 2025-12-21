package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Stream<Integer> stream = list.stream();
//        List<Integer> list1= stream.filter(elements -> elements % 2 == 0)
//                .toList();
//
//        list.forEach(System.out::println);
//        System.out.println("even number store in list2 using stream ");
//        list1.forEach(e -> System.out.print(e +" ") );
//
//        System.out.println(list1.stream().count());

//        int[] arr = {1,2,3,4,5};
//        int sum =0;
//
//        for (int i=0;i<arr.length;i++){
//            if(arr[i] %2 ==0){
//                sum+=arr[i];
//            }
//        }
//        System.out.println(sum);
//
//        Stream<Integer> stream = Arrays.stream(arr).boxed();
//        int sum1 =Arrays.stream(arr).filter(e->e%2==0).sum();
//        System.out.println(sum1);
//
//         Stream<String> st = Stream.generate(()->"hello").limit(4);
//         Stream<Integer> st1 = Stream.generate(()-> (int) (Math.random()*100)).limit(1);
//         st1.forEach(System.out::println);
//         st.forEach(word->System.out.println(word +" "));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> isEven = i-> i%2==0;
        list.stream().filter(isEven).forEach(System.out::println);


        Function<String,Integer> function = s -> s.length();
        Integer len= function.apply("abc");
        System.out.println("len:"+len);
        System.out.println("len :" +function.apply("abcdef"));


        Consumer<String> printer =   s -> System.out.println(s);
        printer.accept("abc");
        printer.accept("abcdef");

        Supplier<Integer> random = ()-> new Random().nextInt(10);
        System.out.println("random:"+random.get());

    }

}
