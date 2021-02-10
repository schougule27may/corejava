package garbagecollection;
class Table{
    synchronized void printTable(int n){
        System.out.println("printTable Started");
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("printTable Ended");
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

public class SyncProblem {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();
    }
}
