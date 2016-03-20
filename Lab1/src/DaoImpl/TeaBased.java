package DaoImpl;

import Dao.SizeFactor;

public class TeaBased implements SizeFactor {

	@Override
	public double sizeCost(String size) {
		//根据size返回相应的价格
		if (size.toLowerCase().equals("small")) {
			return 0.2;
		} else if (size.toLowerCase().equals("medium")) {
			return 0.5;
		} else if (size.toLowerCase().equals("large")) {
			return 0.7;
		} else {	//new size GRANT
			return 0.9;
		}
	}

}
