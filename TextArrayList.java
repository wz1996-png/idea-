
public class TextArrayList {
    /**
     * @author 文状
     * 手写arraylist的测试
     *
     */
    public static void main(String[] args) {
        //泛型才决定类型 泛型擦除
        ExtList<Object> listString =new ExtArrayList<Object>();
        listString.add("小");
        listString.add("修");
        listString.add("c");
        for (int i = 0; i < listString.getSize(); i++) {
            System.out.println(listString.get(0));
        }
    }
}
