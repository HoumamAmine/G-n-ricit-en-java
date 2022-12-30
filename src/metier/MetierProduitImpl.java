package metier;

import java.util.List;
import java.util.ArrayList;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produits = new ArrayList<>();


    @Override
    public void add(Produit o) {
        Produit P=new Produit();
        for (Produit p:produits ){
            if(p.getId()==o.getId()){
                System.err.println("produit deja exist");
                P=p;
            }
        }
        if(P.getId()==o.getId()){
            System.err.println("chercher une autre id ");
        }

        else produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return this.produits;
    }

    @Override
    public Produit findById(long id) {
            Produit P=new Produit();
            for (Produit p:produits ){
                if(p.getId()==id){
                    P=p;
                }
            }
            return P;
    }

    @Override
    public void delete(long id) {
        Produit p = new Produit();
        for (Produit produit : produits){
            if (produit.getId()==id);
            p=produit;
        }
           produits.remove(p);
    }
}
