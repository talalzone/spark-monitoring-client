package org.apache.spark.monitoring.client.util;

import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Talal Ahmed on 15/10/2017
 */
public class RestUtils {

    private static final Logger LOG = Logger.getLogger(RestUtils.class.getName());

    public static Optional<List<String>> unZip(ResponseBody body) {
        List<String> results = null;
        ZipInputStream zis = null;
        ZipEntry ze = null;

        try {
            results = new ArrayList<>();
            zis = new ZipInputStream(body.byteStream());
            ze = zis.getNextEntry();

            while (ze != null) {
                String fileName = ze.getName();
                LOG.fine("Unzipping log file: " + fileName);

                StringBuilder sb = new StringBuilder();
                int val;
                while ((val = zis.read()) > 0) {
                    sb.append(((char) val));
                }
                ze = zis.getNextEntry();
                results.add(sb.toString());
            }

            zis.closeEntry();
            zis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(results);
    }
}
