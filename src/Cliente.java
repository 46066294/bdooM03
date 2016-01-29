/**
 * Created by 46066294p on 29/01/16.
 */
import java.util.*;
public class Cliente {
    private String nom;
    private String aPostal;
    private String aElectronica;
    private String telefon;
    private List<Encarrec> liComandes = new LinkedList<Encarrec>();
    public Cliente(String n, String ap, String ae, String t) {
        nom = n;
        aPostal = ap;
        aElectronica = ae;
        telefon = t;
    }
    public String getNom() {
        return nom;
    }
    public String getAPostal() {
        return aPostal;
    }
    public String getAElectronica() {
        return aElectronica;
    }
    public void setAElectronica(String ae) {
        aElectronica = ae;
    }
    public String getTelefon() {
        return telefon;
    }
    public int getNreComandes() {
        return liComandes.size();
    }
    public void addComanda(Encarrec e) {
        liComandes.add(e);
    }
    public List<Encarrec> getComandes() {
        return liComandes;
    }
    @Override
    public String toString() {
        String res = nom + " : " + aPostal + " : (" + aElectronica + ", " + telefon + ")\n";
        Iterator<Encarrec> it = liComandes.iterator();
        while (it.hasNext()) {
            Encarrec e = it.next();
            res += e.toString() + "\n";
        }
        return res;
    }
}
