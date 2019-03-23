import java.util.List;

public class FilePublisher implements ReportPublisher {
    @Override
    public void publish(List<ReportItem> reports) {
        System.out.println("Save to file");
        for(ReportItem item : reports){
            System.out.format("File %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
