
public class Test_var {
    //全域變數不可以使用 inference var

    public static void main(String[] args) {
        //var 只可以使用在 區域變數 方法內
        var num = 100;
        var name = "Anna";
        var name1 = new StringBuilder("Hannah");
        var ac = new Account("Bob");
    }
    //自己設計的方法不可以設定沒有規定型別的 inference，參數也不可以沒有設定型別
    public String doSomething(String name) {
        return "OK";
    }
    int[] arr1 = new int [5];
    int[] arr2 = {10,20,30};
    //inference cannot use in elements type of array, neither multiple variable
//    var[] arr3 = {40,50,60};
//    var price = 2.99, address = 0012;
}
