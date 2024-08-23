package infoslect.tn.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;

import java.util.ArrayList;

import infoslect.tn.com.Helper.ChangeNumberItemsListener;
import infoslect.tn.com.Helper.ManagmentCart;
import infoslect.tn.com.databinding.ViewholderCartBinding;
import infoslect.tn.com.domain.PopularDomain;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    private ArrayList<PopularDomain> items;
    private Context context;
    private ChangeNumberItemsListener changeNumberItemsListener;
    private ManagmentCart managmentCart;

    public CartAdapter(Context context, ArrayList<PopularDomain> items, ManagmentCart managmentCart, ChangeNumberItemsListener changeNumberItemsListener) {
        this.items = items;
        this.context = context;
        this.managmentCart = managmentCart;
        this.changeNumberItemsListener = changeNumberItemsListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewholderCartBinding binding = ViewholderCartBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PopularDomain item = items.get(position);
        if (item != null) {
            holder.binding.titleText1.setText(item.getTitle());
            holder.binding.feeEachItem.setText("$" + item.getPrice());
            holder.binding.totalEachItem.setText("$" + Math.round(item.getNumbersInCart() * item.getPrice()));
            holder.binding.numberItemText.setText(String.valueOf(item.getNumbersInCart()));

            int drawableResourceId = context.getResources().getIdentifier(item.getPicUrl(), "drawable", context.getPackageName());
            if (drawableResourceId != 0) {
                Glide.with(context)
                        .load(drawableResourceId)
                        .transform(new GranularRoundedCorners(30, 30, 0, 0))
                        .into(holder.binding.pic2);
            }

            holder.binding.plusCartBtn.setOnClickListener(v -> {
                managmentCart.plusNumberItem(items, position, () -> {
                    notifyItemChanged(position);
                    changeNumberItemsListener.change();
                });
            });

            holder.binding.minusCartBtn.setOnClickListener(v -> {
                managmentCart.minusNumberItem(items, position, () -> {
                    notifyItemChanged(position);
                    changeNumberItemsListener.change();
                });
            });
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ViewholderCartBinding binding;

        public ViewHolder(ViewholderCartBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
