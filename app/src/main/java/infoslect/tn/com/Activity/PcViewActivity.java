package infoslect.tn.com.Activity;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import infoslect.tn.com.Adapter.PopularAdapter;
import infoslect.tn.com.R;
import infoslect.tn.com.domain.PopularDomain;

import java.util.ArrayList;
import java.util.List;

public class PcViewActivity extends AppCompatActivity {
    private RecyclerView offerRecyclerView, bestSellerRecyclerView, clothingRecyclerView, bestSellerRecyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_view); // Ensure this is the correct layout
        statusBarColor();

        // Initialize RecyclerViews
        // BestSeller RecyclerView
        bestSellerRecyclerView = findViewById(R.id.recycle1); // Corrected ID
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PopularDomain> bestSellerList = new ArrayList<>();
        bestSellerList.add(new PopularDomain("HP PRO G2 8éme Gén", "pc_item_1", 15, 4,  1299.000, "ref 0157:\n" +
                "PC HP PRO G2\n" +
                "Processeur I3-8100\n" +
                "Disque Dur 1000GO\n" +
                "Mémoire 4 GO\n" +
                "Ecran 20,7\" LED\n" +
                "FreeDos"));
        bestSellerList.add(new PopularDomain("HP PRO G2 MT-G5400", "pc_item_2", 10, 4.5, 1230.000, "REF : 0173\n" +
                "PC HP PRO G2\n" +
                "CPU Pentium G5400 4Mo\n" +
                "Disque Dur 1000GO\n" +
                "FreeDos\n" +
                "Mémoire 4 GO\n" +
                "Ecran 20,7\""));

        PopularAdapter bestSellerAdapter = new PopularAdapter(new ArrayList<>(bestSellerList));
        bestSellerRecyclerView.setAdapter(bestSellerAdapter);

        // Offer RecyclerView
        offerRecyclerView = findViewById(R.id.recycle3);
        offerRecyclerView.setHasFixedSize(true);
        offerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PopularDomain> offerList = new ArrayList<>();
        offerList.add(new PopularDomain("ALL IN ONE Lenovo V130", "pc_item_3", 3, 3.6, 990.000, "REF 0451\n" +
                "Ecran: 19.5s\" HD LED NON Tactile\n" +
                "Processeur Intel®Celeron\n" +
                "dual core J4005\n" +
                "Mémore 4Go\n" +
                "Disque Dur 1T\n" +
                "Avec wifi , Bluetooth"));
        offerList.add(new PopularDomain("PC DELL VOSTRO 3671", "pc_item_4", 4, 4,  1390.000, "REF: 0840/0150\n" +
                "Processeur intel Core i3-9100\n" +
                "Mémoire 4 GO\n" +
                "Disque Dur 1To\n" +
                "Freedos\n" +
                "ECRAN Dell 18.5"));
        PopularAdapter offerAdapter = new PopularAdapter(new ArrayList<>(offerList));
        offerRecyclerView.setAdapter(offerAdapter);



        // Clothing RecyclerView
        clothingRecyclerView = findViewById(R.id.recycle2); // Corrected ID
        clothingRecyclerView.setHasFixedSize(true);
        clothingRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PopularDomain> clothingList = new ArrayList<>();
        clothingList.add(new PopularDomain("pc all in one lenovo v130", "pc_item_5", 15, 4, 1090.000, "réf : 0716\n" +
                "-processeur Intel Pentium Silver J5040\n" +
                "-Mémoire : 4GO\n" +
                "-Disque Dur 1TO\n" +
                "-Ecran : 19.5\n" +
                "-couleur ; noir"));
        clothingList.add(new PopularDomain("Vostro 3888", "pc_item_6", 10, 4.5, 1600.000, "Réf : 0984\n" +
                "-PROCESSEUR INTEL® CORE™I3-10100\n" +
                "-MEMOIRE 4Go DDR4\n" +
                "-DISQUE DUR 1To\n" +
                "GRAPHIQUE INTEL UHD GRAPHICS 630\n" +
                "-COULEUR NOIR\n" +
                "-Windows 10 Pro"));

        PopularAdapter clothingAdapter = new PopularAdapter(new ArrayList<>(clothingList));
        clothingRecyclerView.setAdapter(clothingAdapter);

        // BestSeller RecyclerView 2
        bestSellerRecyclerView2 = findViewById(R.id.bestSeller2RecyclerView); // Corrected ID
        bestSellerRecyclerView2.setHasFixedSize(true);
        bestSellerRecyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<PopularDomain> bestSellerList2 = new ArrayList<>();
        bestSellerList2.add(new PopularDomain("HP PRO 300 G6", "pc_item_7", 20, 4.2, 1500.000, "Réf : 0783\n" +
                "–Processeur : Intel Pentium Dual Core G6400 4Go DDR4\n" +
                "–Mémoire : 4 Go\n" +
                "–Stockage : 1 To\n" +
                "-CARTE Graphique : Intel HD Graphics\n" +
                "-Système d'exploitation : FreeDOS\n" +
                "-Taille de l'écran : 20.7"));
        bestSellerList2.add(new PopularDomain("DELL OPTIPLEX", "pc_item_8", 5, 4.8,  2130.000, "Réf 11549\n" +
                "Processeur : 3080 I5\n" +
                "-Mémoire Ram : 4Go\n" +
                "-Disque Dur : 1 To\n" +
                "-Carte Graphique : Intel HD Graphics\n" +
                "-Systéme D'exploitation: FreeDOS"));
        PopularAdapter bestSellerAdapter2 = new PopularAdapter(new ArrayList<>(bestSellerList2));
        bestSellerRecyclerView2.setAdapter(bestSellerAdapter2);
    }

    private void statusBarColor() {
        Window window = PcViewActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(PcViewActivity.this, R.color.white));
    }
}
