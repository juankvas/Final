package jc.electiva.afinal;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import jc.electiva.afinal.R;
import jc.electiva.afinal.databinding.ActivityDetailBinding;
import jc.electiva.afinal.models.Compra;
import jc.electiva.afinal.util.data;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int pos = getIntent().getExtras().getInt("pos");
        Compra compra = data.getCompras().get(pos);

        binding.setProducto(compra);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}
