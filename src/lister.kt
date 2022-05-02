import sun.rmi.runtime.Log

fun lister():ArrayList<Listitem>{
    val list:ArrayList<Listitem> = ArrayList()

    val listofpark = arrayListOf<Single_Row>(
            Single_Row("Army Exercise:"),
            Single_Row("1. Maitree – Thailand and India."),
            Single_Row("2. Indra – Russia and India."),
            Single_Row("3. Hand in Hand – China and India."),
            Single_Row("4. Suryakiran – Nepal and India."),
            Single_Row("5. Prabal Dostyak – Kazakastan and India."),
            Single_Row("6. Kanjar – Kyrgyzstan and India."),
            Single_Row("7. Nomadic Elephant – Mangolia and India."),
            Single_Row("8. Mitra Shakthi – Srilanka and India."),
            Single_Row("9. Yudh Abyas – USA and India."),
            Single_Row("10. Ajeya Warrior – UK and India."),
            Single_Row("11. Ex Ekverin- Maladives and India."),
            Single_Row("12. Sampriti – Bangaladesh and India."),
            Single_Row("13. Bold Kurukshetra – Singapore and India."),
            Single_Row("14. Garud Shakti – Indonesia and India."),
            Single_Row("15. Sino India Joint – China and India."),
            Single_Row("16. Al Nagah – Oman and India."),
            Single_Row("17. Imbax – Myanmar and India."),
            Single_Row("18. Vinbax – Vietnam and India."),
            Single_Row("19. Lamitye – Seychelles and India."),
            Single_Row("20. Vajra Prahar – USA and India."),
            Single_Row(""),
            Single_Row("Navy Exercise:"),
            Single_Row("1. Simbex – Singapore and India."),
            Single_Row("2. Varuna – France and India."),
            Single_Row("3. Slinex – Srilanka and India."),
            Single_Row("4. IBSAMAR – Southafrica, Brazil and India."),
            Single_Row("5. Malabar – USA, Japan and India."),
            Single_Row("6. Konkan – UK and India. (Maritime)"),
            Single_Row("7. Sahyog Kajin – Japan and India (coast Guard)."),
            Single_Row("8. Aux Index – Australia and India (Maritime)."),
            Single_Row("9. Naseem –Al-Bahr – Oman and India."),
            Single_Row(""),
            Single_Row("Air force Exercise:"),
            Single_Row("1. Garuda – France and India."),
            Single_Row("2. Cope – USA and India."),
            Single_Row("3. Red Flag – USA and India."),
            Single_Row("4. Indira Dhanush – Uk and India."),
            Single_Row("5. Sindex – Singapore and India."),
            Single_Row("6. Desert Eagle – UAE and India."),
            Single_Row("7. Eastern Bridge – Oman and India."),
            Single_Row("8. Siam Bharat – Thailand –and India."),
            Single_Row(""),
            Single_Row("Cobra Gold – Joint Exercise of Army, Navy, and Air force. There are 29 countries are participated so far. Cobra gold 2017 was held in Thailand")

    )

       for (i in 0 until listofpark.size){


        val l= Listitem(
           listofpark[i].SINGLE)
        list.add(l)
    }
   // println(list.toString())
    return  list


}
data class Country_Capital_Currency (
        val COUNTRY : String,
        val CAPITAL: String,
        val CURRENCY:String
)
data class State_Capital (
        val STATE : String,
        val CAPITAL: String
)

data class Listitem(
        val item1: String?=null,
        val item2: String?=null,
        val item3: String?=null,
        val item4: String?=null
)

data class City_Founders4 (
        val CITY :String,
        val FOUNDER:String,
        val LOCATION:String,
        val WHEN:String
)
data class Single_Row (
        val SINGLE : String
)