package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1() 
	{
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Two_roots() 
	{
		Roots.calculate_roots(2, 50,10);
		
		String  root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Equal_roots() 
	{
		Roots.calculate_roots(1,20,100);
		
		String  root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void No_roots() 
	{
		Roots.calculate_roots(1,1,100);
		
		String  root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Not_quadratic() 
	{
		Roots.calculate_roots(0,4,3);
		
		String  root_expected = Root_Types.Not_quadratic.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	}
