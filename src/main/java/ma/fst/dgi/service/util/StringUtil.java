package ma.fst.dgi.service.util;

public class StringUtil {
    public static boolean isEmpty(String value){return value==null || value.isEmpty();}

    public static boolean isNotEmpty(String value){return !isEmpty(value);}

    public static Integer toInteger(String value){
        if (isNotEmpty(value)) {
            return Integer.parseInt(value);
        }
        return null;
    }

    public static Long toLong(String value){
        if (isNotEmpty(value)) {
            return Long.parseLong(value);
        }
        return null;
    }

    public static String toString(Long value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }

    public static String toString(Integer value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }


}
