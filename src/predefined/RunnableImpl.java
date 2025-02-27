package predefined;

public class RunnableImpl {
    public static void main(String[] args) {

        Runnable runnable= ()->{
          for(int i=0; i<5; i++){
              System.out.println("Current Thread "+Thread.currentThread().getName());
          }
        };
        new Thread(runnable).start();
    }
}
