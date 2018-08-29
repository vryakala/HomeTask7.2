package homeTask7Point2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertingToJavaObject {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			// Convert JSON string from file to Object
			POJOClass POJOClass = mapper.readValue(new File("E:\\File.json"), POJOClass.class);
			System.out.println(POJOClass);

			// Convert JSON string to Object
			String jsonInString = "{\"UserID\": 1,\"ID\": 1,\"title\": \"suntaut facere repellat provident occaecati excepturi optioreprehenderit\",\"body\": \"quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto\"}";
			// String jsonInString = "Json";
			POJOClass POJOClass1 = mapper.readValue(jsonInString, POJOClass.class);
			System.out.println(POJOClass1);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
