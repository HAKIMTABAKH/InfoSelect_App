package infoslect.tn.com.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;

import java.util.ArrayList;
import java.util.Objects;

import infoslect.tn.com.Activity.Detail_Activity;
import infoslect.tn.com.databinding.ViewholderPupListBinding;
import infoslect.tn.com.domain.PopularDomain;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    private ArrayList<PopularDomain> items;
    private Context context;

    public PopularAdapter(ArrayList<PopularDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public PopularAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewholderPupListBinding binding = ViewholderPupListBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder, int position) {
        PopularDomain item = items.get(position);
        holder.binding.titleText1.setText(item.getTitle());
        holder.binding.feeText.setText(item.getPrice()+" DT");
        holder.binding.reviewText.setText(item.getReview()+"");

        holder.binding.scoreText.setText(String.valueOf(item.getScore()));

        int drawableResourceId = context.getResources().getIdentifier(item.getPicUrl(), "drawable", context.getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30, 30, 0, 0))
                .into(holder.binding.pic2);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, Detail_Activity.class);
            intent.putExtra("object", items.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ViewholderPupListBinding binding;

        public ViewHolder(@NonNull ViewholderPupListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
