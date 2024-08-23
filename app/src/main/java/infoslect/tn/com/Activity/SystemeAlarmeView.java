package infoslect.tn.com.Activity;

import android.os.Bundle;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import infoslect.tn.com.Adapter.PopularAdapter;
import infoslect.tn.com.R;
import infoslect.tn.com.domain.PopularDomain;

public class SystemeAlarmeView extends AppCompatActivity {
    private RecyclerView recycle1, recycle2, recycle3, recycle4,recycle5,recycle6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_systeme_alarme_view);
        statusBarColor();
        // Initialize RecyclerViews with different products
        recycle1 = findViewById(R.id.recycle1);
        recycle1.setHasFixedSize(true);
        recycle1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle1, getProductsForRecycle1());

        recycle2 = findViewById(R.id.recycle2);
        recycle2.setHasFixedSize(true);
        recycle2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle2, getProductsForRecycle2());

        recycle3 = findViewById(R.id.recycle3);
        recycle3.setHasFixedSize(true);
        recycle3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle3, getProductsForRecycle3());

        recycle4 = findViewById(R.id.recycle4);
        recycle4.setHasFixedSize(true);
        recycle4.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle4, getProductsForRecycle4());

        recycle5 = findViewById(R.id.recycle5);
        recycle5.setHasFixedSize(true);
        recycle5.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle5, getProductsForRecycle5());

        recycle6 = findViewById(R.id.recycle6);
        recycle6.setHasFixedSize(true);
        recycle6.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle6, getProductsForRecycle6());
    }
    private void setAdapterForRecyclerView(RecyclerView recyclerView, List<PopularDomain> data) {
        PopularAdapter adapter = new PopularAdapter((ArrayList<PopularDomain>) data);
        recyclerView.setAdapter(adapter);
    }

    private List<PopularDomain> getProductsForRecycle1() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Systeme alarme ELKRON ", "alarme1", 8, 4.2, 990.00, "Prix d'installation et câblage selon l'étude\n" +
                "\n" +
                "Centrale d'alarme 4 Zones MP106 TGV\n" +
                "Clavier de Commande LCD\n" +
                "Sirène extérieure\n" +
                "2 Détecteur infrarouge passif : IRA14\n" +
                "2 Support detecteur SPA10\n" +
                "2 Battries\n" +
                "Contact d'ouverture de porte saillie en plastique BLANC"));
        list.add(new PopularDomain("Systeme alarme ELKRON ", "alarme2", 11, 4.1, 1190.00, "Systeme alarme filaire ELKRON avec Telecommande\n" +
                "Prix d'installation et câblage selon l'étude\n" +
                "\n" +
                "Centrale d'alarme 4 Zones MP106 TGV\n" +
                "Clavier de Commande LCD\n" +
                "Sirène extérieure\n" +
                "2 Détecteur infrarouge passif : IRA14\n" +
                "2 Support detecteur SPA10\n" +
                "2 Battries\n" +
                "Contact d'ouverture de porte saillie en plastique BLANC\n" +
                "Recepteur à 1 canal\n" +
                "2 telecommande"));

        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle2() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Centrale d'alarme 4 Zones MP106", "alarme3", 5, 3.3, 585, "ref:3633\n" +
                "Centrale d'alarme 4 Zones MP106 TGV.\n" +
                "R: MP6K00111.\n" +
                "extensible à 32 (ajout de cartes EP100)\n" +
                "avec transmetteur vocale pour six numéros"));
        list.add(new PopularDomain("Clavier de Commande LCD", "alarme4", 18, 3.8, 425.00, "Ref: 3634\n" +
                "Clavier de Commande LCD : KP 100D.\n" +
                "R: KP2200211.\n" +
                "Clavier LCD rétro éclairé 1 ligne, X 16 caractères avec deux entrées d'alarmes supplémentaires"));
        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle3() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Détecteur infrarouge passif:IRA14", "alarme5", 7, 3.7, 84.960, "+ Socle De fixation\n" +
                "\n" +
                "Ref: 3638\n" +
                "Détecteur infrarouge passif : IRA14 .\n" +
                "R: IR7B00211.\n" +
                "Portée 15m- 23 zones sur 5 plans.\n" +
                "Lentille sphérique multifonctions: . volumétrique, rideau et longue portée\n" +
                "Creep- zone\n" +
                "Angle de couverture 90°\n" +
                "Approuvé NFA2P"));
        list.add(new PopularDomain("Batteries", "alarme6", 10, 3.7, 71, "ref:3636\n" +
                "Batteries 12V-2,3Ah ; RB19\n" +
                "R: RB0310113"));

        // Ajouter d'autres produits
        return list;
    }
    private List<PopularDomain> getProductsForRecycle4() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Contact d'ouverture", "alarme7", 7, 3.6, 8, "Contact d'ouverture de porte saillie en plastique BLANC"));
        list.add(new PopularDomain("Recepteur à 1 canal", "alarme8", 10, 3.7, 185, "\n" +
                "Recepteur à 1 canal\n" +
                "fréquence 433,92Mhz\n" +
                "WALLY 1C. R: 11G003\n" +
                "+\n" +
                "Telecommande 2 fonction Phenix. R: 10U005"));

        // Add more products
        return list;
    }

    private List<PopularDomain> getProductsForRecycle5() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Kit alarme Sans fil Fasten RTC", "alarme9", 18, 4.6, 826, "REF : 0901\n" +
                "KIT ALARME SANS FIL FASTEN RTC Kit d'alarme sans fil 6 zones plus temper zone Transmission vocale pour 6 numéros téléphoniques, entrée carillon. Composé de: sirène intégré, radar infrarouge sans fil. Contact d'ouverture porte/ fenêtre et une télécommande."));
        list.add(new PopularDomain("Detecteur de fume sans intelligent", "alarme10", 10, 4.9, 75.00, "REF : 2585\n" +
                "Detecteur de fume sans intelligent SMK -527"));
        return list;
    }
    private List<PopularDomain> getProductsForRecycle6() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Detecteur de Gaz sans fil", "alarme11", 10, 4.5, 125, "REF : 2578\n" +
                "Detecteur de Gaz sans fil Gas -88 Code"));
        list.add(new PopularDomain("Systeme alarme filaire TELETEK", "alarme12", 15, 4.0, 1160, "Prix d'installation et câblage selon l'étude\n" +
                "\n" +
                "Centrale d'alarme 8 Zones programmables.\n" +
                "Clavier distant avec écran LCD.\n" +
                "2 Détecteurs de mouvement IR numérique .\n" +
                "Contact porte/fenêtre (plastique blanc).\n" +
                "Sirène Externe .\n" +
                "Batterie"));
        // Ajouter d'autres produits
        return list;
    }

    private void statusBarColor() {
        Window window = SystemeAlarmeView.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(SystemeAlarmeView.this, R.color.white));
    }
}