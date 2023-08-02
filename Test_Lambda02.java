
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test_Lambda02 {

    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        List<String> mylist = new ArrayList(Arrays.asList(names));//將陣列 轉成 ArrayList集合
        System.out.println("原始元素：" + mylist.toString());

        /* Predicate Interface 的抽象方法 public boolean test(T t)
        使用 Lambda Expression */
        mylist.removeIf(s -> s.equals("Rick"));
        //mylist.removeIf(s -> s.length()<=4);
        //mylist.removeIf(s -> s.contains("ic"));
        System.out.println("移除之後：" + mylist.toString());

        //原本實作介面方式，使用介面建立物件實例 pre 必須即時override抽象方法
        Predicate<String> pre = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("Ne");
            }
        };
        mylist.removeIf(pre); //傳入介面的實作物件 pre (可看成使用介面建立物件實例)
        //集合新forEach方法，也是使用Lambda Expression 可依序取出集合中每一個元素
        //interface Consumer 實作 void accept(T t)
        mylist.forEach(b -> System.out.print(b + " "));
        System.out.println("");
        //Java Stream(串列)，類似 List 第二階段課程將介紹
        //Stream<String> s1 = Stream.of("One","Two","Three","Four","Five","Two");

    }

}
