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
    
    val adi = Satpam()
    budi.nama = "Adi Prasetyo"
    budi.alamat = "Sleman"
    budi.perkenalan()
    budi.gaji = 5000000
    budi.bekerja()
    budi.maskapai = "Lion Air"
    budi.bekerja()
}
