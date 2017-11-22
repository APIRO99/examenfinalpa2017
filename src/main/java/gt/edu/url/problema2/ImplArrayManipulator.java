package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator {

    @Override
    public int subsets(List set) {
        E tmp;
        int n = set.size();
        // If a new permutation has been found then print it
        if (n == 1) {
            // Print out the found permutation
            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.get(i));
            }
            System.out.println();
        } else {	// If a new permutation has not yet been found
            for (int i = 0; i < (n - 1); i++) {
                subsets(set);
                if (n % 2 == 0) {
                    // Swap entry i with entry n-1
                    tmp = (E) set.get(i);
                    set.set(i, set.get(n - 1));
                    set.set(n - 1, tmp);
                } else {
                    // Swap entry 0 with entry n-1
                    tmp = (E) set.get(0);
                    set.set(0 ,set.get(n - 1));
                    set.set(n-1 , tmp);
                }
            }
            subsets(set);
        }
        return 0;
    }
}