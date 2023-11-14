package com.hbase;
//
//import org.apache.hadoop.hbase.*;
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.client.*;
//import org.apache.hadoop.hbase.util.Bytes;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class HBaseToCSV {
//
//    public static void main(String[] args) {
//        // Create a configuration object and set the HBase configuration
//        Configuration conf = HBaseConfiguration.create();
//        conf.set("hbase.zookeeper.quorum", "localhost");
//
//        try {
//            // Create your HBase client and table objects
//            Connection connection = ConnectionFactory.createConnection(conf);
//            Table table = connection.getTable(TableName.valueOf("your_table_name"));
//
//            // Create a scan object to define the query constraints
//            Scan scan = new Scan();
//            // Add any filtering options, if required
//            // scan.setFilter(filter);
//
//            // Open a file writer to write the CSV output
//            FileWriter writer = new FileWriter("output.csv");
//
//            // Write the header row to the CSV file
//            writer.append("Column1,Column2,Column3");
//            writer.append("\n");
//
//            // Execute the scan and retrieve the result scanner
//            ResultScanner scanner = table.getScanner(scan);
//
//            // Iterate through the scanner results and write to the CSV file
//            for (Result result : scanner) {
//                // Extract the required values from the result
//                String column1 = Bytes.toString(result.getValue(Bytes.toBytes("your_column_family"), Bytes.toBytes("column1")));
//                String column2 = Bytes.toString(result.getValue(Bytes.toBytes("your_column_family"), Bytes.toBytes("column2")));
//                String column3 = Bytes.toString(result.getValue(Bytes.toBytes("your_column_family"), Bytes.toBytes("column3")));
//
//                // Write the values to the CSV file
//                writer.append(column1);
//                writer.append(",");
//                writer.append(column2);
//                writer.append(",");
//                writer.append(column3);
//                writer.append("\n");
//            }
//
//            // Close the writer, scanner, table, and connection
//            writer.flush();
//            writer.close();
//            scanner.close();
//            table.close();
//            connection.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
