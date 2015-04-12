/**
 * 
 */
package test.storm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaojinming
 *
 */
public class TestData {

	public synchronized Map<String, Object> buildMapData() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ALERTLEVELID", 2);
		data.put("ENDTIME", 1365471713108l);
		data.put("EUID", 34);
		data.put("EUIDCODE", "20151-20153-704938-");
		data.put("EVENTCONTENT", "用户luobo使用从帐号rd1通过客户端192.168.10.196在资源192.168.99.62上进行了文件put操作");
		data.put("F_1", "192.168.11.62");
		data.put("F_12", "192.168.99.62");
		data.put("F_140", "276724");
		data.put("F_141", "/rd1/a.sql");
		data.put("F_16", "192.168.10.196");
		data.put("F_4", "gaojinming");
		data.put("F_5", "rd1");
		data.put("F_50", "ftp");
		data.put("F_6", "85305184294296951");
		data.put("F_7", "put");
		data.put("HOSTID", 0);
		data.put("OCCURCOUNT", 1);
		data.put("SENDHOSTIP", "192.168.11.62");
		data.put("STARTTIME", 1381464355234l);
		data.put("STDEVENTID", 893852);
		data.put("STDEVENTKMID", 704938);
		data.put("TIMEID", 2013040909);
		data.put("VALIDFLAG", 1);
		data.put("INSERTTIME", 1435735821333l);
		data.put("F_458", "123");
		data.put("F_459", 456);

		return data;
	}
}
