package inheritance
	
	class pilot : Karyawan() {
	
	    var maskapai : String = ""
	
	    fun bekerja(){
	        println("Saya berkerja di maskapai $maskapai")
	    }
	}
