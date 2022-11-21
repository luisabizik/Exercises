// DNA Sequencing
public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;

    //Find length
    int length = dna.length();
    System.out.println("Length: " + length);
  
    //Find start codon
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    //Find stop codon
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

    if(start != -1 && stop != -1) {
      System.out.println("There is a start and stop codon in the protein.");
    } 
    
    if(start != -1 && stop != -1 && (stop - start) % 3 == 0 ) {
      System.out.println("The number of nucleotides between the start codon and the stop codon is a multiple of 3.");
      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein");
    }
 
  }
 
}
