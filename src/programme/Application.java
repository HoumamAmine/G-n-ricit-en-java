package programme;

import metier.IMetier;
import metier.MetierProduitImpl;
import metier.Produit;
import java.util.Scanner;

    public class Application {
        public static void main(String[] args) {
            MetierProduitImpl metier = new MetierProduitImpl();
            int choice;
            do {
                String MENU = "\n"
                        + "1. Afficher la liste des produits.\n"
                        + "2. Chercher un produit par son id.\n"
                        + "3. Ajouter un nouveau produit dans la liste.\n"
                        + "4. Supprimer un produit par id.\n"
                        + "5. Quitter ce programme.\n";
                System.out.println(MENU);
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(metier.getAll());
                        break;

                    case 2:
                        System.out.println(" merci d'entrer l'id du produit que vous cherchez ");
                        Scanner sa = new Scanner(System.in);
                        long id1 = sa.nextLong();
                        System.out.println(metier.findById(id1));
                        break;

                    case 3:
                        System.out.println("entrer l'id du produit que vous Souhaitez ajouter à la liste");
                        Scanner sb = new Scanner(System.in);
                        long id_prod = sb.nextLong();
                        System.out.println("entrer le nom du produit que vous Souhaitez ajouter à la liste");
                        Scanner np = new Scanner(System.in);
                        String nom_prod = np.nextLine();

                        System.out.println("entrer la marque du produit que vous Souhaitez ajouter à la liste");
                        Scanner sd = new Scanner(System.in);
                        String marque_p = sd.nextLine();

                        System.out.println("entrer le prix du produit que vous Souhaitez ajouter à la liste");
                        Scanner se = new Scanner(System.in);
                        double prix_prod = se.nextDouble();

                        System.out.println("entrer la Description du produit que voudrais ajouter à la liste");
                        Scanner sf = new Scanner(System.in);
                        String descri_prod = sf.nextLine();

                        System.out.println("entrer le nombre_stock d du produit que vous Souhaitez ajouter à la liste");
                        Scanner sg = new Scanner(System.in);
                        int nbr_stock = sg.nextInt();
                        Produit p=new Produit(id_prod,nom_prod,marque_p,descri_prod,prix_prod,nbr_stock);
                        metier.add(p);
                        break;
                    case 4:
                        System.out.println("entrer l'id du produit que vous souhaitez Supprimer");
                        Scanner Sp = new Scanner(System.in);
                        long id3 = Sp.nextInt();
                        metier.delete(id3);
                        break;
                    case 5:
                        System.out.println("vous avez quiter l'application");
                        break;
                    default:
                        System.out.println("choix invalide");
                        break;

                }
            } while(choice!= 5);
        }

    }




