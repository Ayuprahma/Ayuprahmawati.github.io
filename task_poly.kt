package polymorphism

fun main() {

    val afrig = Dosen_poly()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = Mahasiswa_poly()
    andika.nama = "Andika Maharani"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = Satpam_poly()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Barat"
    budi.menjaga()
    
    val adi = Pilot_poly()
    budi.nama = "Adi Prasetyo"
    budi.alamat = "Sleman"
    budi.perkenalan()
    budi.gaji = 5000000
    budi.bekerja()
    budi.maskapai = "Lion Air"
    budi.bekerja()
    
    val nina = perawat_poly()
    budi.nama = "Nurlina Nina"
    budi.alamat = "Pati"
    budi.perkenalan()
    budi.gaji = 200000
    budi.bekerja()
    budi.klinik = "Sehat Sentosa"
    budi.bekerja()
    
    val mina = Pramugari_poly()
    budi.nama = "Mina Lestari"
    budi.alamat = "Jepara"
    budi.perkenalan()
    budi.gaji = 3000000
    budi.bekerja()
    budi.maskapai = "Air Asia"
    budi.bekerja()
    
    val arka = Dokter_poly()
    budi.nama = "Arkana Mahesa"
    budi.alamat = "Jakarta"
    budi.perkenalan()
    budi.gaji = 4000000
    budi.bekerja()
    budi.klinik = "Sehat Mulia"
    budi.bekerja()
    
    val dito = Chef_poly()
    budi.nama = "Dito Nugroho"
    budi.alamat = "Palembang"
    budi.perkenalan()
    budi.gaji = 3500000
    budi.memasak()
    budi.restoran = "Kenyang Nikmat"
    budi.memasak()
    
    val Arman = Polisi_poly()
    budi.nama = "Arman Pradityo"
    budi.alamat = "Bali"
    budi.perkenalan()
    budi.gaji = 2500000
    budi.menjaga()
    budi.polsek = "Kuta"
    budi.menjaga()
}
