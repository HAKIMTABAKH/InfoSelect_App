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

public class VideoSurvillanceActivity extends AppCompatActivity {
    private RecyclerView recycle1, recycle2, recycle3, recycle4;
    private RecyclerView recycle5, recycle6, recycle7, recycle8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_survillance); // Ensure this is the correct layout
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

        recycle7 = findViewById(R.id.recycle7);
        recycle7.setHasFixedSize(true);
        recycle7.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle7, getProductsForRecycle7());

        recycle8 = findViewById(R.id.recycle8);
        recycle8.setHasFixedSize(true);
        recycle8.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setAdapterForRecyclerView(recycle8, getProductsForRecycle8());

    }

    private void setAdapterForRecyclerView(RecyclerView recyclerView, List<PopularDomain> data) {
        PopularAdapter adapter = new PopularAdapter((ArrayList<PopularDomain>) data);
        recyclerView.setAdapter(adapter);
    }

    private List<PopularDomain> getProductsForRecycle1() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Caméra miroir SONY", "item_cam1", 10, 4.5, 189, "Caméra Miroir\n" +
                "SONY Super HAD CCD II\n" +
                "(NEXTCHIP)1/3\"600TVL\n" +
                "0.5LUX/F1.2\n" +
                "DC12V±5%\n" +
                "Objectif 2,8/3.6mm"));
        list.add(new PopularDomain("Caméra Détecteur de Fumée", "item_cam2", 15, 4.0, 151.050, "Caméra Détecteur de Fumée\n" +
                "SONY Super HAD CCD II\n" +
                "(NEXTCHIP)1/3\"600TVL\n" +
                "0.5LUX/F1.2\n" +
                "DC12V±5%\n" +
                "Objectif 3.6mm"));
        list.add(new PopularDomain("IP SPEEDDOME 1/3\"", "item_cam3", 15, 3.6, 3300.00, "IP SPEEDDOME 1/3\"SONY CMOS 1.3MPXH.264 & MJPEG dual-stream encoding and JPEG image capture,25fps@1.3MPX 1280*960IR 100m(IR ON) DWDR,Day/Night(ICR),DNR(2D&3D),Auto Iris,Auto focus,AWB,AGC,BLCMax 150°/s pan speed, 360° continuous pan rotation IP66AC24V3A ZOOM optique18X f=4.7 mm~84.6mm"));
        list.add(new PopularDomain("IP Speeddome", "item_cam4", 15, 4.1, 2480.00, "IP Speeddome SD6423C-HN IP SPEEDDOME 1/4\"CMOS D1H.264 & MJPEG dual-stream encoding and JPEG image capture,25fps@D1(4CIF)/CIF/VGA resolutionNVRNVRIR 80m(IR ON) DWDR,Day/Night(ICR),DNR(2D&3D),Auto Iris,Auto focus,AWB,AGC,BLCMax 240°/s pan speed, 360° continuous pan rotationBuilt-in 7/2 alarm in/out,Micro SD memory Max 32GB, IP66AC24V3A ZOOM optique23X f=3.9 mm~89.7mm"));
        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle2() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Camera HDTVI Dome ", "item_cam7", 8, 4.2, 142.00, "Camera HDTVI Dome Plastique\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "3,6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB,AGC,BLC\n" +
                "Filtre Infrarouge ICR, IR 20m,\n" +
                "Smart IR, DC12V"));
        list.add(new PopularDomain("Camera HDTVI Dome ", "item_cam8", 11, 4.1, 189.00, "Camera HDTVI Dome Plastique\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "3,6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB,AGC,BLC\n" +
                "Filtre Infrarouge ICR, IR 20m,\n" +
                "Smart IR, DC12V"));
        list.add(new PopularDomain("Camera HDTVI Dome", "item_cam9", 12, 4.0, 154.00, "Camera HDTVI Dome Metal\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "3.6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB,AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 20m,\n" +
                "Smart IR, DC12V"));
        list.add(new PopularDomain("Camera HDTVI Dome", "item_cam10", 10, 3.8, 203.00, "Camera HDTVI Dome Metal\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "3.6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB,AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 20m,\n" +
                "Smart IR, DC12V"));
        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle3() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("NVR4CH", "item_cam5", 5, 3.3, 310.00, "NVR 4 CHANELS\n" +
                "Compression H.264+/H.264\n" +
                "Résolution maximale 4 Mégapixels\n" +
                "Manuel, programmé, Détection de mouvement\n" +
                "Bande Passante tot :40 Mbps entrée/ 40 Mbps sortie\n" +
                "Sortie : 2 x USB 2.0 / 1 x RJ45 /1 HDMI Full HD, 1 VGA"));
        list.add(new PopularDomain("IP Dome NETVISION", "item_cam6", 18, 3.8, 425.00, "IP Dome NETVISION 1/4” 1.3MP progressive scan CMOS ICR, 0.01lux/F1.2, 6mm/F2.0 lens (4mm, 6mm, 8mm optional) EXIR range: up to 20m"));
        list.add(new PopularDomain("Camera HDTVI box", "item_cam11", 12, 4.0, 165.2, "Camera HDTVI box,\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "3.6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 25m,\n" +
                "Smart IR, IP66, DC12V"));
        list.add(new PopularDomain("Camera HDTVI box", "item_cam12", 10, 3.6, 207.7, "Camera HDTVI box,\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "3.6mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 25m,\n" +
                "Smart IR, IP66, DC12V"));
        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle4() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Camera HDTVI box", "item_cam13", 7, 3.7, 283.20, "Camera HDTVI box ;\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "4mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 50m,\n" +
                "Smart IR, IP66, DC12V"));
        list.add(new PopularDomain("Camera HDTVI box", "item_cam14", 10, 3.7, 330.50, "Camera HDTVI box ;\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "4mm, 6mm, 8mm optionnel\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB, AGC, BLC,\n" +
                "Filtre Infrarouge ICR, IR 50m,\n" +
                "Smart IR, IP66, DC12V"));
        list.add(new PopularDomain("Camera HDTVI box", "item_cam15", 5, 3.9, 243.2, "Camera HDTVI box ;\n" +
                "1/2.8\" CMOS, 1,3MP\n" +
                "2,8-12mm\n" +
                "0.01Lux, 25Fps@960P,\n" +
                "AWB, AGC, BLC,\n" +
                "filtre Infrarouge ICR, IR 50m,\n" +
                "Smart IR, IP66, DC12V"));
        list.add(new PopularDomain("Camera HDTVI box", "item_cam16", 10, 4.0, 389.50, "Camera HDTVI box ;\n" +
                "1/2.8\" CMOS, 2MP\n" +
                "2,8-12mm\n" +
                "0.01Lux, 25Fps@1080P,\n" +
                "AWB, AGC, BLC,\n" +
                "filtre Infrarouge ICR, IR 50m,\n" +
                "Smart IR, IP66, DC12V"));
        // Ajouter d'autres produits
        return list;
    }
    private List<PopularDomain> getProductsForRecycle5() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("DS-7104 HGHI-F1", "item_cam17", 7, 3.6, 330.50, "DS-7104 HGHI-F1\n" +
                "DVR HD 720P Turbo Mini 1U /1080P Lite\n" +
                "4 canaux vidéo et 1 canal d’entrée audio\n" +
                "Technologie hybride HD-TVI / HDCVI /AHD /analogique\n" +
                "Compression vidéo H.264 / H.264+"));
        list.add(new PopularDomain("DS-7108 HGHI-F1", "item_cam18", 10, 3.7, 543.00, "DS-7108 HGHI-F1\n" +
                "DVR HD 720P Turbo Mini 1U /1080P Lite\n" +
                "8canaux vidéo et 1 canal d’entrée audio\n" +
                "Technologie hybride HD-TVI / HDCVI /AHD /analogique\n" +
                "Compression vidéo H.264 / H.264"));
        list.add(new PopularDomain("DS-7116 HGHI-F1", "item_cam19", 7, 4.7, 849.60, "DS-7116 HGHI-F1\n" +
                "DVR HD 720P Turbo Mini 1U /1080P Lite\n" +
                "16 canaux vidéo et 1 canal d’entrée audio\n" +
                "Technologie hybride HD-TVI / HDCVI /AHD /analogique\n" +
                "Compression vidéo H.264 / H.264"));
        list.add(new PopularDomain("DS-7104HQHI-F1/N", "item_cam20", 7, 4.7, 625.40, "DS-7104HQHI-F1/N\n" +
                "DVR HD 1080P Turbo Mini 1U\n" +
                "4 canaux vidéo et 1 canal d’entrée audio\n" +
                "Technologie hybride à trois caméras HD-TVI/AHD/analogique\n" +
                "Compression vidéo H.264 / H.264+"));
        // Add more products
        return list;
    }

    private List<PopularDomain> getProductsForRecycle6() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("DS-7108HQHI-F1/N", "item_cam21", 18, 4.6, 1003.00, "Principales caractéristiques :\n" +
                "• 8 canaux vidéo et 1 canal d’entrée audio\n" +
                "• Technologie hybride à trois caméras HD-TVI/\n" +
                "AHD/analogique\n" +
                "• Compression vidéo H.264 / H.264+\n" +
                "• Enregistrement en canal intégral en résolution\n" +
                "1080P\n" +
                "• Sortie HDMI dans une résolution pouvant\n" +
                "atteindre 1920×1080P (DS-7104/08HQHI-F1/N)\n" +
                "• Sortie UHD 4K (DS-7116HQHI-F1/N)\n" +
                "• Longue distance de transmission sur câble\n" +
                "coaxial\n" +
                "• 1 SATA, 1 USB 2.0 + 1 USB 3.0 (DS-\n" +
                "7116HQHI-F1/N)"));
        list.add(new PopularDomain("DS-7216HGHI-F2", "item_cam22", 10, 4.9, 1652.00, "Principales caractéristiques:\n" +
                "• 16 canaux vidéo et 1 canal d’entrée audio\n" +
                "• Technologie hybride à quatre caméras HD-TVI/\n" +
                "analogique/AHD/IP\n" +
                "• Enregistrement en canal intégral en temps réel\n" +
                "en résolution 720P\n" +
                "• Sortie HDMI dans une résolution pouvant\n" +
                "atteindre 1920×1080P.\n" +
                "• Longue distance de transmission sur câble\n" +
                "coaxial\n" +
                "• Panneau avant et E/S d'alarme en option\n" +
                "• 2 SATA (DS-7204/-7208/16HGHI-F1), 2 USB 2.0"));
        list.add(new PopularDomain("IR MINI Speeddome10x", "item_cam23", 8, 4.1, 1132.80, "IR MINI Speeddome10x\n" +
                "1/3\" SONY CCD 700TVL\n" +
                "IR 60-80M (IR ON) Color: 0.01Lux B/W:0.001Lux\n" +
                "AC12V Zoom optique 10x f=3.9mm(wide) ~39mm(tele)\n" +
                "IP66"));
        list.add(new PopularDomain("DS-2AE4123TI-D", "item_cam24", 11, 4.3, 2124.00, "Principales caractéristiques :\n" +
                "* 1/3\" Progressive Scan CMOS\n" +
                "* 1280x720/1920x1080\n" +
                "* 23X Optical Zoom\n" +
                "* DWDR\n" +
                "* Up to 100m IR distance\n" +
                "* 3D intelligent positioning function\n" +
                "* Support Turbo HD and BNC output"));
        // Add more products
        return list;
    }

    private List<PopularDomain> getProductsForRecycle7() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Caméra Externe", "item_cam25", 13, 4.2, 377.60, "Caméra Externe\n" +
                "SONY EXView HAD CCD II\n" +
                "(EFFIO-E) 1/3\"700TVL\n" +
                "IR 60-80M 0LUX(IR ON)\n" +
                "DC12V±5%\n" +
                "Objectif 16/25mm"));
        list.add(new PopularDomain("NVR 8 Chanels", "item_cam26", 18, 4.6, 475.00, "Compression H.264+/H.264\n" +
                "Résolution maximale 8 Mégapixels\n" +
                "Manuel, programmé, Détection de mouvement\n" +
                "Bande Passante tot :60 Mbps entrée/ 80 Mbps sortie\n" +
                "Sortie : 2 x USB 2.0 / 1 x RJ45 /1 HDMI Full HD, 1 VGA"));
        list.add(new PopularDomain("Caméra IP Tube 3", "item_cam27", 13, 4.2, 265.00, "Capteur : 1/3\" Progressive Scan CMOS\n" +
                "Resolution : 3 Mpx (2048x1536)\n" +
                "Objectif : 2.8 mmm\n" +
                "Portée IR : 30 m\n" +
                "Interface réseau : RJ45 7"));
        list.add(new PopularDomain("Caméra IP Tube 3", "item_cam28", 18, 4.6, 265.00, "Capteur : 1/3\" Progressive Scan CMOS\n" +
                "Resolution : 3 Mpx (2048x1536)\n" +
                "Objectif : 2.8 mmm\n" +
                "Portée IR : 30 m\n" +
                "Interface réseau : RJ45 "));
        // Add more products
        return list;
    }

    private List<PopularDomain> getProductsForRecycle8() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Caméra IP Tube 4", "item_cam29", 5, 4.3, 345.00, "Capteur : 1/3\" Progressive Scan CMOS\n" +
                "Résolution : 4 Megapixel (2688x1520)\n" +
                "Objectif : 2.8 mm\n" +
                "Portée IR : 30 m\n" +
                "Interface réseau : RJ 45"));
        list.add(new PopularDomain("Caméra IP Dôme 3", "item_cam30", 8, 3.8, 265.00, "Capteur : 1/3\" Progressive Scan CMOS\n" +
                "Résolution : 3 Megapixel (2048x1536)\n" +
                "Objectif 2.8 mm\n" +
                "Portée IR : 30m\n" +
                "Interface Réseau : RJ45"));
        list.add(new PopularDomain("Caméra Tube", "item_cam31", 5, 3.3, 195.00, "Caméra Tube AHD/HDTVI/HDCVI/CVBS\n" +"Capteur : CMOS\n" +
                "Résolution : 1080P\n" +
                "Objectif : 2.8 mm\n" +
                "Portée IR : 20mm"));
        list.add(new PopularDomain("Caméra Dôme", "item_cam32", 5, 3.4, 170.00, "Caméra Dôme AHD/HDTVI/HDCVI/CVBS\n" +"Capteur : CMOS\n" +
                "Résolution : 1080P\n" +
                "Objectif : 2.8 mm\n" +
                "Portée IR : 20m"));
        // Add more products
        return list;
    }

    private void statusBarColor() {
        Window window = VideoSurvillanceActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(VideoSurvillanceActivity.this, R.color.white));
    }
}
