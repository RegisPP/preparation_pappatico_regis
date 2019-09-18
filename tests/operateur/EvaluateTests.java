package operateur;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import fr.aezi.evaluation.TestListParser;


public class EvaluateTests {
	@TestFactory
	public Collection<DynamicTest> generateClientTest() throws IOException{
		return TestListParser.getTestList("operateur.dat", true);
	}
	
	public static void main(String[] args) {
		try {
			new TestListParser(FileSystems.getDefault().getPath("operateur.dat"), true) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
