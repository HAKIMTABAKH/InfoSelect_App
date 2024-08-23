package infoslect.tn.com.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import infoslect.tn.com.R;
import infoslect.tn.com.databinding.ActivityCartBinding;
import infoslect.tn.com.databinding.ActivitySignInPageBinding;

public class signInPage extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private TextInputEditText passwordEditText;
    private Button signInButton;
    ImageView fleshfacebook,fleshgoogle,backBtn;
    TextView regesterlink,forgetlink;
    private ActivitySignInPageBinding binding;
    FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(signInPage.this, MainActivity.class);
            startActivity(intent);
            finish();        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);
        statusBarColor();
        //declarations des id
        emailEditText = findViewById(R.id.email);
        mAuth = FirebaseAuth.getInstance();
        passwordEditText = findViewById(R.id.password);
        signInButton = findViewById(R.id.signInbtn);

        fleshfacebook = findViewById(R.id.fleshfacebook);
        fleshgoogle = findViewById(R.id.fleshgoogle);
        forgetlink = findViewById(R.id.forgetlink);

        backBtn = findViewById(R.id.backBtn);
        //actions buttons
        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(signInPage.this, welcomePage.class);
            startActivity(intent);
            finish();
        });
        fleshfacebook.setOnClickListener(v -> {
            //login to facebook
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.facebook.com/login/"));
            startActivity(intent);
        });
        fleshgoogle.setOnClickListener(v -> {
            //login to facebook
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AaSxoQz1KltnnEjzpr-6Au45rxEwEib6RaWnG2HBopVd0NcNO8pVi_tBwE2TcwV2j5rMvFDrMc43&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1039648752%3A1714171164064266&theme=mn&ddm=0"));
            startActivity(intent);
        });
        forgetlink.setOnClickListener(v -> {
            Intent intent = new Intent(signInPage.this, forgetPasswordPage.class);
            startActivity(intent);
        });
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,password;
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) ) {
                    Toast.makeText(signInPage.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    Toast.makeText(signInPage.this, "Logged successfuly !", Toast.LENGTH_SHORT).show();
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(signInPage.this, "Logged successfuly !", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(signInPage.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();

                                } else {
                                    Toast.makeText(signInPage.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });


}

    private void statusBarColor() {
        Window window = signInPage.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(signInPage.this, R.color.blue));
    }

}
