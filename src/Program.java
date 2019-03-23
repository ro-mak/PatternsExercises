public class Program {
    public static void main(String[] args){
        ReportPublisher printPublisher = new PrintReport();
        ReportPublisher filePublisher = new FilePublisher();
        ReportPublisher screenPublisher = new ScreenPublisher();
        Report report = new Report();
        report.calculate();
        report.output(printPublisher);
        report.output(filePublisher);
        report.output(screenPublisher);
    }
}
