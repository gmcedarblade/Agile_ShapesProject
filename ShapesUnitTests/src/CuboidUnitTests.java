import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Dialog;
import edu.cvtc.shapes.MessageBox;

public class CuboidUnitTests {

	@Test
	public void test() {
		Dialog messageBox = new MessageBoxSub();
		Cuboid cube = new Cuboid(12, 13, 18, messageBox);
		
		cube.render();
		
		
	}

}
