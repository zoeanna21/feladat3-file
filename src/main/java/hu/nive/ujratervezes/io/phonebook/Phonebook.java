package hu.nive.ujratervezes.io.phonebook;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Phonebook {

    private final Object String;

    public exportPhoneBook(Map<String, String> contacts, String output) {

        Map map=new HashMap()Map() {
            map.put(contacts "Name", output "Phonenumber");


        }

        try {
            if (map.containsKey(output)) {
                throw new IllegalArgumentException;
            }
        }

    }

}


//Egy alkalmazást írunk, ahol a megrendelő szeretné az alkalmazásban tárolt ügyfeleit és azok telefonszámát exportálni fájlba.
//
//Hozd létre a Phonebook osztályt, és abban az exportPhonebook(Map<String, String> contacts, String output) metódust.
//
//A paraméterben kapott Mapben a kulcsok nevek, az értékek pedig telefonszámok. Írd ki az összes kulcs-érték párt az outputként megadott címre, minden kulcs-érték párt egy új sorba, az alábbi szintaxisban:
//
//név: telefonszám
//
//A kiírás sorrendje a fájlba nem fontos, de a Map összes elemét pontosan egyszer írd ki a fájlba!
//
//Ha a metódus akármelyik paraméternek null-t kapna, akkor dobj IllegalArgumentException-t!