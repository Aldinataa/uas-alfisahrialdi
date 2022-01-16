package simple.example.alfisahrialdi;

import android.content.Context;

import simple.example.alfisahrialdi.hewan.Hewan;
import simple.example.alfisahrialdi.hewan.Anjing;
import simple.example.alfisahrialdi.hewan.Ayam;
import simple.example.alfisahrialdi.hewan.Buaya;
import simple.example.alfisahrialdi.hewan.Kucing;

import java.util.ArrayList;
import java.util.List;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> dogs = new ArrayList<>();
        dogs.add(new Anjing(ctx.getString(R.string.Pomeranian_nama), ctx.getString(R.string.Pomeranian_asal),
                ctx.getString(R.string.Pomeranian_deskripsi), R.drawable.anj1));
        dogs.add(new Anjing(ctx.getString(R.string.Poodle_nama), ctx.getString( R.string.Poodle_asal),
                ctx.getString(R.string.Poodle_deskripsi),R.drawable.anj2));
        dogs.add(new Anjing(ctx.getString(R.string.Shih_tzu_nama), ctx.getString(R.string.Shih_tzu_asal),
                ctx.getString(R.string.Shih_tzu_deskripsi), R.drawable.anj3));
        dogs.add(new Anjing(ctx.getString(R.string.Maltese_nama), ctx.getString(R.string.Maltese_asal),
                ctx.getString(R.string.Maltese_deskripsi), R.drawable.anj4));
        dogs.add(new Anjing(ctx.getString(R.string.Pekingese_nama), ctx.getString(R.string.Pekingese_asal),
                ctx.getString(R.string.Pekingese_deskripsi), R.drawable.anj5));
        dogs.add(new Anjing(ctx.getString(R.string.Beagle_nama), ctx.getString(R.string.Beagle_asal),
                ctx.getString(R.string.Beagle_deskripsi), R.drawable.anj6));
        return dogs;
    }

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> chikens = new ArrayList<>();
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Cochin_nama), ctx.getString(R.string.Ayam_Cochin_asal),
                ctx.getString(R.string.Ayam_Cochin_deskripsi), R.drawable.aym1));
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Hutan_Kelabu_nama), ctx.getString(R.string.Ayam_Hutan_Kelabu_asal),
                ctx.getString(R.string.Ayam_Hutan_Kelabu_deskripsi), R.drawable.aym2));
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Kapas_nama), ctx.getString(R.string.Ayam_Kapas_asal),
                ctx.getString(R.string.Ayam_Kapas_deskripsi), R.drawable.aym3));
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Orpington_nama), ctx.getString(R.string.Ayam_Orpington_asal),
                ctx.getString(R.string.Ayam_Orpington_deskripsi), R.drawable.aym4));
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Hutan_Merah_nama), ctx.getString(R.string.Ayam_Hutan_Merah_asal),
                ctx.getString(R.string.Ayam_Hutan_Merah_deskripsi), R.drawable.aym5));
        chikens.add(new Ayam(ctx.getString(R.string.Ayam_Cemani_nama), ctx.getString(R.string.Ayam_Cemani_asal),
                ctx.getString(R.string.Ayam_Cemani_deskripsi), R.drawable.aym6));
        return chikens;
    }

    private static List<Buaya> initDataBuaya(Context ctx) {
        List<Buaya> crocodiles = new ArrayList<>();
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Orinoco_nama), ctx.getString(R.string.Buaya_Orinoco_asal),
                ctx.getString(R.string.Buaya_Orinoco_deskripsi), R.drawable.by1));
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Air_Tawar_nama), ctx.getString(R.string.Buaya_Air_Tawar_asal),
                ctx.getString(R.string.Buaya_Air_Tawar_deskripsi), R.drawable.by2));
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Filipina_nama), ctx.getString(R.string.Buaya_Filipina_asal),
                ctx.getString(R.string.Buaya_Filipina_deskripsi), R.drawable.by3));
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Morelet_nama), ctx.getString(R.string.Buaya_Morelet_asal),
                ctx.getString(R.string.Buaya_Morelet_deskripsi), R.drawable.by4));
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Nill_nama), ctx.getString(R.string.Buaya_Nill_asal),
                ctx.getString(R.string.Buaya_Nill_deskripsi), R.drawable.by5));
        crocodiles.add(new Buaya(ctx.getString(R.string.Buaya_Irian_nama), ctx.getString(R.string.Buaya_Irian_asal),
                ctx.getString(R.string.Buaya_Irian_deskripsi), R.drawable.by6));
        return crocodiles;
    }


    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> sharks = new ArrayList<>();
        sharks.add(new Kucing(ctx.getString(R.string.Kucing_Persia_nama), ctx.getString(R.string.Kucing_Persia_asal),
                ctx.getString(R.string.Kucing_Persia_deskripsi), R.drawable.kc1));
        sharks.add(new Kucing(ctx.getString(R.string.Kucing_British_Shorthair_nama), ctx.getString(R.string.Kucing_British_Shorthair_asal),
                ctx.getString(R.string.Kucing_British_Shorthair_deskripsi), R.drawable.kc2));
        sharks.add(new Kucing(ctx.getString(R.string.Maine_Coon_nama), ctx.getString(R.string.Maine_Coon_asal),
                ctx.getString(R.string.Maine_Coon_deskripsi), R.drawable.kc3));
        sharks.add(new Kucing(ctx.getString(R.string.Kucing_Siam_nama), ctx.getString(R.string.Kucing_Siam_asal),
                ctx.getString(R.string.Kucing_Siam_deskripsi), R.drawable.kc4));
        sharks.add(new Kucing(ctx.getString(R.string.Kucing_Bengal_nama), ctx.getString(R.string.Kucing_Bengal_asal),
                ctx.getString(R.string.Kucing_Bengal_deskripsi), R.drawable.kc5));
        sharks.add(new Kucing(ctx.getString(R.string.Kucing_Manx_nama), ctx.getString(R.string.Kucing_Manx_asal),
                ctx.getString(R.string.Kucing_Manx_deskripsi), R.drawable.kc6));
        return sharks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataBuaya(ctx));
        hewans.addAll(initDataKucing(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
