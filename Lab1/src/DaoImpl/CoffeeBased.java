package DaoImpl;

import Dao.SizeFactor;

public class CoffeeBased implements SizeFactor {

	@Override
	public double sizeCost(String size) {
		//根据不同的size返回相应的价格
		if (size.toLowerCase().equals("small")) {
			return 0.4;
		} else if (size.toLowerCase().equals("medium")) {
			return 0.7;
		} else if (size.toLowerCase().equals("large")){
			return 1.0;
		} else {   //new size GRANT
			return 1.3;
		}
	}

}
