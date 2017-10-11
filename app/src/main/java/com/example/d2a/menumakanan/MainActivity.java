package com.example.d2a.menumakanan;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        iniResepnya();
    }
    public void iniResepnya() {
        Resep resep = new Resep("Rendang Daging", R.drawable.Rendang,
                "Rendang padang asli minang merupakan salah satu hidangan asli nusantara yang telah termahsyur di mancanegara. Bahkan berdasarkan hasil pooling salah satu web berita asal Inggris, rendang padang asli minang pernah terpilih sebagai makanan terlezat sedunia!", "\nBahan-bahan :\n\n"
                + "\t- Bahan ungkep ayam \n"
                +"\t- 1 kg daging has dalam \n"
                +"\t- 4 butir kelapa \n"
                +"\t- 2 ons cabai merah \n"
                +"\t- 1 ons cabai rawit \n"
                +"\t- 10 butir bawang merah \n"
                +"\t- 10 butir bawang putih \n"
                +"\t- seruas jari jahe, kunyit \n"
                +"\t- 1 sdt merica \n"
                +"\t- Garam halus/ kaldu bubuk \n"
                +"\t- 1 sdt ketumbar \n"
                +"\t- 1/2 st jintan \n\n"
                +"\t  7 butir kemiri \n\n"
                +"\t- garam \n"
                +"\t  daun jeruk \n"
                +"\t- sereh, daun kunyit, salam \n"
                +"\t- lengkuas \n"
                +"\t- 2 sm ampas kelapa disangrai sampai kehitaman dan tumbuk halus \n" + "\n\n" + "Langkah : \n\n"
                +"\t1.   Daging diiris kotak2 sesuai selera, rebus sampai setengah lunak. \n"
                +"\t2.   Peras 4 butir kelapa menjadi 3 liter santan kental. \n"
                +"\t3.   Semua bumbu dihaluskan kecuali lengkuas dan daun-daunan. \n"
                +"\t4.   Aduk2 kuah hingga kurang lebih 3 jam sampai daging lunak dan kuah mengering \n");
        resepList.add(resep);
        Resep resep = new Resep("Seblak", R.drawable.Seblak,
                "Spesial", "Bahan-bahan :\n\n"
                +"\t2 Sayap ayam \n"
                +"\tKerupuk secukupnya \n"
                +"\t1 ruas kencur \n"
                +"\t3 bawang putih \n"
                +"\t4 bawang merah \n"
                +"\t1 butir telur ayam \n"
                +"\tsesuai selera Cabe rawit \n"
                +"\tIris Daun Bawang \n"
                +"\tgaram secukupnya \n"
                +"\tGaram, Gula \n\n" + "Langkah : \n\n"
                +"\t1.  Siapkan kerupuk dan rendam dengan air panas, setelah lembut baru tiriskan \n"
                +"\t2.  Blender halus bawang merah, putih, kencur dan cabe\n"
                +"\t3.  Tumis bumbu halus, lalu masukan telor dan orak arik,bakso setelah itu masukan air kaldu dari rebusan sayap ayam, setelah itu masukan kerupuk yg sudah direndam tadi\n"
                +"\t4.  Tambah garam gula dan koreksi rasa. \n");
        resepList.add(resep);
        mAdapter.notifyDataSetChanged();

    }
}