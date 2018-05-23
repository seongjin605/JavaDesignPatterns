package structural.pattern.decorator;

public class ChildDecorator extends Decorator {

	private Decorator decorator;
	
	public ChildDecorator(Decorator decorator) {
		this.decorator=decorator;
	}
	
	@Override
	public String getMerong() {
		// TODO Auto-generated method stub
		return "@"+decorator.getMerong()+"@";
	}
}
