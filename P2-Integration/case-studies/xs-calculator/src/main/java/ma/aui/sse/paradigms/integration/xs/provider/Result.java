package ma.aui.sse.paradigms.integration.xs.provider;

public class Result {

    private double sum;
    private double difference;
    private double product;
    private double ratio;

    public Result() {}

    public Result(double sum, double difference, double product, double ratio) {
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.ratio = ratio;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }

    public double getProduct() {
        return product;
    }

    public void setProduct(double product) {
        this.product = product;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

}