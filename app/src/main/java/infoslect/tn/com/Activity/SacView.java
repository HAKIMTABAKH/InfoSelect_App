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

public class SacView extends AppCompatActivity {
    private RecyclerView recycle1, recycle2, recycle3, recycle4,recycle5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sac_view);
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
    }
    private void setAdapterForRecyclerView(RecyclerView recyclerView, List<PopularDomain> data) {
        PopularAdapter adapter = new PopularAdapter((ArrayList<PopularDomain>) data);
        recyclerView.setAdapter(adapter);
    }

    private List<PopularDomain> getProductsForRecycle1() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Sac A dos PORT PT ", "sacc1", 8, 4.2, 75, "Ref:3536\n" +
                "Sac A dos PORT PT 110265"));
        list.add(new PopularDomain("Sacoche Elite 15.6\" noir ", "sacc2", 11, 4.1, 30.300, "Ref: 3350\n" +
                "Sacoche Elite 15.6\" noir"));

        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle2() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Mini Sacoche 10.1\"", "sacc3", 5, 3.3, 15.130, "Ref: 1790\n" +
                "Mini Sacoche 10.1\""));
        list.add(new PopularDomain("Sacoche PORTABLE 15.6\" Pro", "sacc4", 18, 3.8, 25.220, "Ref: 1645\n" +
                "Sacoche PORTABLE 15.6\" Pro"));
        // Ajouter d'autres produits
        return list;
    }

    private List<PopularDomain> getProductsForRecycle3() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Sacoche Netbook 10\"", "sacc5", 7, 3.7, 18.160, "Ref: 1453\n" +
                "Sacoche Netbook 10\""));
        list.add(new PopularDomain("Sacoche 15\" DELL/ACER", "sacc6", 10, 4.2, 55, "Ref:3671\n" +
                "Sacoche pour portable 15\" DELL/ACER"));

        // Ajouter d'autres produits
        return list;
    }
    private List<PopularDomain> getProductsForRecycle4() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("Sac A dos PORT", "sacc7", 7, 3.6, 120, "REF: 0743\n" +
                "Sac A dos PORT"));
        list.add(new PopularDomain("Sac A dos PORT 15.6Noir", "sacc8", 10, 3.7, 25, "REF :3735\n" +
                "Sac A dos PORT 15.6 Noir\n"));

        // Add more products
        return list;
    }

    private List<PopularDomain> getProductsForRecycle5() {
        List<PopularDomain> list = new ArrayList<>();
        list.add(new PopularDomain("POLARIS II BUNDLEU 15", "sacc9", 18, 4.6, 65, "REF : 0158\n" +
                "POLARIS II BUNDLEU 15"));
        return list;
    }
    private void statusBarColor() {
        Window window = SacView.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(SacView.this, R.color.white));
    }
}