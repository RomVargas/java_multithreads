package demo;

public class App {

    public static void main(String [] args){
        Runner run1 = new Runner();
        run1.run();

        Runner run2 = new Runner();
        run2.run();
    }
}

class Runner extends Thread {

    @Override
    public void run() {
       
       for(int i = 0; i<10;i++){
            System.out.println("vuelta " + i);
            try {
                // una decima de segundo
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
    }
    
}