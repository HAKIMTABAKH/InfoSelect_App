package infoslect.tn.com.Activity;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import infoslect.tn.com.Adapter.PopularAdapter;
import infoslect.tn.com.R;
import infoslect.tn.com.domain.PopularDomain;

public class Logiciel_view extends AppCompatActivity {

    private RecyclerView offerRecyclerView, bestSellerRecyclerView, clothingRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logiciel_view); // Ensure this is the correct layout
        statusBarColor();

        // Initialize RecyclerViews
        initRecyclerViews();

        // Set up the data for each RecyclerView
        setUpBestSellerRecyclerView();
        setUpOfferRecyclerView();
        setUpClothingRecyclerView();
    }

    private void initRecyclerViews() {
        bestSellerRecyclerView = findViewById(R.id.recycle1); // Corrected ID
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        offerRecyclerView = findViewById(R.id.recycle3);
        offerRecyclerView.setHasFixedSize(true);
        offerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        clothingRecyclerView = findViewById(R.id.recycle2); // Corrected ID
        clothingRecyclerView.setHasFixedSize(true);
        clothingRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void setUpBestSellerRecyclerView() {
        List<PopularDomain> bestSellerList = new ArrayList<>();
        bestSellerList.add(new PopularDomain(
                "Logiciel Opticien CNAM", "item_log_1", 15, 4, 120,
                "Logiciel interface d'échange électronique\n" +
                        "entre opticien et C.N.A.M MONOPOSTE\n" +
                        "Il permet:\n" +
                        "- La gestion des bordereaux, des factures et des assurés.\n" +
                        "- La génération d'un fichier contenant toutes les données relatives aux assurés, et d'un état qui synthétise le contenu d'un bordereau."
        ));
        bestSellerList.add(new PopularDomain(
                "Logiciel Photographes", "item_log_2", 10, 4.5, 700,
                "Logiciel de gestion des photographes 1 poste\n" +
                        "- Les clients peuvent consulter et commander leurs photos\n" +
                        "- Le photographe peut charger les photos clients,\n" +
                        "les répartir suivant un thème, et prendre en charge les commandes clients\n" +
                        "- Statistiques des ventes"
        ));

        PopularAdapter bestSellerAdapter = new PopularAdapter((ArrayList<PopularDomain>) bestSellerList);
        bestSellerRecyclerView.setAdapter(bestSellerAdapter);
    }

    private void setUpOfferRecyclerView() {
        List<PopularDomain> offerList = new ArrayList<>();
        offerList.add(new PopularDomain(
                "Is-Caisse", "item_log_5", 15, 4, 350,
                "Logiciel de vente\n" +
                        "IS-Caisse\n" +
                        "Logiciel de point de vente :\n" +
                        "- Pâtisserie\n" +
                        "- Café\n" +
                        "- Café restaurant\n" +
                        "- Salon de thé\n" +
                        "- Magasin de vêtement\n" +
                        "- Magasin de chaussures\n" +
                        "- Parfumerie\n" +
                        "- Pièces détachées\n" +
                        "- Tout type de commerce de détail.\n" +
                        "Solution à installer sur un terminal, un PC de bureau ou un PC portable.\n" +
                        "Offre multiples fonctionnalités dont la gestion de caisse et des ventes (Prix, stock, code-barres, tickets clients, bon de livraison clients…)"
        ));



        PopularAdapter offerAdapter = new PopularAdapter((ArrayList<PopularDomain>) offerList);
        offerRecyclerView.setAdapter(offerAdapter);
    }

    private void setUpClothingRecyclerView() {
        List<PopularDomain> clothingList = new ArrayList<>();
        clothingList.add(new PopularDomain(
                "Pointage", "item_log_3", 8, 3.5, 150,
                "IS-POINTAGE\n" +
                        "Permet à vos salariés de pointer entrées et sorties d'une séance unique ou double.\n" +
                        "Ce système de pointage installé sur un PC équipé d'une web-cam vous permet de garantir le respect\n" +
                        "des exigences réglementaires en matière de temps de travail et le suivi précis des heures travaillées des salariés."
        ));
        clothingList.add(new PopularDomain(
                "Impression chèque", "item_log_4", 12, 3.6, 70,
                "Un logiciel qui permet de se simplifier la vie en vous\n" +
                        "permettant d'imprimer des chèques.\n" +
                        "Avec cet outil vous pourrez éditer simplement tous vos règlements en quelques clics\n" +
                        "de manière professionnelle."
        ));

        PopularAdapter clothingAdapter = new PopularAdapter((ArrayList<PopularDomain>) clothingList);
        clothingRecyclerView.setAdapter(clothingAdapter);
    }

    private void statusBarColor() {
        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.white));
    }
}
