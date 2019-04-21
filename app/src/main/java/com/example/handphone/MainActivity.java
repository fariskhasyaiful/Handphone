package com.example.handphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> LinkGambar = new ArrayList<>();
    private ArrayList<String> Spesifikasi = new ArrayList<>();
    private ArrayList<String> Merek = new ArrayList<>();
    private ArrayList<String> Detail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Merek.add("Iphone");
        LinkGambar.add("https://media.wired.com/photos/5b22c5c4b878a15e9ce80d92/master/pass/iphonex-TA.jpg");
        Spesifikasi.add("Iphone 4, Iphone 5, Iphone 5s, Iphone 6, iphone 6s, Iphone 6plus, Iphone 7, Iphone 7plus, Iphone 8, Iphone 8plus, ");
        Detail.add("iPhone adalah jajaran telepon pintar yang dirancang dan dipasarkan oleh Apple Inc. iPhone menggunakan sistem operasi telepon genggam iOS Apple yang dikenal dengan nama \"iPhone OS\" sampai pertengahan 2010, sesaat setelah peluncuran iPad. iPhone pertama diluncurkan tanggal 29 Juni 2007;[14] iPhone terbaru, yaitu iPhone 7 dan iPhone 7 plus generasi kesepuluh, diluncurkan pada tanggal 16 September 2016.[15] Antarmuka penggunanya dikembangkan secara menyeluruh di layar multisentuhnya, termasuk sebuah papan ketik virtual. iPhone memiliki konektivitas Wi-Fi dan seluler (2G, 3G dan 4G).");

        Merek.add("Samsung");
        LinkGambar.add("https://entertekno.com/wp-content/uploads/2018/11/galaxy-a6-pus.jpg");
        Spesifikasi.add("Samsung Galaxy J4+, Samsung Galaxy J5 Prime, Samsung Galaxy A9, Samsung S9, Samsung S10E, Samsung S10 ");
        Detail.add("Samsung Group merupakan salah satu perusahaan elektronik terbesar di dunia. Didirikan oleh Lee Byung-chull pada tanggal 1 Maret 1938 di Daegu, Korea Selatan, perusahaan ini beroperasi di 58 negara dan memiliki lebih dari 208.000 pekerja. Hingga saat ini, Samsung juga menjadi salah satu merek terbesar di dunia dengan mengeluarkan ponsel cerdas yang menjadi jawara dalam persaingan bursa pasar gawai. Samsung adalah salah satu konglomerat (chaebol) Korea Selatan terbesar yang bermula sebagai perusahaan ekspor pada tahun 1938 dan dengan cepat berkembang ke bidang lainnya.");

        Merek.add("Vivo");
        LinkGambar.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/vivo_y95/vivo_y95_L_1.jpg");
        Spesifikasi.add("Vivo V9, Vivo Y71, Vivo Y83, Vivo V3, Vivo V3 Max, Vivo V3 Max");
        Detail.add("Vivo adalah sebuah perusahaan elektronika asal Dongguan, Guangdong, Tiongkok. Perusahaan ini adalah anak dari BBK Electronics. Dikomandoi oleh Shen Wei, perusahaan ini memproduksi ponsel pintar, perangkat sandang, dan layanan berbasis digital");

        Merek.add("Oppo");
        LinkGambar.add("https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//92/MTA-1243478/oppo_oppo-a37-smartphone---2-16gb-gold_full02.jpg");
        Spesifikasi.add("Oppo 9, Oppo A7x, Oppo A7, Oppo A5, Oppo A3s, Oppo A1, Oppo A71");
        Detail.add("Oppo merupakan salah satu perusahaan asal china yaitu Oppo Elektronik Corp dan memproduksi berbagai macam alat elektronik di antaranya MP3 playrt, pemutar media portabel, LCD TV, eBook, pemutar DVD dan Blu ray. Tetapi dengan semakin berkembangnya teknologi terutama dunia smartphone, maka vendor ini pun ikut meramaikan pasaran seluler terutama di Indonesia.");

        Merek.add("Asus");
        LinkGambar.add("https://www.axiqoe.com/product/image/medium/1000024222_1.jpg");
        Spesifikasi.add("Zenfone 5Z, Zenfone 5, ZenFone Max Pro");
        Detail.add("Asus punya dua ponsel cerdas lain di samping Zenfone 5Z yang diluncurkan bersamaan di Jakarta. Dua ponsel tersebut adalah Zenfone 5 dan Zenfone Live L1 yang akan bermain di segmen menengah dan entry market.\n" +
                "\n" +
                "Kedua ponsel ini sejatinya sudah diperkenalkan pada awal Mei ini. Namun, Asus baru mengumumkan harga masing-masing ponsel pada peluncuran hari ini.\n" +
                "\n" +
                "Zenfone 5 akan dibanderol Rp4 juta dan Zenfone Live L1 dibanderol Rp1,4 juta. \n" +
                "\n" +
                "\n" +
                "Zenfone 5 adalah ponsel yang didesain untuk kuat di fotografi. Ponsel anyar tersebut memiliki kamera ganda di belakang dengan resolusi 12 MP dan 8 MP dengan sensor Sony IMX363, sudut lebar 120° dan EIS.");

        Merek.add("Huawei");
        LinkGambar.add("https://www.axiqoe.com/product/image/medium/1000024244_1.jpg");
        Spesifikasi.add("Huawei Honor 7A, Huawei Nova 2 Lite, Huawei P20 Pro, Huawei Y6 LTE, Huawei P30, Huawei Y7 Pro, Huawei P30, Huawei nova 4, Huawei Y9");
        Detail.add("Huawei adalah sebuah perusahaan besar yang bekerja dalam bidang pemasokan serta pemasaran akan barang hasil produksi berupa perangkat elektronik. Adapun barang yang menjadi prioritas utama dalam pembuatan hasil pabriknya ialah sebuah perangkat telepon genggam dan jaringan konektivitas, ketika merilis bagian softwarenya yang meliputi kegaharan dapur pacu bertenaga prosesor yang cepat dan hemat daya, dengan prosesor octa core atau delapan ini pembagian 4 x 2.36 Ghz dan 4 x 1,7 Ghz keduanya jenis Cortex A 53 dan terintegrasi dengan GPU Mali-T830 MP2, serta dukungan kuat dari android sebagai pengendali dari sistem operasi terbaik dalam melakukan semua proses navigasinya itu.");

        Merek.add("Lenovo");
        LinkGambar.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Lenovo_K9/Lenovo_K9_L_1.jpg");
        Spesifikasi.add("Lenovo A2010, Lenovo A3900, Lenovo A6000 plus, Lenovo A6010, Lenovo A6600 Plus, Lenovo K6 Note, Lenovo K6 Power, Lenovo Vibe C");
        Detail.add("Lenovo merupakan sebuah perusahaan pembuatan komponen PC terbesar ke delapan di dunia, yang berasalkan dari negara republik rakyat cina. Perusahaan tersebut bekerja dalam bidang pembuatan alat-alat elektronik yang meliputi komputer, laptop, notebook, handphone dan hal lain, bahkan setiap produk handphone dari hasil pabrikan lenovo dapat terbilang mempunyai keunggulan serta kualitas yang bermutu sehingga menjadikan telepon genggamnya dapat bersaing dalam pasaran elektronik secara global, tepatnya pada sederta perangkat telekomunikasi dan jaringan konektifitas. Bahkan kehadiran telepon genggam dari hasil besutan perusahaan tersebut dalam pasaran elektronik mendapatkan respon yang sangat baik dari para pencinta gadget dengan adanya produk handphone yang bermerk lenovo menjadikan pasaran telekomunikasi lebih berwarna serta lebih banyaknya pilihannya.");

        showRecyleList();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, Merek, LinkGambar, Spesifikasi, Detail);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, Merek, LinkGambar, Spesifikasi, Detail);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, Merek, LinkGambar, Spesifikasi, Detail);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
