package ArrayQuestions;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class Text {

    public static void main(String[] args){
       
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        System.out.println("Fixed Thread Pool:");

        for (int i = 1; i <= 5; i++){
            final int taskId = i;
            singleThreadPool.execute(()->{

                System.out.println("Fixed Thread Task" + taskId + "executed by Thread: "+
                    Thread.currentThread().getName()
                );
            });   
        }

    }
    
}