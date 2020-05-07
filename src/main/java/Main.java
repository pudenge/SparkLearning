import org.apache.spark.SparkConf;

public class Main {
    public static void main(String[] args) {

        String hdfsPath = args[0];
        String tableName = args[1];
        SparkConf sparkConf =new SparkConf().setAppName("josn2hive");
    }
}
