/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        int maxWidth = 2 * height + 1;
        
        int spacesForStar = maxWidth / 2;
        System.out.println(" ".repeat(spacesForStar) + "*");
        
        for (int i = 1; i <= height; i++) {
            int spaces = height - i;
            int stars = 2 * i + 1;
            
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
        
        int spacesForTrunk = height - 1;
        System.out.println(" ".repeat(spacesForTrunk) + "|||");
    }
}
