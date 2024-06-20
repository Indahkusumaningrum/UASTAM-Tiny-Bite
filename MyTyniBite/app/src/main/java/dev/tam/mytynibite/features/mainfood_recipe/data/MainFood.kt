package dev.tam.mytynibite.features.mainfood_recipe.data

import androidx.annotation.DrawableRes
import dev.tam.mytynibite.R

data class MainFood(
    val title: String,
    @DrawableRes val image: Int,
    val ageGroup: String,
    val nutrition: Nutrition,
    val ingredients: List<String>,
    val instructions: List<String>,
)

data class Nutrition(
    val energy: String,
    val protein: String,
    val fat: String,
)

object MainFoodData {
    val mainFoodDummies = listOf(
        buburSopDagingKacangMerah,
        buburSotoAyamSantan,
        buburKanjuRumbiAyamUdang,
        buburSingkongIsiIkanAyamSausJeruk,
        nasiTimIkanTunaTelurPuyuh,
        nasiTimIkanTelurSayuran,
        nasiSupTelurPuyuhBolaTahuAyam,
        nasiSotoAyamKuahKuning,
        nuggetTempeAyamSayuran,
        kentangDoriSausKeju
    )
}

val buburSopDagingKacangMerah = MainFood(
    title = "Bubur Sup Daging Kacang Merah",
    image = R.drawable.bubur_sop_daging_kacang_merah,
    ageGroup = "Untuk usia 06 - 08 Bulan",
    nutrition = Nutrition(
        energy = "100 Kkal",
        protein = "45.1 gr",
        fat = "3.6 gr"
    ),
    ingredients = listOf(
        "50 gr (6 sdm) nasi",
        "30 gr (3 sdm) daging ayam cincang",
        "25 gr (1/2 butir) telur ayam",
        "10 gr (1 sdm) buncis",
        "10 gr (1 sdm) wortel",
        "10 gr (1 sdm) kacang merah",
        "10 gr (1 batang) bawang daun",
        "1 batang seledri",
        "300 ml kaldu ayam",
        "2.5 gr (1/2 sdt) minyak untuk menumis",
        "2 siung bawang merah",
        "2 siung bawah putih",
        "100 gr jeruk diambil sarinya"
    ),
    instructions = listOf(
        "Didihkan air kaldu ayam, masukkan kacang merah dan masak sampai empuk",
        "Tumis bumbu halus sampai harum, masukkan daging ayam cincang, masak sampai berubah warna",
        "Masukan tumisan daging ayam kedalam air kaldu masak sampai daging empuk",
        "Masukkan nasi, buncis, dan wortel.",
        "Tambahkan kocokan telur, aduk merata dan masak sampai matang",
        "Haluskan bubur sampai tekstur yang diinginkan, lalu sajikan"
    )
)

val buburSotoAyamSantan = MainFood(
    title = "Bubur Soto Ayam Santan",
    image = R.drawable.bubur_soto_ayam_santan,
    ageGroup = "Untuk usia 06 - 08 Bulan",
    nutrition = Nutrition(
        energy = "96 kkal",
        protein = "4.6 gr",
        fat = "4.1 gr"
    ),
    ingredients = listOf(
        "60 gr (6 sdm) Nasi putih",
        "45 gr (4.5 sdm) Daging ayam cincang",
        "30 gr (1 buah kecil) Tahu",
        "30 gr (3 sdm) Labu siam",
        "15 gr (1.5 sdm) wortel",
        "1 lembar Salam",
        "1 batang Sereh",
        "1 lembar Daun jeruk",
        "5 gr (1 sdm) Minyak goreng",
        "30 ml (3 sdm) Santan",
        "300 ml Air kaldu ayam",
        "1 siung bawang merah",
        "1 siung bawang putih",
        "1 cm Kunyit",
        "1 cm Jahe",
        "100 gr Jeruk diambil sarinya"
    ),
    instructions = listOf(
        "Tumis bumbu halus sampai harum, masukan ayam cincang sampai berubah warna.",
        "Masukan air kaldu ayam, santan, salam, sereh dan daun jeruk masak sampai mendidih.",
        "Masukan nasi, tahu dan labu siam dan wortel yang sudah diiris kecil-kecil masak sampai semua bahan matang dan empuk.",
        "Haluskan sampai tekstur yang diinginkan. Sajikan selagi hangat."
    )
)

