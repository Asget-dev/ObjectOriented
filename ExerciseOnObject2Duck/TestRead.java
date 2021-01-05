package ExerciseOnObject2Duck;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TestRead implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("out.data");
		FileInputStream input = new FileInputStream(f);
		ObjectInputStream objIn = new ObjectInputStream(input);

		// List<Duck> duck = new ArrayList<>();
		// Duck a = (Duck) objIn.readObject();

		System.out.println(objIn.readObject());

		objIn.close();

	}

}
