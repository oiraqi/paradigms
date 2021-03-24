package ma.aui.sse.paradigms.performance.fx.server;

import java.net.*;

public class FxServer {

	public static void main(String[] args) throws Exception {

		try (ServerSocket ss = new ServerSocket(80)) {
			while (true) {
				Socket connectionFromClient = ss.accept();
				new FxServerThread(connectionFromClient);
			}
		}
	}
}
