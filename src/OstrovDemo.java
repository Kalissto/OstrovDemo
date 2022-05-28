
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class OstrovDemo extends CellCletka {


    public static void main(String[] args) {

        CellCletka.randomZapolneniePolyaObectami();

        while (Step<15) {
            ExecutorService executorService = Executors.newCachedThreadPool();
            Step++;


            primenenieMetodovZivotnixKlistam();
            // metodDvizenie();
            System.out.println(Arrays.deepToString(Animal.objects) + "сделали шаг смотрим");//вывод содержимого двумерного мас

            Runnable runnable = () -> {
                statistic();
            };


            executorService.submit(runnable);
            Runnable runnable1 = () -> {
                rostTravi();
            };
            if ((Step%2)==0) {
                executorService.submit(runnable1);
            }
            executorService.shutdown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            proverkaOstanovki();

        }
    }
}