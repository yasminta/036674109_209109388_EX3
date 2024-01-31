package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void Bva_a_min() 
	{
		Roots.calculate_roots(0, 2, 8);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void Bva_a_minPlus1() 
	{
		Roots.calculate_roots(1, 5,5);
		
		String  root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void Bva_a_nominal() 
	{
		Roots.calculate_roots(3,6,3);
		
		String  root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void Bva_a_maxMinus1() 
	{
		Roots.calculate_roots(49,5,34);
		
		String  root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void Bva_a_max() 
	{
		Roots.calculate_roots(50,-4,3);
		
		String  root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	}
