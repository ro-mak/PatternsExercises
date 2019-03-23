import java.util.List;

public class ScreenPublisher implements ReportPublisher {
    @Override
    public void publish(List<ReportItem> reports) {
        System.out.println("Showing on screen");
        for(ReportItem item : reports){
            System.out.format("Screen %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
