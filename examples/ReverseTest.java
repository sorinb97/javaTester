package tests;


import commons.Reverse;
import junit.framework.TestCase;

public class ReverseTest extends TestCase {

	private Reverse reverse;

	public ReverseTest(String name,Reverse reverse) {
		super(name);
		this.reverse = reverse;
	}

	public void testReverse() {
		assertEquals("cba", reverse.reverse("abc"));
	}

	public void testEmptyReverse() {
		assertEquals("", reverse.reverse(""));
	}

}
