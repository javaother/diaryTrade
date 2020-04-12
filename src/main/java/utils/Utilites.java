package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilites {

    public static String formatDateWithoutTime(Date dateOrig){
        return (new SimpleDateFormat("dd.MM.yyyy").format(dateOrig));
    }
}
