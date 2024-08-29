package infoslect.tn.com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import infoslect.tn.com.Adapter.PopularAdapter;
import infoslect.tn.com.R;
import infoslect.tn.com.databinding.ActivityMainBinding;
import infoslect.tn.com.domain.PopularDomain;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    LinearLayout voirToutIcon,pcIconBtn,LogicielIconBtn,AccessoireIconBtn;
    private boolean isBottomBarVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        voirToutIcon = findViewById(R.id.voirToutIcon);
        pcIconBtn = findViewById(R.id.pcIconBtn);
        LogicielIconBtn = findViewById(R.id.LogicielIconBtn);
        AccessoireIconBtn = findViewById(R.id.AccessoireIconBtn);

        statusBarColor();
        initRecycleView();
        bottomNavigation();

        voirToutIcon.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, categories_activity.class)));
        pcIconBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PcViewActivity.class)));
        LogicielIconBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Logiciel_view.class)));
        AccessoireIconBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SystemeAlarmeView.class)));
        //AccessoireIconBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Logiciel_view.class)));

    }
    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
        binding.profileBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, welcomePage.class)));
        binding.wishlistbtn.setOnClickListener(v -> Toast.makeText(this, "this is not avalable", Toast.LENGTH_SHORT).show());
        binding.explorerbtn.setOnClickListener(v -> Toast.makeText(this, "this is not avalable", Toast.LENGTH_SHORT).show());
    }

    private void statusBarColor() {
        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.blue));
    }

    private void initRecycleView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("pc all in one lenovo v130", "pc_item_5", 15, 4.2, 1090.000, "réf : 0716\n" +
                "-processeur Intel Pentium Silver J5040\n" +
                "-Mémoire : 4GO\n" +
                "-Disque Dur 1TO\n" +
                "-Ecran : 19.5\n" +
                "-couleur ; noir"));
        items.add(new PopularDomain("Vostro 3888", "pc_item_6", 10, 4.5, 1600.000, "Réf : 0984\n" +
                "-PROCESSEUR INTEL® CORE™I3-10100\n" +
                "-MEMOIRE 4Go DDR4\n" +
                "-DISQUE DUR 1To\n" +
                "GRAPHIQUE INTEL UHD GRAPHICS 630\n" +
                "-COULEUR NOIR\n" +
                "-Windows 10 Pro"));
        items.add(new PopularDomain("PC DELL VOSTRO 3671", "pc_item_4", 14, 4,  1390.000, "REF: 0840/0150\n" +
                "Processeur intel Core i3-9100\n" +
                "Mémoire 4 GO\n" +
                "Disque Dur 1To\n" +
                "Freedos\n" +
                "ECRAN Dell 18.5"));
        binding.PopularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        PopularAdapter adapter = new PopularAdapter(items);
        binding.PopularView.setAdapter(adapter);

        ArrayList<PopularDomain> items2 = new ArrayList<>();
        items2.add(new PopularDomain("Sac A dos PORT", "sacc7", 7, 3.6, 120, "REF: 0743\n" +
                "Sac A dos PORT"));
        items2.add(new PopularDomain("Sac A dos PORT 15.6Noir", "sacc8", 10, 3.7, 25, "REF :3735\n" +
                "Sac A dos PORT 15.6 Noir\n"));

        items2.add(new PopularDomain("Detecteur de Gaz sans fil", "alarme11", 10, 4.5, 125, "REF : 2578\n" +
                "Detecteur de Gaz sans fil Gas -88 Code"));
        items2.add(new PopularDomain("Systeme alarme filaire TELETEK", "alarme12", 15, 4.0, 1160, "Prix d'installation et câblage selon l'étude\n" +
                "\n" +
                "Centrale d'alarme 8 Zones programmables.\n" +
                "Clavier distant avec écran LCD.\n" +
                "2 Détecteurs de mouvement IR numérique .\n" +
                "Contact porte/fenêtre (plastique blanc).\n" +
                "Sirène Externe .\n" +
                "Batterie"));
        binding.PopularView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        PopularAdapter adapter2 = new PopularAdapter(items2);
        binding.PopularView1.setAdapter(adapter2);
    }

}