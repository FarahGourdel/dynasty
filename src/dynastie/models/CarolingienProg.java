package dynastie.models;

public class CarolingienProg {
    public static void main(String[] args) {
        Region fr = new Region("France");
        Dynastie dCaros = new Dynastie("Carolingiens");
        Suzerain pepin = new Suzerain("Pépin", "le Bref");
        dCaros.ajouter(pepin);
        pepin.naitre(715);
        pepin.epouser(new Femme("Berthe", "Aux grands pieds"));
        pepin.sacrer("Roi", 751, fr);
        pepin.mourir(768);
    }
}
