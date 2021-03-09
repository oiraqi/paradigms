import java.net.*;
import java.io.*;
import java.util.StringTokenizer;

public class FxClient{
	public static void main(String[] args) throws Exception{
		String command = args[0];
		String fileName = args[1];

		Socket connectionToServer = new Socket("localhost", 80);

		// I/O operations

		InputStream in = connectionToServer.getInputStream();
		OutputStream out = connectionToServer.getOutputStream();

		BufferedReader headerReader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter headerWriter = new BufferedWriter(new OutputStreamWriter(out));
		DataInputStream dataIn = new DataInputStream(in);
		DataOutputStream dataOut = new DataOutputStream(out);

		if(command.equals("d")){
			String header = "download " + fileName + "\n";
			headerWriter.write(header, 0, header.length());
			headerWriter.flush();

			header = headerReader.readLine();

			if(header.equals("NOT FOUND")){
				System.out.println("We're extremely sorry, the file you specified is not available!");
			}else{
				StringTokenizer strk = new StringTokenizer(header, " ");

				String status = strk.nextToken();

				if(status.equals("OK")){

					String temp = strk.nextToken();

					int size = Integer.parseInt(temp);

					byte[] space = new byte[size];

					dataIn.readFully(space);

					FileOutputStream fileOut = new FileOutputStream("ClientShare/" + fileName);
					fileOut.write(space, 0, size);
					fileOut.close();

				}else{
					System.out.println("You're not connected to the right Server!");
				}

			}

		}else if(command.equals("u")){
			//To do
		}else{
			//To do
		}
		connectionToServer.close();
	}
}
