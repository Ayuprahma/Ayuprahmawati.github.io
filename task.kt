package inheritance

fun main() {

    val afrig = Dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = Mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = Satpam()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Barat"
    budi.menjaga()
    
    val adi = Pilot()
    budi.nama = "Adi Prasetyo"
    budi.alamat = "Sleman"
    budi.perkenalan()
    budi.gaji = 5000000
    budi.bekerja()
    budi.maskapai = "Lion Air"
    budi.bekerja()
    
    val nina = perawat()
    budi.nama = "Nurlina Nina"
    budi.alamat = "Pati"
    budi.perkenalan()
    budi.gaji = 200000
    budi.bekerja()
    budi.klinik = "Sehat Sentosa"
    budi.bekerja()
    
    val mina = Pramugari()
    budi.nama = "Mina Lestari"
    budi.alamat = "Jepara"
    budi.perkenalan()
    budi.gaji = 3000000
    budi.bekerja()
    budi.maskapai = "Air Asia"
    budi.bekerja()
    
    val arka = Dokter()
    budi.nama = "Arkana Mahesa"
    budi.alamat = "Jakarta"
    budi.perkenalan()
    budi.gaji = 4000000
    budi.bekerja()
    budi.klinik = "Sehat Mulia"
    budi.bekerja()
    
    val dito = Chef()
    budi.nama = "Dito Nugroho"
    budi.alamat = "Palembang"
    budi.perkenalan()
    budi.gaji = 3500000
    budi.memasak()
    budi.restoran = "Kenyang Nikmat"
    budi.memasak()
    
    val Arman = Polisi()
    budi.nama = "Arman Pradityo"
    budi.alamat = "Bali"
    budi.perkenalan()
    budi.gaji = 2500000
    budi.menjaga()
    budi.polsek = "Kuta"
    budi.menjaga()
}
