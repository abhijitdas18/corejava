package general.designPattern.factory;

public class DoubleTon {
	private static DoubleTon inst1 = null;
	private static DoubleTon inst2 = null;

	private DoubleTon() {
	}

	public DoubleTon getInstance() {
		if (inst1 == null) {
			inst1 = new DoubleTon();
			return inst1;

		} else if (inst2 == null) {
			inst2 = new DoubleTon();
			return inst2;
		} else {

			if ((Math.random() > 0.5)) {
				return inst1;
			} else {
				return inst2;
			}
		}

	}

}
