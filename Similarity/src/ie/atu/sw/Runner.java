package ie.atu.sw;


// This class initializes the menu and provides the command-line interface.
public class Runner {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.displayOptions();
    }

    public static void printProgress(int index, int total) {
        if (index > total) return;  //Out of range
        int size = 50;              //Must be less than console width
        char done = '█';            //Change to whatever you like.
        char todo = '░';            //Change to whatever you like.
       
        //Compute basic metrics for the meter
        int complete = (100 * index) / total;
        int completeLen = size * complete / 100;

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append((i < completeLen) ? done : todo);
        }

        System.out.print("\r" + sb + "] " + complete + "%");
       
        if (done == total) System.out.println("\n");
    }
}
