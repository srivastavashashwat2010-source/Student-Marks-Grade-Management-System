public class ReportThread extends Thread {

    private Result result;

    
    public ReportThread(Result result) {
        this.result = result;
    }

    
    @Override
    public void run() {

        System.out.println("\n================================");
        System.out.println("Generating Student Report...");
        System.out.println("Report Thread Started");
        System.out.println("================================");

        try {

            Thread.sleep(2000);

            result.displayResult();

            System.out.println("\nReport generation completed.");

        }
        catch (InterruptedException e) {

            System.out.println(
                    "Report generation interrupted."
            );
        }
    }
}