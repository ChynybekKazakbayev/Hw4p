
public class Runner extends Thread {

    public void run(){
            try {
                for (int i = 1; i <5;) {
                    System.out.println("Runner " + i + " берет палочку");
                    System.out.println("Runner " + i + " бежит к Runner " + ++i);
                    sleep(3000);
                }
                for (int i = 5; i >1;) {
                    System.out.println("Runner " + i + " берет палочку ");
                    System.out.println("Runner " + i + " бежит к Runner " + --i);
                    sleep(3000);
                }
                System.out.println("Runner 1 берет палочку");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

