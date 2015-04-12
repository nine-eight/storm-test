/**
 * 
 */
package test.storm.trident.test1;

import backtype.storm.tuple.Values;
import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;

/**
 * @author gaojinming
 *
 */
public class Test1Fun_0 extends BaseFunction {
    private static final long serialVersionUID = -4617230697475327031L;

	@Override
	public void execute(TridentTuple tuple, TridentCollector collector) {
		collector.emit(new Values(1));
	}

}
