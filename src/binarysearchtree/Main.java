package binarysearchtree;

import java.text.NumberFormat;
import java.time.Duration;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.util.Locale.US;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSPreOrder());
        System.out.println(myBST.DFSPostOrder());
        System.out.println(myBST.DFSInOrder());

        Duration hours = Duration.of(6, HOURS);

        System.out.println(hours.toHours());

        NumberFormat format = NumberFormat.getCurrencyInstance(US);
        System.out.println(format.format(35.00));
    }
}
