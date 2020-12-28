package polymorphism
	
	class Pramugari : Karyawan() {
	
	    var maskapai: String = ""
	
	    fun bekerja(){
	        println("Saya bekerja di maskapai $maskapai")
	    }
	
	    override fun perkenalan() {
	        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, bekerja di maskapai $maskapai")
	    }
	}
