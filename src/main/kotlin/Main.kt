/*
Your little brother wants to learn by heart different currencies, so you want to create a game for him.
The game is to read two countries and print true if those countries have the same currency and false
if the currencies are different in these countries, or there is no information about at least one of them.
To create this game, you need to write a special dictionary with the following countries and currencies:

Country	Currency
Germany:	Euro
Mali:	    CFA franc
Dominica:	Eastern Caribbean dollar
Canada:	    Canadian dollar
Spain:	    Euro
Australia:	Australian dollar
Brazil:    	Brazilian real
Senegal: 	CFA franc
France: 	Euro
Grenada: 	Eastern Caribbean dollar
Kiribati:	Australian dollar
*/
enum class CurrencyOfCountry(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL("No information")
}

fun findByCountry(country: String): CurrencyOfCountry {
    for (enum in CurrencyOfCountry.values()) {
        if (country == enum.name) return enum
    }
    return CurrencyOfCountry.NULL
}

fun main() {
    val (c1, c2) = readln().split(" ")
    print(findByCountry(c1).currency == findByCountry(c2).currency)
}