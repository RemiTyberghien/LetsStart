package be.vives.ti;

public class StringProcessor {
    public String appendIfMissing(String str, String suffix){
        if(!str.endsWith(suffix)){
            str += suffix;
        }
        return str;
    }
}
