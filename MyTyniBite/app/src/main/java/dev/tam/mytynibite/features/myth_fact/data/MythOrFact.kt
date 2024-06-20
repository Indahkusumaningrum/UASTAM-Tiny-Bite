package dev.tam.mytynibite.features.myth_fact.data

data class MythOrFact(
    val statement: String, val isFact: Boolean, val explanation: String
)

object MythOrFactData {
    val mythOrFactDummies = listOf(
        MythOrFact(
            statement = "Semakin cepat memulai MPASI, semakin baik.",
            isFact = false,
            explanation = "WHO merekomendasikan MPASI dimulai setelah bayi berusia 6 bulan atau 180 hari. Bayi di bawah 6 bulan tidak direkomendasikan diberi makanan tambahan karena fungsi motorik lidah dan saluran pencernaan belum matang."
        ),
        MythOrFact(
            statement = "Tunda pemberian daging, ikan, serta telur sampai bayi berusia 8−12 bulan.",
            isFact = false,
            explanation = "Menunda pemberian daging, ikan, dan telur pada MPASI adalah informasi yang salah. Ketiga sumber protein ini bisa diperkenalkan sejak awal MPASI. Pastikan ketiga sumber protein segar dan dimasak matang."
        ),
        MythOrFact(
            statement = "Saat anak sudah mulai MPASI, frekuensi menyusui sebaiknya dikurangi.",
            isFact = true,
            explanation = "WHO merekomendasikan frekuensi menyusui tetap sama. Berikan makanan padat setelah menyusu. ASI menjadi sumber utama energi bayi di awal MPASI dan untuk bayi usia 12-23 bulan. ASI penting untuk vitamin A, kalsium, dan riboflavin."
        ),
        MythOrFact(
            statement = "Kenalkan sayuran terlebih dahulu, kemudian buah.",
            isFact = false,
            explanation = "Sayur dan buah bisa diperkenalkan bersamaan. Penting untuk mengimbangi asupan sayuran dan buah dengan jenis makanan lainnya."
        ),
        MythOrFact(
            statement = "Pada awal perkenalan MPASI, sebaiknya langsung memberikan bahan makanan kombinasi kepada bayi.",
            isFact = true,
            explanation = "Sebaiknya berikan makanan tunggal seperti puree beras merah dengan ASI pada awal MPASI untuk perkenalan rasa tunggal selama tiga hari berturut-turut guna memantau reaksi alergi."
        ),
        MythOrFact(
            statement = "Hindari makanan yang berpotensi menyebabkan alergi.",
            isFact = false,
            explanation = "Menunda pemberian makanan yang berpotensi menyebabkan alergi justru meningkatkan risiko alergi. Berikan telur, ikan, kacang, gandum, kerang, dan susu sapi secara bertahap. Jika muncul gejala alergi, hentikan pemberian dan konsultasikan ke dokter."
        ),
        MythOrFact(
            statement = "Ketika anak tidak mau makan, berikan jus sebanyak-banyaknya karena jus dapat memberikan energi pengganti makanan utamanya.",
            isFact = true,
            explanation = "Terlalu banyak jus mengurangi nafsu makan dan membuat feses lebih cair. American Academy of Pediatrics merekomendasikan jus tidak lebih dari 240 cc per hari. Konsumsi jus berlebih dapat menyebabkan gagal tumbuh, postur pendek, dan obesitas."
        ),
        MythOrFact(
            statement = "Hindari memberikan gula dan garam.",
            isFact = false,
            explanation = "Anak balita boleh mengkonsumsi garam tidak lebih dari 2 gram per hari dan gula tidak melebihi 25 gram per hari."
        ),
        MythOrFact(
            statement = "Bayi harus menghabiskan setiap sajian MPASI.",
            isFact = false,
            explanation = "Jika bayi memalingkan wajah atau enggan membuka mulut, itu tandanya ia sudah kenyang. Memaksa bayi makan dapat membuatnya rewel karena perutnya tidak nyaman."
        )
    )
}