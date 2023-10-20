
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {      
        if (dna.equals(dna.toUpperCase())){
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }
        else if (dna.equals(dna.toLowerCase())){
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        
        int startInd = dna.indexOf(startCodon);
        int stopInd = dna.indexOf(stopCodon, startInd + 1);

        if (startInd == -1 || stopInd == -1) {
            return "No gene found.";
        }
               
        String result = dna.substring(startInd, stopInd + 3);

        if (result.length() % 3 == 0) {
            return result;
        }
        
        return "No gene found.";
    }

    public void testSimpleGene() {
        String[] dnas = {
            "CCGGTTAACGGAACTG",
            "ATGCGGGTTACC",
            "CGGCCTTGACG",
            "ATGCCCTAACGGTAA",
            "ATGCGATGGCTAA",
            "atgccctaacggtaa"
        };
        
        String startCodon = "ATG";
        String stopCodon = "TAA";
        

        for (int i = 0; i < dnas.length; i++) {
            System.out.println("DNA " + (i + 1) + ": " + dnas[i]);
            System.out.println("Gene " + (i + 1) + ": " + findSimpleGene((dnas[i]) + "\n", startCodon, stopCodon) + "\n");
        }
        
        System.out.println("_._._._._._._._._._._._._._._._._._._._._._");
    }

    public static void main(String[] args) {
        Part2 part2 = new Part2();
        part2.testSimpleGene();
    }
}
