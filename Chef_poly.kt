package polymorphism
	
	class Chef : Karyawan() {
	
	    var restoran: String = ""
	
	    fun memasak(){
	        println("Saya memasak di restoran $restoran")
	    }
	
	    override fun perkenalan() {
	        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya sebagai chef Saya memasak di restoran $restoran")
	    }
	}
