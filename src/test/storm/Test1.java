/**
 * 
 */
package test.storm;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;

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
		TopologyBuilder builder = new TopologyBuilder();
		builder.setSpout("spout", new Test1Spout());
		builder.setBolt("split", new Test1_1Bolt(), 8).shuffleGrouping("spout");

		Config conf = new Config();
		conf.setDebug(true);

		conf.setMaxTaskParallelism(3);

		LocalCluster cluster = new LocalCluster();
		cluster.submitTopology("test1", conf, builder.createTopology());

		Thread.sleep(10000);

		cluster.shutdown();
	}

}
