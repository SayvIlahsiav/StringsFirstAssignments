
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene(String dna) {
        int startInd = dna.indexOf("ATG");
        int stopInd = dna.indexOf("TAA", startInd + 1);

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
            "ATGCGATGGCTAA"
        };

        for (int i = 0; i < dnas.length; i++) {
            System.out.println("DNA " + (i + 1) + ": " + dnas[i]);
            System.out.println("Gene " + (i + 1) + ": " + findSimpleGene(dnas[i]) + "\n");
        }
        
        System.out.println("_._._._._._._._._._._._._._._._._._._._._._");
    }

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        part1.testSimpleGene();
    }
}

