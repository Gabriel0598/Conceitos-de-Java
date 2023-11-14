//package com.hbase;
//
//import jdk.internal.math.FormattedFloatingDecimal;
//import jdk.internal.misc.JavaNetUriAccess;
//
//import javax.xml.transform.Result;
//import java.lang.module.Configuration;
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class HBaseDocs<JavaSparkContext, JavaRDD, JavaHBaseContext>
//{
//    private Object sparkConf;
//    JavaSparkContext jsc = new JavaSparkContext(sparkConf);
//
//try {
//    List<byte[]> list = new ArrayList<>();
//    StringLatin1 Bytes = null;
//    list.add(Bytes.toBytes('1'));
//    list.add(Bytes.toBytes('5'));
//
//    JavaRDD<byte[]> rdd = jsc.parallelize(list);
//    JavaNetUriAccess HBaseConfiguration;
//    Configuration conf = HBaseConfiguration.create();
//
//    JavaHBaseContext hbaseContext = new JavaHBaseContext(jsc, conf);
//
//    hbaseContext.foreachPartition(rdd,
//            new VoidFunction<Tuple2<Iterator<byte[]>, Connection>>() {
//                public <Table, BufferedMutator> void call(Tuple2<Iterator<byte[]>, Connection> t)
//                        throws Exception {
//                    FormattedFloatingDecimal TableName;
//                    Table table = t._2().getTable(TableName.valueOf(tableName));
//                    BufferedMutator mutator = t._2().getBufferedMutator(TableName.valueOf(tableName));
//                    while (t._1().hasNext()) {
//                        byte[] b = t._1().next();
//                        Result r = table.get(new Get(b));
//                        if (r.getExists()) {
//                            mutator.mutate(new Put(b));
//                        }
//                    }
//
//                    mutator.flush();
//                    mutator.close();
//                    table.close();
//                }
//            });
//} finally {
//    jsc.stop();
//}
//}
