package dev.tam.mytynibite.features.fastfood_recipe.data

import androidx.annotation.DrawableRes
import dev.tam.mytynibite.R

data class FastFood(
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

object FastFoodData {
    val fastFoodDummies = listOf(
        saladTelurAlpukat,
        perkedelDaging,
        kroketJagungManis,
        buburSaringStroberi,
        nuggetIkan,
        pudingKentangAyamDanTelur,
        mieKukusTelurPuyuh,
    )
}

val saladTelurAlpukat = FastFood(
    title = "Salad Telur Alpukat",
    image = R.drawable.salad_telur_alpukat,
    ageGroup = "Untuk usia 6-8 Bulan",
    nutrition = Nutrition(
        energy = "92.6 kkal",
        protein = "4.0 gr",
        fat = "7.7 gr"
    ),
    ingredients = listOf(
        "50 g daging alpukat",
        "1 butir telur rebus",
        "½ sdm mayones siap pakai"
    ),
    instructions = listOf(
        "Haluskan alpukat dan telur rebus dengan blender atau garpu.",
        "Campur kedua bahan dengan mayones. Aduk rata.",
        "Sajikan."
    )
)

val perkedelDaging = FastFood(
    title = "Perkedel Daging",
    image = R.drawable.perkedel_daging, // replace with the actual drawable resource ID
    ageGroup = "Untuk usia 12-23 Bulan",
    nutrition = Nutrition(
        energy = "96.7 kkal",
        protein = "4.3 gr",
        fat = "7 gr"
    ),
    ingredients = listOf(
        "2 buah kentang ukuran sedang, potong dadu",
        "2 sdm daging giling",
        "50 gr tahu, potong kecil",
        "2 buah bawang putih",
        "1 batang seledri, cincang",
        "1 batang daun bawang, cincang",
        "1 butir telur, kocok lepas",
        "Garam secukupnya",
        "Minyak secukupnya untuk menggoreng"
    ),
    instructions = listOf(
        "Kukus kentang terlebih dahulu selama 10 menit, lalu masukkan tahu, kukus kembali selama 4 menit (total 15 menit atau sampai kentang empuk). Sisihkan.",
        "Ulek kentang, tahu, bawang putih, dan garam.",
        "Masukkan daging giling, seledri, dan daun bawang.",
        "Aduk hingga tercampur rata dan bentuk bulat pipih.",
        "Lumuri bulatan adonan dengan telur dan goreng hingga matang kuning kecoklatan."
    )
)

val kroketJagungManis = FastFood(
    title = "Kroket Jagung Manis",
    image = R.drawable.kroket_jagung_manis,
    ageGroup = "Untuk usia 12-23 Bulan",
    nutrition = Nutrition(
        energy = "141.9 kkal",
        protein = "2.19 gr",
        fat = "10.98 gr"
    ),
    ingredients = listOf(
        "60 g jagung manis, parut",
        "50 g tepung terigu",
        "1 butir telur ayam kampung",
        "½ siung bawang putih, cincang",
        "1 sdm irisan daun bawang",
        "500 ml minyak untuk menggoreng",
        "Bahan untuk lapisan:",
        "1 butir telur, kocok lepas",
        "50 g tepung terigu",
        "50 g tepung panir"
    ),
    instructions = listOf(
        "Campur tepung terigu bersama dengan jagung manis parut, telur ayam kampung bawang putih cincang, dan irisan daun bawang. Aduk rata. Bentuk adonan menjadi bulat panjang. Lakukan hingga adonan habis.",
        "Gulingkan adonan kroket ke tepung terigu, lalu celupkan ke telur, dan gulingkan lagi ke atas tepung panir.",
        "Panaskan minyak. Goreng adonan kroket hingga matang dan berwarna kuning kecoklatan. Angkat dan hidangkan."
    )
)

val buburSaringStroberi = FastFood(
    title = "Bubur Saring Stroberi",
    image = R.drawable.bubur_saring_stroberi,
    ageGroup = "Untuk usia 6-8 bulan",
    nutrition = Nutrition(
        energy = "42.7 kkal",
        protein = "1.1 gr",
        fat = "6.55 gr"
    ),
    ingredients = listOf(
        "60 g stroberi, cincang kasar",
        "1 sdm tepung maizena",
        "250 ml ASI/larutan susu formula lanjutan usia"
    ),
    instructions = listOf(
        "Larutkan tepung maizena dengan ASI/larutan susu formula, aduk rata. Masak sambil diaduk-aduk hingga mendidih.",
        "Tambahkan stroberi cincang. Masak hingga matang. Angkat.",
        "Saring stroberi dengan menekan-nekan menggunakan punggu sendok. Tampung sarinya dan hidangkan segera."
    )
)

val nuggetIkan = FastFood(
    title = "Nugget Ikan",
    image = R.drawable.nugget_ikan, // replace with the actual drawable resource ID
    ageGroup = "Untuk usia 12-23 bulan",
    nutrition = Nutrition(
        energy = "120.1 kkal",
        protein = "10.2 gr",
        fat = "6 gr"
    ),
    ingredients = listOf(
        "200 g daging ikan kakap, cincang",
        "100 g tahu putih, hancurkan dengan garpu",
        "1 buah telur",
        "50 g wortel",
        "50 g bawang bombai, cincang",
        "3 buah bawang putih, cincang",
        "2 buah bawang merah, cincang",
        "2 sdm terigu",
        "2 sdm tepung roti",
        "1 sdt minyak wijen",
        "Garam dan kaldu secukupnya"
    ),
    instructions = listOf(
        "Campur semua bahan utama menjadi satu sampai merata.",
        "Bentuk adonan menjadi kotak pipih.",
        "Kukus selama 15-20 menit. Setelah matang, dinginkan.",
        "Setelah agak dingin, potong nugget sesuai selera.",
        "Celupkan ke dalam bahan pelapis (telur, air, dan terigu). Kemudian, lumuri dengan tepung panir.",
        "Simpan di dalam kulkas kurang lebih 30 menit."
    )
)

val pudingKentangAyamDanTelur = FastFood(
    title = "Puding Kentang Ayam dan Telur",
    image = R.drawable.puding_kentang_ayam_dan_telur,
    ageGroup = "Untuk usia 06 - 08 Bulan",
    nutrition = Nutrition(
        energy = "95 kkal",
        protein = "4.0 gr",
        fat = "3.6 gr"
    ),
    ingredients = listOf(
        "100 gr kentang, dikukus dan dihaluskan",
        "30 gr (3 sdm) daging ayam cincang",
        "10 gr (1 butir) telur puyuh",
        "15 gr (1 buah) tahu kecil, dipotong dadu kecil",
        "15 gr (1.5 sdm) wortel parut",
        "10 gr (1 sdm) labu kuning",
        "15 ml santan",
        "1 batang sereh",
        "1 lembar daun salam",
        "1 sdm minyak",
        "50 ml air kaldu ayam"
    ),
    instructions = listOf(
        "Tumis bumbu halus sampai harum tambahkan daun salam dan sereh.",
        "Masukkan ayam cincang masak sampai berubah warna, lalu masukkan kentang, labu kuning, tahu, dan wortel. Aduk sampai merata.",
        "Tambahkan santan dan air kaldu, aduk merata dan matikan.",
        "Kocok telur lepas, campurkan pada tumisan tadi. Siapkan wadah tahan panas dan olesi minyak, masukkan adonan dan kukus kurang lebih 20 menit.",
        "Sajikan selagi hangat."
    )
)

val mieKukusTelurPuyuh = FastFood(
    title = "Mie Kukus Telur Puyuh",
    image = R.drawable.mie_kukus_telur_puyuh,
    ageGroup = "Untuk usia 09 - 11 Bulan",
    nutrition = Nutrition(
        energy = "135 kkal",
        protein = "5.1 gr",
        fat = "7.6 gr"
    ),
    ingredients = listOf(
        "85 gr (3 bungkus) mie instan batita atau mie keriting",
        "60 gr (6 butir) butir telur puyuh",
        "50 gr (5 sdm) wortel parut",
        "50 gr (5 sdm) keju parut",
        "10 gr (1 batang) bawang daun iris",
        "Minyak untuk menggoreng",
        "Bumbu mie instan batita secukupnya",
        "300 ml air",
        "150 gr pepaya"
    ),
    instructions = listOf(
        "Didihkan air sebanyak 300 ml, masukkan mie instan balita atau mie keriting sampai lunak dan matang.",
        "Masak mie instan balita atau mie keriting hingga matang.",
        "Tambahkan wortel parut, bawang daun, keju parut, dan bumbu mie instan batita secukupnya, kembali aduk sampai merata.",
        "Masukkan 1 sdm adonan mie ke dalam wadah tahan panas yang sudah diolesi minyak dan masukkan telur puyuh yang sudah direbus. Lakukan sampai adonan habis.",
        "Kukus selama 15 menit. Setelah matang, boleh langsung dikonsumsi atau digoreng sampai kuning keemasan. Hidangkan."
    )
)