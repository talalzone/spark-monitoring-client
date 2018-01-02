package org.apache.spark.monitoring.client.sample;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * Created by arsalan on 03/11/2017
 */
public class WordCount {

    private static final Logger LOG = Logger.getLogger(WordCount.class.getName());

    private SparkConf conf;
    private JavaSparkContext sc;
    private String appId;

    public String getAppId() {
        return appId;
    }

    public void setup(String logsPath) {
        conf = new SparkConf()
                .setAppName("SparkPi")
                .setMaster("local[4]")
                .set("spark.hadoop.validateOutputSpecs", "false")
                .set("spark.eventLog.enabled", "true")
                .set("spark.eventLog.dir", logsPath)
                .set("spark.history.fs.logDirectory", logsPath);

        sc = new JavaSparkContext(conf);
        appId = sc.getConf().getAppId();
    }

    public void run() {
        final Pattern SPACE = Pattern.compile(" ");

        JavaRDD<String> lines = sc.textFile(WordCount.class.getResource("textfile").toString());
        JavaRDD<String> words = lines.flatMap(s -> Arrays.asList(SPACE.split(s)).iterator());
        JavaPairRDD<String, Integer> ones = words.mapToPair(s -> new Tuple2<>(s, 1));
        JavaPairRDD<String, Integer> counts = ones.reduceByKey((i1, i2) -> i1 + i2);

        List<Tuple2<String, Integer>> output = counts.collect();
        for (Tuple2<?, ?> tuple : output) {
            LOG.info(tuple._1() + ": " + tuple._2());
        }

        counts.saveAsTextFile("output/results_file");
        sc.stop();
    }
}