val buburKanjuRumbiAyamUdang = MainFood(
    title = "Bubur Kanju Rumbi Ayam dan Udang",
    image = R.drawable.bubur_kanju_rumbi_ayam_dan_udang,
    ageGroup = "Untuk usia 06 - 08 Bulan",
    nutrition = Nutrition(
        energy = "87 kkal",
        protein = "5.1 gr",
        fat = "2.9 gr"
    ),
    ingredients = listOf(
        "60 gr (6 sdm) Nasi putih",
        "30 gr (3 sdm) daging ayam bagian dada",
        "20 gr udang segar",
        "15 gr wortel",
        "15 gr jagung pipil",
        "15 ml santan",
        "350 ml kaldu ayam",
        "2 lembar daun pandan",
        "1 siung bawang merah",
        "1 siung bawang putih",
        "1/2 buah kapulaga",
        "1 gr ketumbar",
        "1 cm kayumanis",
        "1 buah cengkeh",
        "1/4 sdt merica",
        "1/4 sdt jintan campur adas",
        "1/4 buah pekak",
        "Seujung jari buah pala",
        "50 gr pepaya"
    ),
    instructions = listOf(
        "Cuci terlebih dahulu daging ayam hingga bersih, kemudian rebus sampai setengah matang. Setelah matang, potong dadu daging ayam.",
        "Lalu cuci dan bersihkan udang, buang bagian kepala udang. Kemudian, rebus dalam air bekas rebusan ayam tadi, hingga udang berubah warna. Kemudian buang kulitnya, dan potong udang menjadi 2 atau 3 bagian. Sisihkan.",
        "Tumis bumbu halus, masukkan daun pandan. Aduk-aduk, kemudian tambahkan air kaldu, kemudian masak nasi, hingga nasi lembek dan menyerupai bubur.",
        "Tambahkan potongan ayam, udang, wortel dan jagung, masak sambil sesekali diaduk. Jika dirasa kurang air, tambahkan kembali airnya, aduk hingga rata.",
        "Kemudian matikan api, saring sesuai tekstur yang diinginkan. Sajikan."
    )
)


val buburSingkongIsiIkanAyamSausJeruk = MainFood(
    title = "Bubur Singkong Isi Ikan dan Ayam dengan Saus Jeruk",
    image = R.drawable.bubur_singkong_isi_ikan_dan_ayam_dengan_saus_jeruk,
    ageGroup = "Untuk usia 06 - 08 Bulan",
    nutrition = Nutrition(
        energy = "91 kkal",
        protein = "3.1 gr",
        fat = "3.5 gr"
    ),
    ingredients = listOf(
        "75 gr singkong putih, rebus dan haluskan",
        "15 gr (2 sdm datar) daging ikan kembung cincang halus",
        "15 gr daging ayam cincang rebus",
        "250 ml air kaldu ayam",
        "5 gr (1 sdt) minyak kelapa",
        "20 gr (2 sdm) bayam segar, potong halus",
        "1 lembar daun salam",
        "1 batang sereh",
        "1 siung bawang merah",
        "1 siung bawang putih",
        "100 gr jeruk manis diambil sarinya"
    ),
    instructions = listOf(
        "Tumis bumbu halus, lalu masukkan daun salam dan sereh.",
        "Tambahkan air kaldu, masukkan singkong putih, daging ikan, daging ayam cincang rebus, aduk-aduk hingga setengah matang.",
        "Masukkan daun bayam, aduk hingga matang. Jika airnya mengental dapat ditambahkan air matang.",
        "Angkat, lalu saring halus atau diblender. Sebelum disajikan tambahkan saus jeruk."
    )
)

val nasiTimIkanTunaTelurPuyuh = MainFood(
    title = "Nasi Tim Ikan Tuna Telur Puyuh",
    image = R.drawable.nasi_tim_ikan_tuna_telur_puyuh,
    ageGroup = "Untuk usia 09 - 11 Bulan",
    nutrition = Nutrition(
        energy = "120 kkal",
        protein = "4.6 gr",
        fat = "4.3 gr"
    ),
    ingredients = listOf(
        "115 gr (12 sdm) nasi putih",
        "30 gr (1 potong kecil) ikan tuna segar, haluskan",
        "30 gr (3 butir) telur puyuh",
        "15 gr (1 potong besar) wortel",
        "10 gr (1 buah sedang) tomat",
        "7.5 gr (1.5 sdt) minyak kelapa",
        "75 cc (1/3 gelas belimbing) kaldu ayam",
        "50 gr (1/2 potong) pepaya, haluskan",
        "180 gr semangka"
    ),
    instructions = listOf(
        "Masukkan nasi, ikan tuna, telur puyuh, dan minyak kelapa ke dalam mangkok tim.",
        "Tambahkan air kaldu.",
        "Masukkan wortel dan tomat, tim hingga matang.",
        "Angkat, sajikan dengan saos pepaya."
    )
)

