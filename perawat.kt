package inheritance
	
	class Perawat : Karyawan() {
	
	    var klinik: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di $klinik")
	    }
	}
