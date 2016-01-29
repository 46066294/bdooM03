import com.db4o.ObjectContainer;
import com.db4o.cs.Db4oClientServer;

/**
 * Created by 46066294p on 29/01/16.
 */


public class Client {
    public static void main (String[] args) throws Exception {
        ObjectContainer db = Db4oClientServer.openClient("localhost", 7000, "usuari","contrasenya");
        //ObjectContainer db = Db4oEmbedded.openFile("BDOOClients.db4o");        //Accions amb la BDOO

        //Accions amb la BDOO
        try {
            Cliente[] clients = {
                    new Cliente("Client1", "Adreça1", "e-mail1@domini.com", "+34931112233"),
                    new Cliente("Client2", "Adreça2", "e-mail2@domini.com", "+34932223344"),
                    new Cliente("Client3", "Adreça3", "e-mail3@domini.com", "+34931112233"),
                    new Cliente("Client4", "Adreça3", "e-mail4@domini.com", "+34931112233")
            };
            clients[2].addComanda(new Encarrec("Impressora",1));
            clients[2].addComanda(new Encarrec("Toner Impressora",4));
            clients[2].addComanda(new Encarrec("Paquest A4", 20));
            for(int i = 0; i < clients.length; i++) {
                db.store(clients[i]);
            }
        } finally {
            db.close();
        }
    }
}
