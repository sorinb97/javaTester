package mypackage;

import commons.Reverse;

public class ReverseImpl implements Reverse {

	@Override
	public String reverse(String toReverse) {
		return new StringBuilder(toReverse).reverse().toString();
	}
	
}
