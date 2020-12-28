package polymorphism
	
	class Polisi : Karyawan() {
	
	    var polsek: String = ""
	
	    fun menjaga(){
	        println("Saya menjaga di polsek $polsek")
	    }
	
	    override fun perkenalan() {
	        println("Perkenalkan, nama saya $nama, alamat saya di $alamat")
	    }
	}
