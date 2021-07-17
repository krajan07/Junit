package packageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest 
{
	@Tag("production")
	@Test
	@DisplayName("testCaseB inside ClassBTest inside packageB")
	public void testCaseB() {
		
	}
}
