package polymorphism
	
	class perawat : Karyawan() {
	
	    var klinik: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di klinik $klinik")
	    }
	
	    override fun perkenalan() {
	        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya bekerja di klinik $klinik")
	    }
	}
