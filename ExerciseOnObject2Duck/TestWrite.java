package ExerciseOnObject2Duck;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestWrite implements Serializable {

	public static void main(String[] args) throws IOException {
		File f = new File("out.data");
		FileOutputStream output = new FileOutputStream(f);
		ObjectOutputStream objOut = new ObjectOutputStream(output);

		List<Duck> duck = new ArrayList<>();
		MallardDuck md1 = new MallardDuck("River");
		MallardDuck md2 = new MallardDuck("Pond");

		DecoyDuck dc1 = new DecoyDuck("Backyard");
		DecoyDuck dc2 = new DecoyDuck("Bayon");

		duck.add(md1);
		duck.add(md2);
		duck.add(dc1);
		duck.add(dc2);

		objOut.writeObject(duck);

		objOut.close();
	}

}
