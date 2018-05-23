package structural.pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Enumeration<String> {
	private Iterator<String> iter;
	public IteratorToEnumeration(Iterator<String> iter) {
		// TODO Auto-generated constructor stub
		this.iter=iter;
	}
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iter.hasNext();
	}
	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return iter.next();
	}
}
