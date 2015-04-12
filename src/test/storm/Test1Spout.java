/**
 * 
 */
package test.storm;

import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

/**
 * @author gaojinming
 *
 */
public class Test1Spout extends BaseRichSpout {
    private static final long serialVersionUID = -2460047487439773601L;
	private SpoutOutputCollector collector;
	private TestData testData;

	@Override
	public void nextTuple() {
		collector.emit(new Values(testData.buildMapData()));

	}

	@Override
	public void open(Map arg0, TopologyContext arg1, SpoutOutputCollector c) {
		collector = c;
		testData = new TestData();

	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("word"));

	}

}
