package pingali.jeevan;

import com.google.common.io.ByteStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String inputFilePath = "/home/jeevan/Downloads/apps_to_install.tar.gz";
        String outputFilePath = "/home/jeevan/tmp/test2";
        Main m = new Main();
        m.uncompressGzipFile(inputFilePath, outputFilePath);

    }

    public void uncompressGzipFile(String inputFilePath, String outputFilePath) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(inputFilePath);
             GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)) {

            ByteStreams.copy(gzipInputStream, fileOutputStream);
        }
    }

}