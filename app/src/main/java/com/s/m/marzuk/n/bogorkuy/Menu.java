package com.s.m.marzuk.n.bogorkuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class Menu extends AppCompatActivity {

    ListView lv1;
    Button cariTombol;
    Spinner spin;
    String pencarian;
    String[] dataSpin = {"Pilih Kategori", "Kuliner", "Objek Wisata"};

    String[] dataListKulinerBogor =
            {
                    "Toge Goreng",
                    "Bapatong",
                    "Laksa Bogor",
                    "Doclang",
                    "Cungkring",
                    "Ngo Hiang",
                    "Pepes Sagu",
                    "Es Pala",
                    "Asinan Jagung Bakar",
                    "Asinan Bogor"
            };
    String[] deskripKulinerBogor =
            {
                    "Makanan khas Bogor toge goreng memang agak sulit untuk ditemukan di kota lain. Toge goreng sejatinya hanya nama saja karena toge sama sekali tidak digoreng dengan minyak. Toge tersebut justru hanya direbus dan dicampur dengan mie kuning dan irisan tahu goreng dan disiram bumbu berbahan dasar oncom dan tauco serta ditambah kecap manis.",
                    "Bapatong adalah singkatan dari bakso kupat gentong. Sesuai dengan namanya, satu porsi bapatong berisi bakso, ketupat yang dipotong berbentuk dadu, iga sapi dan kuah kaldu sapi yang diambil dari gentong atau tempat menyimpan kuah setelah dimasak. Bapatong dapat anda beli di Jalan Pangrango Nomor 1, Bogor.",
                    "Makanan khas Kota Bogor ini sama terkenalnya dengan laksa Betawi. Uniknya, laksa Bogor diberi campuran oncom dan tidak menggunakan mie. Teksturnya memang agak kasar karena ada parutan kelapanya, namun rasanya tetap enak dan gurih. Laksa Bogor biasanya disajikan dengan ditambah tahu kuning, telur rebus, dan taburan serundeng.",
                    "Resep makanan khas Bogor doclang ini mudah untuk dipraktikkan. kamu bisa dengan mudah mencari resep doclang melalu internet. Doclang sekilas mirip dengan kupat tahu atau lontong sayur, isinya sejenis ketupat yang dikenal dengan pesor, irisan tahu goreng, kentang rebus goreng, telur rebus, bumbu kacang, kerupuk, emping tangkil, dan ditambah dengan kecap.",
                    "Cungkring bukan postur tubuh seseorang ya, dalam bahasa Sunda cungkring artinya kikil sapi. Cungkring merupakan potongan kikil dan bagian kepala sapi yang dimasak menggunakan bumbu kuning dan disiram dengan bumbu kacang manis. Makanan sejenis sate ini cocok disantap bersama dengan nasi ketan putih yang dicampur dengan parutan kelapa.",
                    "Ngo hiang berbahan dasar campuran daging babi, udang, dan sagu yang digulung panjang mirip dengan rolade. Gulungan ini kemudian dipotong potong untuk disajikan. Mengolah ngo hiang membutuhkan lima macam bumbu yang disajikan dengan tahu dan kentang disiram kuah kental manis dan gurih. Tidak lupa tambahan acar timun, lobak dan wortelnya. Mantap sekali!",
                    "Makanan tradisional khas Bogor ini berbahan dasar sagu, beda daripada pepes yang biasanya kamu kenal kaaan. Pepes sagu ini bisa kamu temukan di Jalan Surya kencana yang banyak menyediakan aneka jenis sajian kuliner khas Bogor.",
                    "Minuman ini sudah ada sejak jaman Belanda. Terbuat dari irisan buah pala dan gula pasir yang ditambah sedikit garam. Bahan tersebut kemudian direbus, setelah itu baru disajikan dengan diberi es. Rasanya segar dan aromanya harus. Es pala ini selain menyegarkan juga bermanfaat untuk kesehatan seperti mengatasi insomnia, mengatasi rasa mual, mengurangi nyeri datang bulan, dan melancarkan pencernaan.",
                    "Kuliner unik ini benar benar terbuat dari jagung bakar yang dicampur kuah cabai dan cuka serta gula. Citarasanya unik, perpaduan antara asam, manis, dan pedas. Asinan jagung bakar nikmat disantap dengan kerupuk mie dan irisan mentimun.",
                    "Asinan bogor adalah kuliner hasil dari campuran budaya Tionghoa dan budaya asli Bogor. Asinan bogor terdiri dari tiga jenis, yaitu asinan buah, asinan sayur, dan campuran dari keduanya."
            };

    Integer[] gambarKulinerBogor =
            {
                    R.drawable.toge_goreng,
                    R.drawable.bapatong,
                    R.drawable.laksabogor,
                    R.drawable.doclang,
                    R.drawable.cungkring_bogor,
                    R.drawable.ngohiang,
                    R.drawable.pepes_sagu,
                    R.drawable.es_pala,
                    R.drawable.asinan_jagung_bakar,
                    R.drawable.asinan_bogor
            };

    String[] dataListObjekWisata =
            {
                    "Curug Cibaliung",
                    "Rumah Pohon & Jembatan Kayu Gantung Curug Ciherang Jonggol",
                    "Goa Agung Garunggang",
                    "Little Venice Kota Bunga Puncak Bogor",
                    "Curug Bidadari Sentul Paradise Park",
                    "The Jungle Water Adventure",
                    "Penangkaran Rusa Giri Jaya Cariu Bogor",
                    "Taman Sakura, Kebun Raya Cibodas",
                    "Gunung Pancar",
                    "Taman Wisata Mekarsari"
            };
    String[] deskripObjekWisata =
            {
                    "Tak hanya kawasan wisata Malang yang punya air terjun indah, Bogor juga surganya air terjun yang eksotis. Kalau Anda tak percaya, coba deh kunjungi Curug Cibaliung yang terletak di desa Karang Tengah, Kecamatan Babakan Madang, Sentul Kabupaten Bogor.",
                    "Objek wisata yang menyajikan rumah pohon atau gardu pandang di atas pohon nampaknya sedang naik daun akhir-akhir ini. Sebut saja Gardu Pandang Kalibiru di Kulonprogo yang menjadi primadona baru wisata Jogja dan Omah Kayu di kawasan wisata Batu Malang.",
                    "Inilah tempat wisata di Bogor anti mainstream, namanya Goa Agung Garunggang yang terletak di Karang Tengah 2, Babakan Madang, Sentul. Goa cantik yang tersembunyi ini masih sangat jarang dikunjungi karena belum banyak diketahui oleh wisatawan.",
                    "Anda sedang mencari tempat wisata di puncak Bogor terbaru yang paling bagus? Coba deh, kunjungi Kota Bunga yang terletak di Jl. Hanjawar, Desa Sukanagalih, Kecamatan Pacet, Kabupaten Cianjur – Jawa Barat. Kota Bunga adalah suatu kawasan Villa Estate yang dibangun di lahan seluas sekitar 125 Ha.",
                    "Curug Bidadari adalah salah satu tempat rekreasi di Bogor yang menarik dikunjungi saat libur akhir pekan. Air terjun ini awalnya bernama Curug Bojongkoneng, namun setelah di kelola oleh Sentul Paradise Park berubah nama menjadi Curug Bidadari atau Air Terjun Bidadari.",
                    "Inilah tempat wisata di Bogor paling recommended untuk anak dan keluarga, yaitu The Jungle Water Adventure yang terletak di Jalan Bogor Nirwana Boulevard Dreded Pahlawan, Perumahan Bogor Nirwana Resident, Jawa Barat.",
                    "Walaupun sudah berdiri lama sejak tahun 1993, nampaknya tak membuat Wana Wisata Penangkaran Rusa Giri Jaya ini lepas dari daftar tempat wisata di Bogor terbaru yang paling bagus. Mengapa demikian? Dengan harga tiket yang murah meriah sebesar Rp.2.500,-, Anda dapat melakukan berbagai aktivitas wisata yang asik dan seru.",
                    "Tak usah jauh-jauh ke Jepang untuk melihat keindahan bunga Sakura. Datang saja ke Taman Sakura Kebun Raya Cibodas puncak Bogor. Terdapat sekitar 435 pohon bunga Sakura yang dapat Anda temukan di taman ini. Oya, Taman Sakura ini juga termasuk tempat wisata di Bogor yang indah dan bagus untuk prewedding.",
                    "Gunung Pancar adalah tempat wisata alam di Bogor terbaru yang lagi ngehits akhir-akhir ini, terutama hutan pinusnya yang eksotis. Dengan ketinggian sekitar 300-800 mdpl dan kemiringan mencapai 15-40%, Gunung Pancar menjadi tempat yang menarik untuk menghabiskan akhir pekan di kota hujan.",
                    "Bagi sobat traveler pecinta buah-buahan, wajib deh mengunjungi Taman Wisata Mekarsari. Disini terdapat sekitar 1470 jenis tanaman buah dengan sekitar 100.000 pohon. Wow? Amazing banget bukan? Tak ayal, objek wisata ini pun ditetapkan sebagai taman buah terbesar di Indonesia."
            };
    Integer[] imgid =
            {
                    R.drawable.curug_cibaliung,
                    R.drawable.rumahpohon_jembatankayugantung,
                    R.drawable.goaagunggarunggang,
                    R.drawable.littlevenicekotabungapuncakbogor,
                    R.drawable.curugbidadaribogor,
                    R.drawable.thejunglewateradventure,
                    R.drawable.penangkaranrusagirijayacariubogor,
                    R.drawable.tamansakurakebunrayacibodas,
                    R.drawable.wisatagunungpancarbogor,
                    R.drawable.tamanwisatamekarsari
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dataIsian();
        //ketikTombol();
    }

    //public void clickMe(View view){
    //  Button bt=(Button)view;
    //ImageView ims = (ImageView) view;
    //int position = getListView().getPositionForView((LinearLayout)v.getParent());

    // Toast.makeText(this, "Button "+ims.getDrawable().toString(), Toast.LENGTH_LONG).show();

    //Intent cobalagi = new Intent(Menu.this,detailBacaLagi.class);
    //cobalagi.putExtra("Judul",bt.getText().toString());
    //cobalagi.putExtra("gambar", ims.getDrawable().toString());
    //startActivity(cobalagi);
    //}

    public void dataIsian() {
        spin = findViewById(R.id.spins);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Menu.this, R.layout.spinnerstyle, dataSpin);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pencarian = parent.getItemAtPosition(position).toString();
                prosesLisviw1(pencarian);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void ketikTombol() {
        //cariTombol = findViewById(R.id.cariBtn);
        //cariTombol.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {

//                prosesLisviw1(pencarian);
                //if (pencarian != "Pilih Kategori") {
                //Intent a = new Intent(Menu.this, Home.class);
                //a.putExtra("hasil", pencarian);
                //startActivity(a);
                //pencarian = "Pilih Kategori";
                //}


  //          }
    //    });
    }

    //public void clickMe(AdapterView<?> parent, View view, int position, long id) {
    //Button bt=(Button)view;
    //long viewId = view.getId();
    //      Toast.makeText(this, "Button 1 clicked : "+position, Toast.LENGTH_SHORT).show();
    //}

    public void prosesLisviw1(String data) {
        lv1 = findViewById(R.id.listvi1);
        final ArrayAdapter adapter = null;
        if (data == "Objek Wisata") {
            custoAdapterLisViw scs = new custoAdapterLisViw(this, dataListObjekWisata, deskripObjekWisata, imgid);
            lv1.setAdapter(scs);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cobalagi = new Intent(Menu.this, detailBacaLagi.class);
                    cobalagi.putExtra("Judul", dataListObjekWisata[position]);
                    cobalagi.putExtra("gambar", imgid[position]);
                    cobalagi.putExtra("posisi", position);
                    cobalagi.putExtra("kategoris",pencarian);
                    startActivity(cobalagi);
                }
            });

        } else if (data == "Kuliner") {
            custoAdapterLisViw saa = new custoAdapterLisViw(this, dataListKulinerBogor, deskripKulinerBogor, gambarKulinerBogor);
            lv1.setAdapter(saa);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cobalagi = new Intent(Menu.this, detailBacaLagi.class);
                    cobalagi.putExtra("Judul", dataListKulinerBogor[position]);
                    cobalagi.putExtra("gambar", gambarKulinerBogor[position]);
                    cobalagi.putExtra("posisi", deskripKulinerBogor[position]);
                    cobalagi.putExtra("kategoris",pencarian);
                    startActivity(cobalagi);
                }
            });
        } else {
            lv1.setAdapter(null);
        }


    }
}
