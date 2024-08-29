package infoslect.tn.com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import infoslect.tn.com.R;
import infoslect.tn.com.databinding.ActivityMainBinding;

public class categories_activity extends AppCompatActivity {
    ActivityMainBinding binding;
    LinearLayout btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categories);
        statusBarColor();

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);


        btn1.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, PcViewActivity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, Logiciel_view.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, VideoSurvillanceActivity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, SystemeAlarmeView.class)));
        btn5.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, SacView.class)));
        btn6.setOnClickListener(v -> startActivity(new Intent(categories_activity.this, LaptopView.class)));
        btn7.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());
        btn8.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());
        btn9.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());
        btn10.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());
        btn11.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());
        btn12.setOnClickListener(v -> Toast.makeText(this, "not avalable !", Toast.LENGTH_SHORT).show());

    }

    private void statusBarColor() {
        Window window = categories_activity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(categories_activity.this, R.color.white));
    }
}