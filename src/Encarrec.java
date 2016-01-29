/**
 * Created by 46066294p on 29/01/16.
 */
import java.util.Date;

public class Encarrec {
    private String nomProducte;
    private int quantitat;
    private Date data;

    public Encarrec(String n, int q) {
        nomProducte = n;
        quantitat = q;
        data = new Date();
    }
    public String getNom() {
        return nomProducte;
    }
    public int getQuantitat() {
        return quantitat;
    }
    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return getData()+ " - " + getNom() + " (" + getQuantitat() + ")";
    }
}
