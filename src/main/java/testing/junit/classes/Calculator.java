package testing.junit.classes;

public class Calculator {

    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y) {return x - y;}

    public int divide(int x, int y){
        return x/y;
    }

    public int additionWithDelay(int x, int y) throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Yes still getting executed.");

        return x+y;

    }

}
