package senda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.List;

public class SendaAdapter extends RecyclerView.Adapter<SendaAdapter.SendaviewHolder>{
    private List<Senda> nSendas;
    public void setData(List<Senda> list){
        this.nSendas = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SendaviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_senda, parent, false);
        return new SendaviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SendaviewHolder holder, int position) {
    Senda senda = nSendas.get(position);
    if(senda == null){
        return;
    }
    holder.imgSenda.setImageResource(senda.getResourceId());
    holder.tvTitle.setText(senda.getTitle());
    }

    @Override
    public int getItemCount() {
        if(nSendas != null){
            return nSendas.size();
        }
        return 0;
    }

    public class SendaviewHolder extends RecyclerView.ViewHolder{
        private ImageView imgSenda;
        private TextView tvTitle;

        public SendaviewHolder(@NonNull View itemView) {
            super(itemView);
            imgSenda = itemView.findViewById(R.id.img_senda);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
