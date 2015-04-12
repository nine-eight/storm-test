/**
 * 
 */
package test.storm;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

/**
 * @author gaojinming
 *
 */
public class Test1_1Bolt extends BaseBasicBolt {
    private static final long serialVersionUID = -1073970289790859532L;

	@Override
	public void execute(Tuple tuple, BasicOutputCollector arg1) {
		System.out.println(tuple.getValue(0));

	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {

	}

}
