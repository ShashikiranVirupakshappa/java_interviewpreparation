package java8collectorscoding;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONParser {
    public static void main(String[] args) throws IOException {
        String jsonString = """
                                 {
                                	"Items": [
                                		{
                                			"name": "A",
                                			"amount": 33,
                                			"price": "43"
                                		},
                                		{
                                			"name": "B",
                                			"amount": 43,
                                			"price": "2"
                                		},
                                		{
                                			"name": "C",
                                			"amount": 45,
                                			"price": "1"
                                		},
                                		{
                                			"name": "D",
                                			"amount": 543,
                                			"price": "55"
                                		}
                                	]
                                }
                                """;

        ObjectMapper objectMapper = new ObjectMapper();
        Parent parent = objectMapper.readValue(jsonString, Parent.class);
        System.out.println(parent);
        parent.getItems().stream().forEach(System.out::println);


        Parent parent1 = objectMapper.readValue(new File("Parent.json"), Parent.class);
        System.out.println(parent1);

        String name = "shashi";
        String textBlockName = """
                shashi""";

        System.out.println(name.equals(textBlockName));     //true
        System.out.println(name == textBlockName);           //true
    }
}