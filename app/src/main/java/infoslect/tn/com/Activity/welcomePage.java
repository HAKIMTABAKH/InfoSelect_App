package infoslect.tn.com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import infoslect.tn.com.R;

public class welcomePage extends AppCompatActivity {
    ImageView logo,backBtn;
    TextView titre1, textdescpt,skiplink;
    Button signInbtn, signUpbtn;

    Animation topanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        // Declaration des ID
        logo = findViewById(R.id.logo);
        titre1 = findViewById(R.id.titre1);
        textdescpt = findViewById(R.id.textdescpt);
        signUpbtn = findViewById(R.id.signUpbtn);
        signInbtn = findViewById(R.id.signInbtn);
        backBtn = findViewById(R.id.backBtn);
        statusBarColor();

        // Action button
        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(welcomePage.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        signInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomePage.this, signInPage.class);
                startActivity(intent);
                finish();
            }
        });

        signUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomePage.this, signUpPage.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void statusBarColor() {
        Window window = welcomePage.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(welcomePage.this, R.color.blue));
    }


}
