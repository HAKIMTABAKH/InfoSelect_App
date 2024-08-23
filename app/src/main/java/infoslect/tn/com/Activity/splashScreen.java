package infoslect.tn.com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import infoslect.tn.com.R;

public class splashScreen extends AppCompatActivity {
    Animation logoanim;
    ImageView logo;
    private static int SPLASH_SCREEN = 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        statusBarColor();
        logo = findViewById(R.id.logo);
        //animlation
        logoanim = AnimationUtils.loadAnimation(this, R.anim.logoanim);
        logo.setAnimation(logoanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
}

    private void statusBarColor() {
        Window window = splashScreen.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(splashScreen.this, R.color.blue));
    }

}