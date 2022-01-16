package simple.example.alfisahrialdi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.alfisahrialdi.hewan.Hewan;
import simple.example.alfisahrialdi.hewan.Anjing;
import simple.example.alfisahrialdi.hewan.Ayam;
import simple.example.alfisahrialdi.hewan.Buaya;
import simple.example.alfisahrialdi.hewan.Kucing;
public class ProfileActivity extends AppCompatActivity {
    Hewan hewan;
    TextView txtJudul,txtJenis,txtAsal,txtDeskripsi;
    ImageView ivFotoHewan;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {
        txtJudul = findViewById(R.id.txtJudul);
        txtJenis = findViewById(R.id.txtJenis);
        txtAsal = findViewById(R.id.txtAsal);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
        btnBack = findViewById(R.id.btn_back_to_list);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }


    private void tampilkanProfil(Hewan hewan) {
        Log.d("Profil","Menampilkan "+hewan.getJenis());
        if (hewan instanceof Anjing) {
            txtJudul.setText(getString(R.string.anjing));
        } else if (hewan instanceof Ayam) {
            txtJudul.setText(getString(R.string.ayam));
        }else if(hewan instanceof Buaya){
            txtJudul.setText(getString(R.string.buaya));
        }else if(hewan instanceof  Kucing){
            txtJudul.setText(getString(R.string.kucing));
        }
        txtJenis.setText(hewan.getRas());
        txtAsal.setText(hewan.getAsal());
        txtDeskripsi.setText(hewan.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }
}