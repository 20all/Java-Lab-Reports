import java.util.Scanner;

interface Printable {
    void print();
    String getContent();
}
interface Calculable {
    double calculateSize();
    int countWords();
}
class Document implements Printable, Calculable {
    private String title;
    private String content;
    private double sizePerWord;
    Document(String t, String c, double s) {
        this.title = t;
        this.content = c;
        this.sizePerWord = s;
    }
    // implementng Printable interface's methods
    @Override
    public void print() {
        System.out.println("Printing Document :"+title);
        System.out.println("Content: "+content);
    }

    @Override
    public String getContent() {
        return content;
    }
     
    // implementing Calculable interface's methods
    @Override
    public double calculateSize() {
        // Size = number of words * size per word (in KB)
        return countWords() * sizePerWord;
    }
    @Override
    public int countWords() {
        if(content == null || content.trim().isEmpty()) {
            return 0;
        }
        return content.trim().split("\\s+").length; // split content by white-spaces(\\s+) to count words
    }

    public String getTitle() {
        return title;
    }
}

public class Qsn_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter document title: ");
        String title = input.nextLine();
        System.out.println("Enter document contents;");
        String content = input.nextLine();
        System.out.print("Enter size per word(in KB, eg: 0.01): ");
        double size = input.nextDouble();

        Document document = new Document(title, content, size);

        System.out.println("\n Using printable interface,");
        document.print();
        System.out.println("Document retrived: "+document.getContent());

        System.out.println("\n Using Calculable interface,");
        System.out.printf("Document size: %.2f KB%n",document.calculateSize());
        System.out.println("Number of words: "+document.countWords());
        
        input.close();
    }
}
