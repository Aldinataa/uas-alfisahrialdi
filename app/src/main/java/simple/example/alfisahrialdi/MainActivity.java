package simple.example.alfisahrialdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import simple.example.alfisahrialdi.hewan.Anjing;
import simple.example.alfisahrialdi.hewan.Ayam;
import simple.example.alfisahrialdi.hewan.Buaya;
import simple.example.alfisahrialdi.hewan.Kucing;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAnjing,btnAyam, btnBuaya, btnKucing;
    Button btnBiodata;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnAyam = findViewById(R.id.btn_buka_ras_ayam);
        btnBuaya = findViewById(R.id.btn_buka_ras_buaya);
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnBiodata = findViewById(R.id.biodata);
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnAyam.setOnClickListener(view -> bukaGaleri("Ayam"));
        btnBuaya.setOnClickListener(view -> bukaGaleri("Buaya"));
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnBiodata.setOnClickListener(view -> bukaBiodataActivity());
    }


    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    private void bukaBiodataActivity() {
        Log.d("MAIN","Buka bodata");
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}