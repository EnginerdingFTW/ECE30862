
import java.awt.*;

public class Main {

	public static void main(String[] args)
	{
		FullScreenFrame fullFrame = new FullScreenFrame();
		TestKeyListener test = new TestKeyListener();
		fullFrame.add(test);
	}
}
