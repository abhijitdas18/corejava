package general;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.lang.Thread;
public final class ImmutableClass {
	
	private final Integer immutableField1;
	private final  String immutableField2;
	private final Date mutuableField;
	
	//private constructor
	private ImmutableClass(Integer immutableField1, String immutableField2, Date mutuableField) {
		this.immutableField1 = immutableField1;
		this.immutableField2 = immutableField2;
		this.mutuableField = new Date (mutuableField.getTime());
	}
	
	public static ImmutableClass getInstance(Integer f1, String f2, Date f3)
	{
		 return new ImmutableClass(f1, f2, f3);
	}

	public Integer getImmutableField1() {
		return immutableField1;
	}

	public String getImmutableField2() {
		return immutableField2;
	}

	public Date getMutuableField() {
		return mutuableField;
	}
	
	public String toString() {
		return immutableField1 + "<->" + immutableField2 + "<->" + mutuableField;
	}

}


