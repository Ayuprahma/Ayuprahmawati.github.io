fun main(){

    val ayup : Human = Human("Ayup")
    val andi : Human = Human("Andi")

    ayup.email = "ayup@gmail.com"
    ayup.address = "Klaten, Yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    ayup.talk()
    andi.talk()

    ayup.introduce()

    println(ayup.verify("ayup@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(ayup)

}