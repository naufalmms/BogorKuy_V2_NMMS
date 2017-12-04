package com.s.m.marzuk.n.bogorkuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;

public class detailBacaLagi extends AppCompatActivity {

    TextView tv1;
    DocumentView details;
    ImageView gambarlagi;


    String[] detailObjekWisata =
            {
                    "Tak hanya kawasan wisata Malang yang punya air terjun indah, Bogor juga surganya air terjun yang eksotis. Kalau Anda tak percaya, coba deh kunjungi Curug Cibaliung yang terletak di desa Karang Tengah, Kecamatan Babakan Madang, Sentul Kabupaten Bogor.\n" +
                            "\n" +
                            "Curug ini memang tidak terlalu tinggi, namun kejernihan dan kesejukan airnya akan membuat Anda tergoda untuk langsung menceburkan diri disini. Rasakanlah serunya basah-basahan dan nikmatnya dipijat oleh derasnya aliran air yang menuju sungai di bawahnya.\n" +
                            "\n" +
                            "Dengan bebatuan dan pepohonan di pinggiran curug yang masih alami, debit air yang cukup deras, serta jernihnya air menjadikan Curug Cibaliung tampak indah dan cantik. Tak ayal, Curug Cibaliung pun menjadi tempat wisata baru di Sentul yang ngehits dikalangan anak muda Bogor.\n" +
                            "\n" +
                            "Lokasi curug ini termasuk tersembunyi alias belum terjamah, jadi benar-benar sangat asri. Sulitnya medan untuk mencapai curug dan belum banyaknya traveler yang mengetahuinya, mungkin menjadi salah satu alasan mengapa tempat ini masih sangat jarang dikunjungi.\n" +
                            "\n" +
                            "Nah, bagi Anda yang ingin mengunjungi Curug Cibaliung, berikut ini ada sedikit info rute jalan menuju lokasi curug. Anda dapat menggunakan kendaraan pribadi melalui jalan tol Jagorawi, keluar di gerbang Sentul City, belok kiri, masuk ke jalan utama arah Jungle Land.\n" +
                            "\n" +
                            "Sebelum pintu gerbang Jungle Land belok kanan melalui jalan perkampungan sampai bertemu pertigaan. Belok kiri menuju Curug Putri Kencana dan Leuwi Hejo, sedangkan arah lurus menuju kawasan Gunung Pancar dengan hutan pinus dan air panasnya.\n" +
                            "\n" +
                            "Selanjutnya ikuti jalan sampai bertemu petunjuk Curug Leuwi Hejo di sebelah kanan jalan, kurang lebih setengah jam, tepatnya di desa Karang Tengah Anda akan menemui Curug Cibaliung. Harga tiket masuk curug ini melalui curug leuwi hejo, per orang Rp 10.000, dan parkir motor Rp 5.000,-.\n" +
                            "\n" +
                            "Oya, Curug Cibaliung juga dikenal dengan sebutan Leuwi Cibaliung atau Curug Baliung. Jadi, kalau sobat traveler mau kesini jangan lupa sebutin semua namanya ya ketika bertanya ke warga sekitar biar tidak kebingungan. Satu lagi, Anda harus hati-hati dan tetap menjaga kebersihan!",
                    "Objek wisata yang menyajikan rumah pohon atau gardu pandang di atas pohon nampaknya sedang naik daun akhir-akhir ini. Sebut saja Gardu Pandang Kalibiru di Kulonprogo yang menjadi primadona baru wisata Jogja dan Omah Kayu di kawasan wisata Batu Malang.\n" +
                            "\n" +
                            "Nah, seakan tak mau ketinggalan, kota Bogor pun menyajikan tempat yang serupa, namanya Rumah Pohon & Jembatan Kayu Gantung Curug Ciherang Jonggol. Tak butuh waktu lama, jembatan kayu ini pun langsung menjadi tempat wisata di Bogor yang hits di kalangan netizen.\n" +
                            "\n" +
                            "Rumah pohon dan jembatan kayu ini terletak di jalan masuk menuju Curug Ciherang. Sedangkan Curug Ciherang sendiri terletak Desa Sukawangi, Kecamatan Sukamakmur, Kabupaten Bogor.\n" +
                            "\n" +
                            "Seperti halnya rumah pohon pada umumnya, rumah pohon Curug Ciherang juga dibangun di atas pohon besar. Pohon ini terletak di tebing sehingga bagian bawahnya merupakan jurang cukup dalam. Jadi, Anda harus hati-hati ya!\n" +
                            "\n" +
                            "Rumah pohon dihubungkan dengan sebuah jembatan kayu sebagai jalan masuknya. Nah, lokasi inilah yang saat ini sedang hits sebagai tempat selfie atau narsis dikalangan muda-mudi di Bogor.\n" +
                            "\n" +
                            "Dengan latar perbukitan hijau alami menjadikan jembatan kayu ini sebagai tempat yang bagus dan keren untuk hunting foto di Bogor. Benar-benar instagramable banget deh!\n" +
                            "\n" +
                            "Oya, masuk ke rumah pohon ini sepertinya masih gratis. Anda cukup membayar harga tiket masuk Curug Ciherang sebesar Rp.5.000,- per orang, biaya parkir roda dua sekitar Rp.5.000,- dan roda empat/mobil Rp.20.000,-.",
                    "Inilah tempat wisata di Bogor anti mainstream, namanya Goa Agung Garunggang yang terletak di Karang Tengah 2, Babakan Madang, Sentul. Goa cantik yang tersembunyi ini masih sangat jarang dikunjungi karena belum banyak diketahui oleh wisatawan.\n" +
                            "\n" +
                            "Di sekitar lokasi goa, banyak terdapat bebatuan unik dan indah yang bagus buat spot foto. Untuk memasuki goa, Anda harus turun ke bawah seperti turun ke dalam sumur karena goa ini berada di dalam tanah. Kondisi goa yang relatif gelap, mewajibkan Anda membawa senter ketika masuk.\n" +
                            "\n" +
                            "Di dalam gua, Anda akan disuguhi stalaktit-stalaktit yang menggantung di dinding atas goa. Anda juga harus menyusuri celah sempit yang mungkin hanya bisa dilalui satu orang saja. Saya sarankan, ketika memasuki goa lebih baik menggunakan jasa pemandu warga setempat.\n" +
                            "\n" +
                            "Untuk menuju lokasi, Anda bisa berpedoman pada Jungleland dan Leuwi Hejo. Jika Anda sudah berada di Sentul, temukanlah Jungleland lalu ikutilah jalan menuju perkampungan. Carilah spanduk mengenai Goa Agung Geopark dan ikutilah berbagai petunjuk jalan.\n" +
                            "\n" +
                            "Jika bingung, jangan malu bertanya kepada warga sekitar. Untuk harga tiket masuk sepertinya masih gratis, paling hanya membayar parkir dan pemandu seikhlasnya kepada warga setempat.",
                    "Anda sedang mencari tempat wisata di puncak Bogor terbaru yang paling bagus? Coba deh, kunjungi Kota Bunga yang terletak di Jl. Hanjawar, Desa Sukanagalih, Kecamatan Pacet, Kabupaten Cianjur – Jawa Barat. Kota Bunga adalah suatu kawasan Villa Estate yang dibangun di lahan seluas sekitar 125 Ha.\n" +
                            "\n" +
                            "Nah, di dalam Kota Bunga ini terdapat sebuah objek wisata baru untuk anak dan keluarga yang asyik dikunjungi saat akhir pekan. Namanya adalah Little Venice yaitu danau buatan yang dirancang semirip mungkin dengan bangunan dan struktur alam yang ada di Venice, Italia.\n" +
                            "\n" +
                            "Di sini tersedia berbagai permainan, dari mulai sepeda untuk anak-anak, perahu bebek, sampai gondola yang bisa Anda dayung sendiri. Anda juga bisa menikmati Mississippi Boat Ride dengan perahu yang bertema western.\n" +
                            "\n" +
                            "Oya, yang unik dari Kota Bunga selain wahananya tentu saja bangunannya. Anda dapat menemukan berbagai rumah atau bangunan khas dari negera-negara di Asia, Eropa, Amerika, maupun Australia. Dan tentu saja dengan aneka bunga yang indah dan menarik.\n" +
                            "\n" +
                            "Kawasan Little Venice ini termasuk tempat favorit untuk hunting foto dan selfie/narsis. Jadi, kalau Anda kesini jangan lupa bawa kamera dengan full baterai ya! Untuk harga tiket masuknya cukup murah kok, cuma Rp.20.000,- per orang. Tapi, untuk menikmati berbagai wahana permainan Anda mesti bayar lagi.",
                    "Curug Bidadari adalah salah satu tempat rekreasi di Bogor yang menarik dikunjungi saat libur akhir pekan. Air terjun ini awalnya bernama Curug Bojongkoneng, namun setelah di kelola oleh Sentul Paradise Park berubah nama menjadi Curug Bidadari atau Air Terjun Bidadari.\n" +
                            "\n" +
                            "Lokasi dan alamat Curug Bidadari terletak di Desa Bojongkoneng, Sentul City, Bogor, Jawa Barat. Air terjun ini memiliki ketinggian sekitar 40-75 meter dan airnya bersumber dari mata air hutan lindung di daerah tersebut.\n" +
                            "\n" +
                            "Saat ini telah dibangun water park tepat di bawah Air Terjun Bidadari. Water park atau taman bermain ini mempunyai luas sekitar lebih dari 6,000 meter persegi dan dilengkapi dengan pasir putih yang didatangkan langsung dari kawasan Bangka. Dengan demikian wisatawan akan merasa seperti di pantai sepanjang 150 meter.\n" +
                            "\n" +
                            "Di kawasan air terjun ini juga terdapat fasilitas wisata menarik lainnya, seperti perahu tangan dan flying fox. Air Terjun Bidadari selalu ramai dikunjungi wisatawan, terutama ketika akhir pekan dan masa-masa liburan.\n" +
                            "\n" +
                            "Air terjun Bidadari buka mulai jam 08.00 – 17.00 WIB saat weekdays dan 07.30 – 18.30 WIB saat weekend. Untuk harga tiket masuknya cukup mahal menurut saya, yaitu sekitar Rp.25.000,- per orang (weekdays) dan Rp.40.000,- per orang (weekend).\n" +
                            "\n" +
                            "Bagi Anda yang ingin berkunjung ke Curug Bidadari, saya sarankan agar hati-hati karena menurut beberapa info dan komentar beberapa traveler yang pernah kesini, jalan menuju ke lokasi curug kurang bagus dan banyak pungli.\n" +
                            "\n" +
                            "Jadi, sebaiknya bawa uang lebih buat jaga-jaga di jalan atau di lokasi curug. Siapa tau Anda kena pungli dari orang yang kurang bertanggung jawab. Semoga saja sekarang jalannya sudah bagus dan tidak ada pungli lagi sehingga wisatawan bisa nyaman menikmati keindahan Curug Bidadari.",
                    "Inilah tempat wisata di Bogor paling recommended untuk anak dan keluarga, yaitu The Jungle Water Adventure yang terletak di Jalan Bogor Nirwana Boulevard Dreded Pahlawan, Perumahan Bogor Nirwana Resident, Jawa Barat.\n" +
                            "\n" +
                            "Dengan mengusung konsep terbuka hijau serta berlatar pemandangan Gunung Salak dan Gunung Pangrango, membuat Jungle Water Adventure menjadi tempat favorit wisatawan untuk liburan. Disini Anda dapat menikmati aneka wahana permainan air yang asik dan seru serta beragam hiburan lainnya yang menyenangkan.\n" +
                            "\n" +
                            "Wahana air yang tersedia objek wisata populer ini antara lain Kiddie Pool, Slide Pool, Racer Slide, Spiral Slide dan Tube Slide yang memiliki panjang lintasan sekitar 100 meter dari ketinggian 12 meter.\n" +
                            "\n" +
                            "Ada juga Leisure Pool, tempat untuk bersantai di tengah kolam renang sambil menikmati makanan dan minuman. Bagi anak-anak yang suka bermain futsal, bisa bermain di area Fountain Futsal. Tak ketinggalan ada juga Sinema 4D yang merupakan Sinema 4 dimensi kedua di Indonesia setelah Dufan Ancol.\n" +
                            "\n" +
                            "Untuk harga tiket masuk reguler The Jungle Water Adventure Bogor sebesar Rp.80.000,- (weekdays) dan Rp.95.000,- (weekend). Namun, untuk rombongan biasanya ada diskon sesuai dengan jumlah orang dalam rombongan tersebut.",
                    "Walaupun sudah berdiri lama sejak tahun 1993, nampaknya tak membuat Wana Wisata Penangkaran Rusa Giri Jaya ini lepas dari daftar tempat wisata di Bogor terbaru yang paling bagus. Mengapa demikian? Dengan harga tiket yang murah meriah sebesar Rp.2.500,-, Anda dapat melakukan berbagai aktivitas wisata yang asik dan seru.\n" +
                            "\n" +
                            "Di areal seluas 5 hektar yang konon pada awalnya dikenal dengan sebutan Penangkaran Rusa Cariu ini, Anda dapat menghabiskan waktu bermain dan bercanda dengan rusa-rusa yang cantik dan lucu. Anda pun diperbolehkan untuk memberi makan dan berfoto ria dengan mereka.\n" +
                            "\n" +
                            "Tak hanya itu, disini juga terdapat beraneka macam rusa dari Rusa Cheetal, Rusa Jawa, dan juga Rusa Bawean. Dan satu lagi yang tak boleh Anda lewatkan adalah spot indah jembatan gantung yang terbentang di atas Sungai Cibeet.\n" +
                            "\n" +
                            "Itulah alasan mengapa Penangkaran Rusa Giri Jaya Cariu Bogor masuk dalam list yang saya buat ini. Tempatnya benar-benar asyik untuk mengisi liburan akhir pekan bersama keluarga atau pun sahabat. Oya, objek wisata ini juga menyediakan lokasi outbound dan tempat perkemahan yang berkapasitas hingga 200 orang lho!\n" +
                            "\n" +
                            "Bagi sobat traveler yang tertarik mengunjungi penangkaran rusa ini, bisa langsung datang ke lokasi di Desa Buana Jaya, Kecamatan Tanjung Sari, Kabupaten Bogor. Jaraknya sekitar 40 km dari pintu keluar Tol Cibubur dari arah Cileungsi – Jonggol. Jam buka mulai pukul 07.00 – 17.00 WIB.",
                    "Tak usah jauh-jauh ke Jepang untuk melihat keindahan bunga Sakura. Datang saja ke Taman Sakura Kebun Raya Cibodas puncak Bogor. Terdapat sekitar 435 pohon bunga Sakura yang dapat Anda temukan di taman ini. Oya, Taman Sakura ini juga termasuk tempat wisata di Bogor yang indah dan bagus untuk prewedding.\n" +
                            "\n" +
                            "Sungguh pemandangan yang indah ketika bunga sakura mekar. Apalagi jika Anda datang bersama pasangan (baca : istri), romantis banget. Berpose berdua dengan latar bunga Sakura yang berwarna pink dengan taman hijau yang luas, membuat seolah-olah dunia milik berdua.\n" +
                            "\n" +
                            "Namun, untuk menjumpai bunga Sakura yang sedang mekar, Anda harus hafal jadwal mekarnya. Hal ini karena bunga ini hanya mekar 2 kali dalam setahun, yaitu sekitar bulan Januari-Februari dan Juli-Agustus.\n" +
                            "\n" +
                            "Selain Taman Sakura, Kebun Raya Cibodas juga menyajikan padang rumput yang luas, pohon-pohon raksasa berusia tua, berbagai koleksi tanaman langka, taman lumut yang unik, kolam, sungai, air terjun, air mancur, dan rumah kaca.\n" +
                            "\n" +
                            "Lokasi dan alamat Kebun Raya Cibodas terletak di Sindanglaya, Cipanas, Cianjur, Jawa Barat. Untuk harga tiket masuk kebun ini dibanderol dengan harga Rp.9.500,-. Jam buka mulai pukul 08.00 – 17.00 WIB.",
                    "Gunung Pancar adalah tempat wisata alam di Bogor terbaru yang lagi ngehits akhir-akhir ini, terutama hutan pinusnya yang eksotis. Dengan ketinggian sekitar 300-800 mdpl dan kemiringan mencapai 15-40%, Gunung Pancar menjadi tempat yang menarik untuk menghabiskan akhir pekan di kota hujan.\n" +
                            "\n" +
                            "Wisata alam Gunung Pancar menyuguhkan hutan pinus yang alami dan memiliki udara yang sangat sejuk. Disini juga tersedia tempat pemandian air panas dan banyak aktivitas wisata lainnya yang dapat Anda lakukan disini seperti camping, hiking, downhill, joging, dan berkuda.\n" +
                            "\n" +
                            "Yang paling jadi primadona disini tentu saja pesona hutan pinusnya yang sangat indah. Pohon pinus yang ramping dan menjulang tinggi di kawasan ini memberi kesan yang eksotis dan romantis. Tak ayal, tempat ini pun kerap dijadikan lokasi pemotretan pre-wedding. Instagramable banget deh!\n" +
                            "\n" +
                            "Gunung Pancar terletak di Desa Karang Tengah, Kecamatan Babakan Madang, Sentul, Kabupaten Bogor, Jawa Barat. Harga tiket masuk objek wisata Gunung Pancar cukup murah meriah yaitu Rp 5.000/orang. Untuk biaya masuk/parkir kendaraan adalah Rp 5.000/motor dan Rp 10.000/mobil.\n" +
                            "\n" +
                            "Bagi Anda yang ingin merasakan berendam air panas, cukup membayar Rp 10.000/orang. Gunung Pancar dibuka selama 24 jam dalam seminggu, jadi sobat traveler tak usah kuatir jika kemalaman.",
                    "Bagi sobat traveler pecinta buah-buahan, wajib deh mengunjungi Taman Wisata Mekarsari. Disini terdapat sekitar 1470 jenis tanaman buah dengan sekitar 100.000 pohon. Wow? Amazing banget bukan? Tak ayal, objek wisata ini pun ditetapkan sebagai taman buah terbesar di Indonesia.\n" +
                            "\n" +
                            "Bukan hanya buah-buahan yang bisa Anda nikmati disini, taman ini juga menyediakan aneka wahana permainan seperti banana boat, angsa air, aqua bike, dan floating donut. Bagi Anda penyuka kegiatan outbond, bisa memilih kegiatan menarik Family Camp atau Family Biking Camp.\n" +
                            "\n" +
                            "Dengan mengusung tema konservasi, edukasi, reboisasi,dan rekreasi menjadikan Taman Wisata Mekarsari sebagai salah satu tempat wisata anak di Bogor favorit wisatawan.\n" +
                            "\n" +
                            "Lokasi dan alamat Taman Wisata Mekarsari berada di Jl. Raya Cileungsi – Jonggol KM 3, Cileungsi, Bogor, Jawa Barat. Jam buka sekitar pukul 10.00 – 16.30 WIB (week days) dan 09.00 – 16.30 WIB (weekend). Untuk harga tiket masuknya cukup murah kok, sekitar Rp.25.000,-.\n" +
                            "\n" +
                            "Namun, Anda harus membayar lagi jika ingin menikmati wahana permainan disini melalui sistem Top Up. Sistem ini berupa pengisian saldo agar dapat menggunakan wahana sehingga Anda tidak perlu mengantre untuk membeli tiket jika ingin menaiki suatu wahana.\n" +
                            "\n" +
                            "Jadi, Tiket masuk sebesar 25.000 Rupiah tersebut sebenarnya terdiri dari 15.000 Rupiah untuk tiket masuk kawasan dan 10.000 Rupiah untuk gelang RFID. Gelang inilah yang digunakan untuk pengisian saldo jika Anda ingin mencoba wahan disini."
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_baca_lagi);
        tv1 = findViewById(R.id.tv1s);
        gambarlagi = findViewById(R.id.gambarArt);
        details = findViewById(R.id.kontenArt);

        tangkapIntent();

        //tv1.setText(getIntent().getStringExtra("kategoris"));


    }

    public void tangkapIntent() {
        Bundle mbundle = getIntent().getExtras();
        String kategorian = getIntent().getStringExtra("kategoris");
        tv1.setText(kategorian);
        if (mbundle != null) {

            if (kategorian.toString().equals("Objek Wisata")) {
                tv1.setText(getIntent().getStringExtra("Judul"));
                gambarlagi.setImageResource(mbundle.getInt("gambar"));
                details.setText(detailObjekWisata[mbundle.getInt("posisi")]);
            } else if (kategorian.toString().equals("Kuliner")) {
                tv1.setText(getIntent().getStringExtra("Judul"));
                gambarlagi.setImageResource(mbundle.getInt("gambar"));
                details.setText(getIntent().getStringExtra("posisi"));
            }
        }


        //gambarlagi.setImageResource(getIntent().getIntExtra("Gambar", 0));

        //int lokasi = getIntent().getIntExtra("Deskrip",0);
        //details.setText(detailObjekWisata[lokasi]);


    }
}
