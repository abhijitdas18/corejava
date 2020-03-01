package general.designPattern.decorator;

interface Dress
{
	public void assemble();
}


class BasicDress implements Dress
{
	@Override
	public void assemble()
	{
		System.out.println("This is basic dress features...");
	}
}


class DressDecorator implements Dress
{
	
	Dress dress;
	protected  DressDecorator(Dress d) {
        this.dress = d;
	}
	
	@Override
	public void assemble()
	{
		this.dress.assemble();
	}
}


class CasualDress extends DressDecorator
{
	public CasualDress(Dress d)
	{
		super(d);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding casual dress features.....");
		
	}
	
	
}


class SportyDress extends DressDecorator
{
	public SportyDress(Dress d)
	{
		super(d);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sporty dress features....");
	}
}

class FancyDress extends DressDecorator
{
	
	public FancyDress(Dress d)
	{
		super(d);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress features...");
	}
}

public class DecoratorPatternTest {

	public static void main(String[] args) {

		Dress dress =  new BasicDress();
		
		Dress sportyDress = new SportyDress(dress);
		sportyDress.assemble();
		System.out.println();
		
		Dress casualDress = new CasualDress(dress);
		casualDress.assemble();
		System.out.println();
		
		
		Dress fancyDress = new FancyDress(dress);
		fancyDress.assemble();
		System.out.println();
		
		////////////////////////////////////////////
		// combination dress type
		
		Dress fancyDress01 = new FancyDress(dress);
		Dress sportyFancyType = new SportyDress(fancyDress01);
		sportyFancyType.assemble();
		System.out.println();
		
		

	
	}

}
