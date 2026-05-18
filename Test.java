
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Test{

public static void main(String[] args) {
        String s="keeekeeksorgeek";
        hh(s);
        System.out.println(s);
    }

    public static  void hh(String d){

        ExecutorService executor = Executors.newFixedThreadPool(10);
        CompletableFuture<Integer> future =
        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return 10;
        }, executor);

        d="eee";
        System.out.println(d);
    }
    
}