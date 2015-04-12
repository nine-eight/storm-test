/**
 * 
 */
package test.storm.trident.test1;

import storm.trident.TridentTopology;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.tuple.Fields;

/**
 * @author gaojinming
 *
 */
public class Test1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		TridentTopology topology = new TridentTopology();
		topology.newStream("spout-----1", new Test1Spout())
				.each(new Test1Fun_0(), new Fields("event1"))
		        .parallelismHint(3)
		        .partitionAggregate(new Fields("event"), new Aggregate1(), new Fields("count"))
		        .each(new Fields("count"), new Test1Fun_1(), new Fields("tt")).parallelismHint(1);

		LocalCluster cluster = new LocalCluster();
		Config conf = new Config();
		cluster.submitTopology("sum1", conf, topology.build());

		Thread.sleep(1000 * 10);
		cluster.shutdown();

	}

}
