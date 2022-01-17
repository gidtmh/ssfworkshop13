package sg.nus.edu.workshop13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop13Application 
{
	public static void main(String[]args){
	try
	{
		Path p = Paths.get("opt");
		if(Files.exists(p)){
			System.out.println("File already exists");
		}
		else 
		{
			Path donePath = Files.createDirectories(p);
			System.out.println("Directory created at" +donePath.toString());
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}


