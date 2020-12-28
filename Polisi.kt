package inheritance
	
	class Polisi : Karyawan() {
	
	    var polsek: String = ""
	
	    fun menjaga(){
	        println("Saya sebagai polisi menjaga di polsek $polsek")
	    }
	}
