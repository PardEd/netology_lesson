public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listIsDone = System.out::println;
        OnTaskErrorListener listError = System.out::println;

        Worker worker = new Worker(listIsDone, listError);
        worker.start();
    }

}