val nasiTimIkanTelurSayuran = MainFood(
    title = "Nasi Tim Ikan Telur Sayuran",
    image = R.drawable.nasi_tim_ikan_telur_sayuran,
    ageGroup = "Untuk usia 09 - 11 Bulan",
    nutrition = Nutrition(
        energy = "117 kkal",
        protein = "4.8 gr",
        fat = "4.5 gr"
    ),
    ingredients = listOf(
        "100 gr (10 sdm) nasi putih",
        "100 gr (10 sdm) nasi",
        "30 gr (3 butir) telur puyuh, kocok",
        "30 gr (3 sdm) ikan kembung fillet",
        "10 gr (1 sdm) sawi hijau, iris",
        "20 gr (2 sdm) tomat, cincang",
        "300 ml kaldu ayam",
        "7.5 ml (1.5 sdt) minyak kelapa",
        "180 gr semangka"
    ),
    instructions = listOf(
        "Masak kaldu, nasi, minyak kelapa, dan ikan kembung hingga lunak dan menjadi bubur.",
        "Masukkan sawi hijau dan tomat.",
        "Masukkan telur puyuh yang sudah dikocok, aduk perlahan hingga rata dan matang.",
        "Angkat dan sajikan."
    )
)

val nasiSupTelurPuyuhBolaTahuAyam = MainFood(
    title = "Nasi Sup Telur Puyuh Bola Tahu Ayam",
    image = R.drawable.nasi_sup_telur_puyuh_bola_tahu_ayam,
    ageGroup = "Untuk usia 12-23 Bulan",
    nutrition = Nutrition(
        energy = "260 kkal",
        protein = "10.4 gr",
        fat = "10.7 gr"
    ),
    ingredients = listOf(
        "150 gr (15 sdm) nasi putih",
        "45 gr (1 potong kecil) tahu putih",
        "60 gr (± 5 sdm) daging ayam cincang",
        "60 gr (6 butir) telur puyuh rebus",
        "30 gr (3 sdm) wortel",
        "30 gr (3 sdm) jagung pipil kuning",
        "30 gr (3 sdm) brokoli",
        "Air secukupnya",
        "10 gr (1 batang) seledri, diiris",
        "10 gr (1 batang) daun bawang, diiris",
        "15 gr (± 1.5 sdm) tepung tapioka",
        "Garam secukupnya",
        "Gula secukupnya",
        "Merica secukupnya",
        "10 gr (1 sdm) bawang goreng",
        "135 gr melon"
    ),
    instructions = listOf(
        "Rebus air sampai mendidih. Sambil menunggu air, campurkan tahu, daging ayam cincang, bumbu halus, garam, gula, dan merica, haluskan serta tambahkan tapioka, kemudian uleni hingga tercampur rata dan bisa dibentuk.",
        "Ambil adonan sebanyak satu sendok teh, kemudian bentuk bulat dan langsung dimasukkan pada air mendidih.",
        "Lakukan sampai adonan habis. Setelah semua bola-bola tahu ayam mengapung, masukkan wortel dan jagung terlebih dahulu, tunggu sejenak kemudian brokoli dan telur puyuh rebus.",
        "Masukkan garam, gula, dan merica, serta irisan bawang daun dan seledri. Setelah sayuran matang, koreksi rasa. Sajikan dengan nasi dan taburan bawang goreng."
    )
)

