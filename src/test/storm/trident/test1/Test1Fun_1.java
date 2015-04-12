/**
 * 
 */
package test.storm.trident.test1;

import java.util.concurrent.atomic.AtomicLong;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;

/**
 * @author gaojinming
 *
 */
public class Test1Fun_1 extends BaseFunction {
    private static final long serialVersionUID = -253039037905419280L;
    private AtomicLong count = new AtomicLong(0);

	@Override
	public void execute(TridentTuple tuple, TridentCollector arg1) {
		System.out.println(tuple.getLong(0));
		System.out.println(count.addAndGet(tuple.getLong(0)));

	}

}
