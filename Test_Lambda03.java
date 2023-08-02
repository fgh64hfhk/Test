
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test_Lambda03 {
    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        List<String> mylist = new ArrayList(Arrays.asList(names));//將陣列 轉成 ArrayList集合
        System.out.println("原始元素："+ mylist.toString());
        //使用原方式，做移除集合中符合條件的元素(與Lambda Expression 對照比較看看)
        //標準型for-loop
        for (int i=0; i<mylist.size(); i++) { //index 從 0 開始
            if (mylist.get(i).contains("ic")) { //文字串包含"ic"
                mylist.remove(i);//移除某一個元素
                i--;
            }
        }
        System.out.println("移除之後："+ mylist.toString());

        
    }

}
