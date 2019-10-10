public class Main {

    public static void main(String[] args) throws InterruptedException{
        for (int i = 1; i <6 ; i++) {
            Runner runner=new Runner();
            runner.start();
            runner.join();
            break;
        }
    }
}
