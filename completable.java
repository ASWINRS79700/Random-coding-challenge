import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
 class completable {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        List<CompletableFuture>futureList=new ArrayList();
        for(int i=0;i<13;i++){
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate long computation
            try { Thread.sleep(5000);
                System.err.println( Thread.currentThread().getName());
            } catch (InterruptedException e) {}
            return 42;
        
        }, executor);
        futureList.add(future);
        }
       
        // Attach a callback that runs when the result is ready
        // futureList.thenAccept(result -> {
        //     System.out.println("Computation finished! Result = " + result);
        // });
        // for(CompletableFuture cf:futureList){
        //     try {
        //         System.err.println( Thread.currentThread().getName()+cf.get());
        //     } catch (ExecutionException ex) {

        //     }
        // }
        System.out.println("Main thread is free to do other work...");

        // Don't block main, but keep program alive long enough to see result
        Thread.sleep(3000);
        executor.shutdown();
    }
}
