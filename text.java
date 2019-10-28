public class text {

        public static void main(String[] args) {

            MyThread[] threads = new MyThread[20];
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new MyThread();
            }

            for (int i = 0; i < threads.length; i++) {
                threads[i].start();
            }
        }
    }

    class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println(Singleton.getInstance());
        }
    }

