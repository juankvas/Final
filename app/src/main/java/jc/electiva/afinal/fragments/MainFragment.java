package jc.electiva.afinal.fragments;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jc.electiva.afinal.DetailActivity;
import jc.electiva.afinal.R;
import jc.electiva.afinal.adapters.ComprasAdapter;
import jc.electiva.afinal.databinding.FragmentMainBinding;
import jc.electiva.afinal.util.data;

public class MainFragment extends Fragment implements ComprasAdapter.OnCompraListener {

    public static MainFragment instance(){
        return new MainFragment();
    }

    FragmentMainBinding binding;
    ComprasAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_main,container,false);
        adapter = new ComprasAdapter(getLayoutInflater(null), data.getCompras(),this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }


    @Override
    public void OnCompraClick(int position) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
    }
}