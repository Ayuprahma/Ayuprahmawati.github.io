package inheritance
	
	class Dokter : Karyawan() {
	
	    var klinik: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di klinik $klinik")
	    }
	}

	
