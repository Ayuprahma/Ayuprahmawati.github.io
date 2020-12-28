package polymorphism
	
	class Dokter : Karyawan() {
	
	    var klinik: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di klinik $klinik")
	    }
	
	    override fun perkenalan() {
	        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, pekerjaan saya sebagai Dokter di $klinik")
	    }
	}
