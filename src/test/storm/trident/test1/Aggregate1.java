/**
 * 
 */
package test.storm.trident.test1;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import storm.trident.operation.Aggregator;
import storm.trident.operation.TridentCollector;
import storm.trident.operation.TridentOperationContext;
import storm.trident.tuple.TridentTuple;
import backtype.storm.tuple.Values;

/**
 * @author gaojinming
 *
 */
public class Aggregate1 implements Aggregator<AtomicLong> {
	private static final long serialVersionUID = -8025399532434493888L;
	private int pIdx;

	@Override
	public void cleanup() {

	}

	@Override
	public void prepare(Map arg0, TridentOperationContext arg1) {
		pIdx = arg1.getPartitionIndex();
	}

	@Override
	public void aggregate(AtomicLong v, TridentTuple tuple, TridentCollector arg2) {
		v.incrementAndGet();
	}

	@Override
	public void complete(AtomicLong v, TridentCollector collector) {
		collector.emit(new Values(v.get()));
		System.out.println(pIdx + ":2222222222" + v.get());
	}

	@Override
	public AtomicLong init(Object arg0, TridentCollector collector) {
		System.out.println(pIdx + ":11111111111");
		return new AtomicLong(0);
	}

}
