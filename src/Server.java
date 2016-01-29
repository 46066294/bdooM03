/**
 * Created by 46066294p on 29/01/16.
 */
package dbServidor;

import java.util.Scanner;
import com.db4o.*;
import com.db4o.cs.Db4oClientServer;

public class Server {
    public static void main (String[] args) throws Exception {
        ObjectServer sv = Db4oClientServer.openServer(Db4oClientServer.newServerConfiguration(), "BDProva.db4o", 7000);
        // ObjectContainer db = Db4oEmbedded.openFile("BDOOClients.db4o");        //Accions amb la BDOO

        //sv.grantAccess("usuari", "contrasenya");
        Scanner in = new Scanner (System.in);
        System.out.println("Pitja [Q] per tancar el servidor.");
        while (in.hasNext()) {
            if ("Q".equalsIgnoreCase(in.next())) break;
        }
    }
}