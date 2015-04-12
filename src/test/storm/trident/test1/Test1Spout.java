/**
 * 
 */
package test.storm.trident.test1;

import java.util.Map;

import backtype.storm.task.TopologyContext;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import storm.trident.operation.TridentCollector;
import storm.trident.spout.IBatchSpout;
import test.storm.TestData;

/**
 * @author gaojinming
 *
 */
public class Test1Spout implements IBatchSpout {
	private static final long serialVersionUID = -3403735297882058737L;
	private TestData testData;
	private int c = 0;

	@Override
	public void ack(long arg0) {

	}

	@Override
	public void close() {

	}

	@Override
	public void emitBatch(long arg0, TridentCollector tc) {
		for (int i = 0; i < 100; i++) {
			if (c >= 3000) {
				return;
			}
			tc.emit(new Values(testData.buildMapData()));
			c++;
		}
	}

	@Override
	public Map getComponentConfiguration() {
		return null;
	}

	@Override
	public Fields getOutputFields() {
		return new Fields("event");
	}

	@Override
	public void open(Map arg0, TopologyContext arg1) {
		testData = new TestData();
	}

}
