public class SingleThreadTest {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        //判断是否是同一个对象
        System.out.println(instance1 == instance2);
    }
}
