package dynastie.models;

public class CarolingienProg {
    public static void main(String[] args) {
        Dynastie dCaros = new Dynastie("Carolingiens");
        Homme pepin = new Homme("Pépin", "le Bref");
        ((Homme)(pepin.naitre(715))).epouser(new Femme("Berthe", "Aux grands pieds")).mourir(768);
        //pepin.naitre(715);
        //pepin.epouser(new Femme("Berthe", "Auw grands pieds"));
        //pepin.sacrer();
        dCaros.ajouter(pepin);
    } 
}
