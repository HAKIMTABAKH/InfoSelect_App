package infoslect.tn.com.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import infoslect.tn.com.Adapter.CartAdapter;
import infoslect.tn.com.Helper.ChangeNumberItemsListener;
import infoslect.tn.com.Helper.ManagmentCart;
import infoslect.tn.com.R;
import infoslect.tn.com.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
    private ManagmentCart managmentCart;
    private ActivityCartBinding binding;
    private double tax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        managmentCart = new ManagmentCart(this);

        setVariable();
        initList();
        calculateCart();
        setStatusBarColor();
    }

    private void setStatusBarColor() {
        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.white));
        // Optional: Enable edge-to-edge display
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            window.getInsetsController().setSystemBarsBehavior(
                    WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_SWIPE);
        }
    }

    private void initList() {
        if (managmentCart.getListCart().isEmpty()) {
            binding.emptyText.setVisibility(View.VISIBLE);
            binding.scroll.setVisibility(View.GONE);
        } else {
            binding.emptyText.setVisibility(View.GONE);
            binding.scroll.setVisibility(View.VISIBLE);
        }

        binding.cartView.setLayoutManager(new LinearLayoutManager(this));
        binding.cartView.setAdapter(new CartAdapter(this, managmentCart.getListCart(), managmentCart, new ChangeNumberItemsListener() {
            @Override
            public void change() {
                calculateCart();
            }
        }));
    }

    private void calculateCart() {
        double percentTax = 0.02;
        double delivery = 10;
        tax = managmentCart.getTotalFee() * percentTax;
        double total = managmentCart.getTotalFee() + tax + delivery;
        double itemTotal = managmentCart.getTotalFee();

        binding.taxText.setText(String.format("$%.2f", tax));
        binding.totalFeeText.setText(String.format("$%.2f", itemTotal));
        binding.deliveryText.setText(String.format("$%.2f", delivery));
        binding.totalText.setText(String.format("$%.2f", total));
    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(v -> finish());
    }
}
