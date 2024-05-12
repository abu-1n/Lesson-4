import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Card card = new Card();

        card.setNumber("8600");
        Future<String> response = executorService.submit(card);
        Thread.sleep(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("main " + i);
        }
        System.out.println(response.get());


//        Callable<String> check = () -> {
//            double amount = 50_000.0;
//            String cardNumber = "8600";
//            String password = "1234";
//            Thread.sleep(3000);
//            if (new Random().nextBoolean()) {
//                return "success!";
//            } else {
//                return "card not found";
//            }
//        };
//
//
//        Runnable runnable = () -> {
//            for (int i = 1; i <= 3; i++) {
//                System.out.println(TestThread.currentThread().getName() + "  " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//            }
//        };
//
//        executorService.submit(runnable);


//        List<Callable<String>> tasks = Arrays.asList(check,check,check,check,check);
//        List<Future<String>> futures = executorService.invokeAll(tasks);
//        for (Future<String> future : futures) {
//            System.out.println(future.get());
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i>7){
//                String response = checkFuture1.get();
//                System.out.println(response);
//            }
//            System.out.println("main "+i) ;
//        }


//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.execute(runnable);
//        executorService.shutdown();
//        if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
//            executorService.shutdownNow();
//        }
    }
}