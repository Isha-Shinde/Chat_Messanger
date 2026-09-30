
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class ChatClient {

    public static void main(String A[]) throws Exception {

        System.out.println("Client Application is running...");

        Socket sobj = new Socket("localhost", 2100);

        System.out.println("connection is successfull with server");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-----------------------------------------------");
        System.out.println("-----------Marvellous Chat Client--------------");
        System.out.println("-----------------------------------------------");

        String str1 = null, str2 = null;

        System.out.println("Enter msg for server:");

        while (!(str1 = bobj2.readLine()).equals("end")) {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says :" + str2);

            System.out.println("Enter msg for server:");

        }

        sobj.close();

    }
}
