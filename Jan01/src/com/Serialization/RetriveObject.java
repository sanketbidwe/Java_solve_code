package com.Serialization;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class RetriveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		var fis = new FileInputStream("C:\\Users\\HP\\Pictures\\Resume_Folde\\Student\\Student.txt");
		var ois = new ObjectInputStream(fis);
		try (fis;ois){
			List<Student> list = (List<Student>)ois.readObject();
			list.forEach(System.out::println);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
