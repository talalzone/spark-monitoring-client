package org.apache.spark.history.client.sample;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * Created by arsalan on 03/11/2017
 */
public class SparkPi {

    private static final Logger LOG = Logger.getLogger(SparkPi.class.getName());

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
        int slices = 2;
        int n = 100000 * slices;
        List<Integer> l = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        JavaRDD<Integer> dataSet = sc.parallelize(l, slices);

        int count = dataSet.map(integer -> {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            return (x * x + y * y <= 1) ? 1 : 0;
        }).reduce((integer, integer2) -> integer + integer2);

        LOG.info("Pi is roughly " + 4.0 * count / n);

        sc.stop();
    }
}
