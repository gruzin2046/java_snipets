package _23_Exceptions;


public class Own_exception_handling {

    // because we want to throw own exception in case of crossing the limit
    // we need to add signature "throws LimitExceededException" after arguments
    static void addNumbersFromOneToLimitToArray(int[] ints, int limit) throws LimitExceededException {

        // we determine condition and if it's fulfilled we throw own exception
        if (limit > ints.length) throw new LimitExceededException("Limit exceeded: " + limit);
        for (int i = 0; i < limit; i++) {
            ints[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        int[] intContainer = new int[10];

        try {
            // in try block we call method which can throw LimitExceededException
            addNumbersFromOneToLimitToArray(intContainer, 10);
        } catch (LimitExceededException e) {
            // now we are handling LimitExceededException
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
