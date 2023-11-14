//package com.hbase;
//import ch.ethz.ssh2.Connection;
//import ch.ethz.ssh2.LocalPortForwarder;
//import java.io.IOException;
//import java.net.InetSocketAddress;
//
//
//    public class HBaseConnectionDefault {
//
//        public static void main(String[] args) {
//            String sshHostname = "your_ssh_hostname";
//            String sshUsername = "your_ssh_username";
//            String sshPassword = "your_ssh_password";
//            int sshPort = 22;
//
//            String hbaseHostname = "your_hbase_hostname";
//            int hbasePort = 2181;
//            int localPort = 0; // Will be dynamically assigned
//
//            try {
//                // Establish SSH connection to the SSH server
//                Connection connection = new Connection(sshHostname, sshPort);
//                connection.connect();
//                boolean isAuthenticated = connection.authenticateWithPassword(sshUsername, sshPassword);
//                if (!isAuthenticated) {
//                    throw new IOException("Failed to authenticate SSH connection.");
//                }
//
//                System.out.println("Connected to SSH");
//
//                // Set up local port forwarding to HBase ZooKeeper
//                LocalPortForwarder forwarder = connection.createLocalPortForwarder(localPort, hbaseHostname, hbasePort);
//
//                InetSocketAddress localSocketAddress = forwarder.getLocalSocketAddress();
//                localPort = localSocketAddress.getPort();
//                System.out.println("SSH tunnel established to HBase ZooKeeper: localhost:" + localPort);
//
//                // Connect to HBase using the HBase Configuration
//                org.apache.hadoop.conf.Configuration conf = HBaseConfiguration.create();
//                conf.set("hbase.zookeeper.quorum", "localhost:" + localPort);
//                Connection hbaseConnection = ConnectionFactory.createConnection(conf);
//
//                System.out.println("Connected to HBase");
//
//                // REST OF YOUR HBASE CODE HERE
//
//                // Close the resources
//                hbaseConnection.close();
//                forwarder.close();
//                connection.close();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
