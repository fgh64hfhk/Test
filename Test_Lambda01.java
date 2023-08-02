
import java.util.ArrayList;//Array 集合(類別)
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
//Lambda Expression

public class Test_Lambda01 {

    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        List<String> mylist = Arrays.asList(names);//將陣列 轉成 List 集合(介面)
        for (String s : mylist) {//增強型for-loop依序取出myList中元素
            // 顯示mylist中的元素成為全大寫
            System.out.print(s.toUpperCase() + ", ");//字串變大寫顯示，但原myList中內容沒改變
        }
        //mylist中的元素還是不變(因String class)，因為是存在於迴圈方法內的區域變數
        System.out.println("\nAfter for loop: " + mylist);

        //Lambda Expression 是一種實作介面，簡化的新語法，如下兩種寫法
        //實作UnaryOperator介面的抽象方法 R apply(T)
        //input arguments to override the only one abstract method in interface List.
        mylist.replaceAll(s -> s.toUpperCase());
        //簡化介面的抽象方法，將方法參數傳進介面的預設具體方法

//        mylist.replaceAll((String s) -> {
//            return s.toUpperCase();
//        });
        System.out.println("List.replaceAll lambda 1: " + mylist);
        
        mylist.replaceAll((String str) -> {return str.concat("_JAVA");});
        System.out.println("List.replaceAll lambda Test: " + mylist);
        System.out.println("----------------------------------------");
        
        String str1 = "JAVA~";
        mylist.replaceAll((String str) -> {return str1 + str;});
        System.out.println("List.replaceAll lambda Test: " + mylist);
        System.out.println("----------------------------------------");

        //原本實作介面方式，使用介面建立物件實例 uo 必須即時override抽象方法
        UnaryOperator<String> uo = new UnaryOperator<String>() {
            @Override
            public String apply(String t) {
                return t.toLowerCase();
            }
        };
        //傳入介面的實作物件 uo (可看成使用介面建立物件實例)
        mylist.replaceAll(uo);
        System.out.println("List.replaceAll lambda 2: " + mylist);

    }

}
