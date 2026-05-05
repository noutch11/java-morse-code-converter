//written by Brian Noutchang

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MorseCodeTreeTest {
	MorseCodeTree tree;
	
	@Before
	public void setUp() throws Exception {
		tree = new MorseCodeTree ();
	}

	@After
	public void tearDown() throws Exception {
		tree = null;
	}

	@Test
	public void testFetch() {
		assertEquals ("i", tree.fetch(".."));
		assertEquals ("w", tree.fetch(".--"));
		assertEquals ("f", tree.fetch("..-."));
	}

	@Test
	public void testToArrayList() {
		assertEquals("h", tree.toArrayList().get(0));
		assertEquals("o", tree.toArrayList().get(26));
	}

}
