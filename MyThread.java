public class MyThread extends Thread {
    //    public void run() {
//
//        System.out.println(currentThread());
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        MyThread t1= new MyThread();
//        t1.start();
//                 Thread.yield();
//              for(int j=0;j<=5;j++){
//                  System.out.println("success");
//              }
//
//    }
//    public static Thread u;
//
//    public void run() {
//
//        for (int i = 0; i <= 5; i++) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("one");
//                System.out.println("not manin");
//            } catch (InterruptedException obj) {
//                System.out.println(obj.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread obj = new MyThread();
//        u = Thread.currentThread();
//        obj.start();
//
//        //try {
//            //   obj.join();}catch(InterruptedException o){o.getStackTrace();}
//            for (int j = 0; j <= 5; j++) {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("two");
//                    System.out.println("hello");
//                }
//                catch (InterruptedException o) {
//                    o.getStackTrace();
//
//                }
//            }
//        }
public void run(){
  //  System.out.println(Thread.interrupted());
    System.out.println(currentThread().isInterrupted());
        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

}

    public static void main(String[] args) {
        MyThread obj= new MyThread();
       obj.start();
         obj.interrupt();

}



        }
