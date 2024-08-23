package infoslect.tn.com.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;

import infoslect.tn.com.Helper.ManagmentCart;
import infoslect.tn.com.R;
import infoslect.tn.com.databinding.ActivityDetailBinding;
import infoslect.tn.com.domain.PopularDomain;

public class Detail_Activity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    private PopularDomain object;
    private int numberOrder = 1;
    private ManagmentCart managmentCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        statusBarColor();
        getBundles();
        managmentCart = new ManagmentCart(this);
    }

    private void statusBarColor() {
        Window window = Detail_Activity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(Detail_Activity.this, R.color.white));
    }

    private void getBundles() {
        object = (PopularDomain) getIntent().getSerializableExtra("object");
        int drawableResourceId = this.getResources().getIdentifier(object.getPicUrl(), "drawable", this.getPackageName());

        Glide.with(this)
                .load(drawableResourceId)
                .into(binding.itemPic);

        binding.titleText1.setText(object.getTitle());
        binding.priceText.setText(object.getPrice()+" DT");
        binding.ratingText.setText(object.getScore()+"");
        binding.reviewText.setText(object.getReview()+"");
        binding.descriptionText.setText(object.getDiscreption());

        binding.addToCardBtn.setOnClickListener(v -> {
            object.setNumberInCart(numberOrder);
            managmentCart.insertFood(object);
        });

        binding.backBtn.setOnClickListener(v -> finish());
    }
}