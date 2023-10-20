
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb)
    {
        if (stringa == null || stringb == null || stringa.isEmpty()) {
            return false;
        }

        int firstIndex = stringb.indexOf(stringa);
        
        if (firstIndex == -1) {
            return false;
        }

        int secondIndex = stringb.indexOf(stringa, firstIndex + stringa.length());
        
        return secondIndex >= 0;
        
    }
    
    public String lastPart(String stringa, String stringb)
    {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex != -1) {
            return stringb.substring(firstIndex + stringa.length());
        }
        return stringb;
    }
    
    public void testing()
    {
        String[][] strs = {
            {"by", "A story by Abby Long"},
            {"a", "banana"},
            {"atg", "ctgtatgta"}
        };
        
        for (int i = 0; i < strs.length; i++) {
            System.out.println("String" + (i + 1) + ": " + strs[i][1]);
            System.out.println("Occurence : " + twoOccurrences(strs[i][0], strs[i][1]));
            System.out.println("Last Part : " + lastPart(strs[i][0], strs[i][1]) + "\n");
        }
        
        System.out.println("_._._._._._._._._._._._._._._._._._._._._._");
    }
    
    public static void main(String[] args) {
        Part3 part3 = new Part3();
        part3.testing();
    }
}
