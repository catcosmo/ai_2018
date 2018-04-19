import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import lenz.htw.gawihs.Move;
import lenz.htw.gawihs.net.NetworkClient;

public class Client {
	// get image
	private static BufferedImage getImage() {
		BufferedImage pic = null;
		try {
			pic = ImageIO.read(new File("cat.png"));
		} catch (IOException ex) {
			System.out.println("Missing Image!");
			System.exit(1);
		};
		return pic;
	}

	public static void main(String[] args) {
		// connect to server
		NetworkClient client = new NetworkClient("localhost", "2", getImage());

		int playerNo = client.getMyPlayerNumber();
		int limit = client.getTimeLimitInSeconds();
		int latency = client.getExpectedNetworkLatencyInMilliseconds();

		while(true) {
			Move move = client.receiveMove();
			if (move == null) {
				//ich bin dran
				client.sendMove(new Move(1, 2, 3, 5));
			} else {
				//baue zug in meine spielfeldrepräsentation ein
			}
		}
	}

}