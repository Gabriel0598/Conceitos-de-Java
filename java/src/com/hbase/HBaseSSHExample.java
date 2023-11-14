//package com.hbase;
//
//import com.jcraft.jsch.*;
//
//public class HBaseSSHExample {
//
//    public static void main(String[] args) {
//        String sshHostname = "your_ssh_hostname";
//        String sshUsername = "your_ssh_username";
//        String sshPassword = "your_ssh_password";
//        int sshPort = 22;
//
//        String hbaseHostname = "your_hbase_hostname";
//        int hbasePort = 2181;
//
//        try {
//            JSch jsch = new JSch();
//
//            // Establish SSH tunnel to HBase
//            JSchSession session = (JSchSession) jsch.getSession(sshUsername, sshHostname, sshPort);
//            session.setPassword(sshPassword);
//            session.setConfig("StrictHostKeyChecking", "no");
//            session.connect();
//
//            System.out.println("Connected to SSH");
//
//            // Set up SSH tunnel to HBase ZooKeeper
//            int localPort = session.setPortForwardingL(0, hbaseHostname, hbasePort);
//            System.out.println("SSH tunnel established to HBase ZooKeeper: localhost:" + localPort);
//
//            // Connect to HBase using the HBase Configuration
//            org.apache.hadoop.conf.Configuration conf = HBaseConfiguration.create();
//            conf.set("hbase.zookeeper.quorum", "localhost:" + localPort);
//            Connection connection = ConnectionFactory.createConnection(conf);
//
//            System.out.println("Connected to HBase");
//
//            // List the available tables
//            Admin admin = connection.getAdmin();
//            TableName[] tableNames = admin.listTableNames();
//
//            System.out.println("Tables in HBase:");
//            for (TableName tableName : tableNames) {
//                System.out.println(tableName.getNameAsString());
//            }
//
//            // Scan a specific table with a limit of 10 rows
//            String tableName = "your_table_name";
//            Table table = connection.getTable(TableName.valueOf(tableName));
//            Scan scan = new Scan().setLimit(10);
//            ResultScanner scanner = table.getScanner(scan);
//
//            System.out.println("Scanning table: " + tableName);
//            for (Result result : scanner) {
//                // Process the rows
//                System.out.println(result);
//            }
//
//            // Close the resources
//            scanner.close();
//            table.close();
//            admin.close();
//            connection.close();
//            session.disconnect();
//        } catch (JSchException | IOException | ServiceException e) {
//            e.printStackTrace();
//        }
//    }
//}
