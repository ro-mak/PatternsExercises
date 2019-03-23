import java.util.List;

public class PrintReport implements ReportPublisher {
    @Override
    public void publish(List<ReportItem> reports) {
        System.out.println("Output to printer");
        for(ReportItem item : reports){
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
