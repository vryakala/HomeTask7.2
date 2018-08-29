package homeTask7Point2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertingToJSON {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		// For testing
		POJOClass POJOClass = createDummy();

		try {
			// Convert object to JSON string and save into file directly
			mapper.writeValue(new File("E:\\File.json"), POJOClass);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(POJOClass);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(POJOClass);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static POJOClass createDummy() {

		POJOClass POJOClass = new POJOClass();

		POJOClass.setUserID(1);
		POJOClass.setID(1);
		POJOClass.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		POJOClass.setBody(
				"quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

		return POJOClass;

	}
}