val nasiSotoAyamKuahKuning = MainFood(
    title = "Nasi Soto Ayam Kuah Kuning",
    image = R.drawable.nasi_soto_ayam_kuah_kuning,
    ageGroup = "Untuk usia 12 - 23 Bulan",
    nutrition = Nutrition(
        energy = "263 kkal",
        protein = "9.5 gr",
        fat = "10.9 gr"
    ),
    ingredients = listOf(
        "150 gr (15 sdm) nasi",
        "100 gr (2 potong ayam dengan tulang)",
        "10 gr (1 sdm) soun",
        "60 gr (6 butir) telur puyuh",
        "30 gr (3 sdm) toge",
        "10 gr (1 sdm) minyak goreng",
        "1 lembar daun salam",
        "1 batang serai, digeprek",
        "1 lembar daun jeruk",
        "1/2 cm lengkuas, digeprek",
        "1500 ml air untuk merebus",
        "garam dan gula secukupnya",
        "merica secukupnya",
        "1 butir kemiri",
        "1 siung bawang merah",
        "1 siung bawang putih",
        "1/2 cm jahe",
        "1/2 cm kunyit",
        "1/4 sdt jinten",
        "1/2 sdt ketumbar",
        "1/2 sdt irisan daun bawang",
        "1/2 sdt irisan seledri",
        "1/3 sdt irisan bawang goreng"
    ),
    instructions = listOf(
        "Rebus ayam hingga setengah matang, tambahkan serai geprek, daun salam, daun jeruk, dan lengkuas yang digeprek.",
        "Tumis bumbu yang dihaluskan hingga harum dan matang, lalu masukkan ke dalam rebusan ayam.",
        "Tambahkan garam, gula, dan merica. Masak hingga ayam matang dan empuk, jangan lupa koreksi rasa.",
        "Daging ayam bisa diangkat dan diiris-iris.",
        "Siapkan mangkuk, berikan soun yang sudah direndam, toge, suiran daging ayam, serta telur puyuh rebus.",
        "Tambahkan kuah soto ayam, serta taburkan daun bawang, seledri, dan bawang goreng.",
        "Sajikan dengan nasi hangat dan lengkapi dengan buah."
    )
)

val nuggetTempeAyamSayuran = MainFood(
    title = "Nugget Tempe Ayam Sayuran",
    image = R.drawable.nugget_tempe_ayam_sayuran, // replace with the actual drawable resource ID
    ageGroup = "Untuk usia 11 - 23 Bulan",
    nutrition = Nutrition(
        energy = "191 kkal",
        protein = "10.5 gr",
        fat = "9.0 gr"
    ),
    ingredients = listOf(
        "200 gr tempe di potong kotak kecil, kukus",
        "100 gr daging ayam cingcang, haluskan",
        "100 gr (2 butir) telur ayam, kocok",
        "50 gr (5 sdm) wortel",
        "50 gr (5 sdm) keju parut",
        "10 gr (1 batang) bawang daun, iris halus",
        "10 gr (1 sdm) bawang goreng halus",
        "10 gr (1 sdm) bawang putih halus",
        "20 gr (2 sdm) tepung terigu",
        "20 gr (2 sdm) tepung tapioka",
        "30 gr (3 sdm) tepung terigu",
        "100 ml air atau secukupnya",
        "100 gr (10 sdm) tepung panir",
        "minyak untuk menggoreng secukupnya",
        "270 gr semangka"
    ),
    instructions = listOf(
        "Campurkan tempe, daging ayam cincang, wortel, keju, bawang daun, tepung terigu, tapioka, telur, bawang goreng, dan bawang putih halus. Aduk sampai tercampur rata. Ambil loyang olesi minyak dulu kemudian masukkan adonan nugget dan ratakan. Kukus selama 30 menit atau sampai matang. Setelah dingin potong adonan sesuai ukuran yang diinginkan.",
        "Cairkan terigu dengan air sampai menjadi larutan yang cukup kekentalannya. Celupkan nugget ke tepung terigu basah, gulirkan pada tepung panir.",
        "Sebaiknya disimpan dulu di kulkas selama 30 menit atau bisa langsung digoreng di minyak yang panas. Sajikan selagi hangat. Bisa juga dijadikan lauk."
    )
)

val kentangDoriSausKeju = MainFood(
    title = "Kentang Dori Saus Keju",
    image = R.drawable.puding_kentang_ayam_dan_telur,
    ageGroup = "Untuk usia 9-11 Bulan",
    nutrition = Nutrition(
        energy = "110 kkal",
        protein = "7.1 gr",
        fat = "5.6 gr"
    ),
    ingredients = listOf(
        "50 gram ikan dori",
        "150 gram kentang",
        "40 gram keju parut",
        "Tepung roti secukupnya"
    ),
    instructions = listOf(
        "Panaskan susu dengan api kecil, masukkan parutan keju, aduk sampai keju mencair dan susu mendidih.",
        "Aduk maizena, kuning telur, dan air sampai tercampur rata.",
        "Masukkan ke dalam campuran susu dan keju sedikit demi sedikit sambil diaduk terus menggunakan api kecil. Angkat dari kompor.",
        "Kukus kentang dan ikan dori secara terpisah, lalu haluskan.",
        "Campur kentang, ikan dori, dan keju, lalu bentuk adonan menjadi bulatan.",
        "Gulirkan ke tepung roti hingga permukaannya tertutup dengan rata, lalu goreng.",
        "Sajikan dengan saus keju."
    )
)