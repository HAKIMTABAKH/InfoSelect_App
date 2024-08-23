package infoslect.tn.com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

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
        //AccessoireIconBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Logiciel_view.class)));

    }
    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
        binding.profileBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, welcomePage.class)));
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
        items2.add(new PopularDomain("Camera HDTVI box", "cam1", 20, 4.7, 207, "Camera HDTVI box,\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "3.6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 25m,\n" +
                "Smart IR, IP66, DC12V"));

        items2.add(new PopularDomain("Camera HDTVI box", "cam2", 25, 4.4, 283, "Camera HDTVI box ;\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "4mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 50m,\n" +
                "Smart IR, IP66, DC12V"));

        items2.add(new PopularDomain("IP SPEEDDOME SONY", "cam3", 15, 4.6, 3300, "IP SPEEDDOME 1/3\"SONY CMOS 1.3MPXH.264 & MJPEG dual-stream encoding and JPEG image capture,25fps@1.3MPX 1280*960IR 100m(IR ON) DWDR,Day/Night(ICR),DNR(2D&3D),Auto Iris,Auto focus,AWB,AGC,BLCMax 150°/s pan speed, 360° continuous pan rotation IP66AC24V3A ZOOM optique18X f=4.7 mm~84.6mm"));

        binding.PopularView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        PopularAdapter adapter2 = new PopularAdapter(items2);
        binding.PopularView1.setAdapter(adapter2);
    }

}