package jc.electiva.afinal.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import jc.electiva.afinal.R;
import jc.electiva.afinal.databinding.TemplateCompraBinding;
import jc.electiva.afinal.models.Compra;

/**
 * Created by JUAN CAMILO on 22/06/2017.
 */

public class ComprasAdapter extends RecyclerView.Adapter<ComprasAdapter.ComprasHolder> {
    public interface OnCompraListener{
        void OnCompraClick(int position);
    }
    LayoutInflater inflater;
    List<Compra> data;
    OnCompraListener listener;

    public ComprasAdapter(LayoutInflater inflater, List<Compra> data, OnCompraListener listener ) {
        this.inflater = inflater;
        this.data = data;
        this.listener =  listener;
    }

    @Override
    public ComprasHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_compra,parent,false);
        return new ComprasHolder(v);
    }

    @Override
    public void onBindViewHolder(ComprasHolder holder, int position) {
        holder.binding.setProducto(data.get(position));
        holder.binding.card.setTag(position);
        holder.binding.setHandler(this);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public void onItemClick(int position){
        listener.OnCompraClick(position);
    }



    //region ViewHolders
    static class ComprasHolder extends RecyclerView.ViewHolder{

        TemplateCompraBinding binding;

        public ComprasHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion
}
