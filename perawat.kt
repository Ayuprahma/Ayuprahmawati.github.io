package inheritance
	
	class perawat : Karyawan() {
	
	    var klinik: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di $klinik")
	    }
	}
