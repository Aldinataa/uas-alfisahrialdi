package simple.example.alfisahrialdi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.alfisahrialdi.hewan.Hewan;
import simple.example.alfisahrialdi.hewan.Anjing;
import simple.example.alfisahrialdi.hewan.Ayam;
import simple.example.alfisahrialdi.hewan.Buaya;
import simple.example.alfisahrialdi.hewan.Kucing;


public class DaftarHewanActivity extends AppCompatActivity {

    public final static String HEWAN_TERPILIH ="hewan_obj_key";
    List<Hewan> hewans;
    ListView listView;
    String jenisHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hewan);
        Intent intent = getIntent();
        jenisHewan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);

        hewans = DataHewan.getHewansByTipe(this,jenisHewan);

        TextView txJudulList = findViewById(R.id.text_title_daftar);
        String judul = "";
        if (hewans.get(0) instanceof Anjing) {
            judul = getString(R.string.anjing_list_title);
        } else if (hewans.get(0) instanceof Ayam) {
            judul = getString(R.string.ayam_list_title);
        }else if(hewans.get(0) instanceof Buaya){
            judul = getString(R.string.buaya_list_title);
        }else if(hewans.get(0) instanceof Kucing){
            judul = getString(R.string.kucing_list_title);
        }

        txJudulList.setText(judul);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DaftarHewanAdapter adapter = new DaftarHewanAdapter(this,hewans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Hewan terpilih = hewans.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(Hewan hewanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(HEWAN_TERPILIH, hewanTerpilih);
        startActivity(intent);
    }
}