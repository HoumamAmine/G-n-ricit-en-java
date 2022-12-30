package metier;

public class Produit {
    private long id;
    private String nom;
    private String marque,description;
    private double prix;
    private int nb_stock;

    public Produit(long id,String nom, String marque,String description,double prix,int nb_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nb_stock = nb_stock;
    }
    public Produit(){

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNb_stock() {
        return nb_stock;
    }

    public void setNb_stock(int nb_stock) {
        this.nb_stock = nb_stock;
    }
}
