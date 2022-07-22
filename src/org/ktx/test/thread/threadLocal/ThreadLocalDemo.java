package org.ktx.test.thread.threadLocal;

/**
 * @ClassName ThreadLocalDemo
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-13 9:05
 * @Version 1.0
 */
public class ThreadLocalDemo {
    private static ThreadLocal<String> localVar = new ThreadLocal<>();
    static void print(String str){
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocalDemo.localVar.set("local_A");
                print("A");
                //打印本地变量
                System.out.println("after remove : " + localVar.get());

            }
        });
        thread.start();
        Thread.sleep(1000);

        new Thread(new Runnable() {
            public void run() {
                ThreadLocalDemo.localVar.set("local_B");
                print("B");
                System.out.println("after remove : " + localVar.get());

            }
        },"B").start();


    }
}
