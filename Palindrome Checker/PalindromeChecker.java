public class PalindromeChecker {

    public boolean checker(String em) {
        StringBuilder reversedEm = new StringBuilder();

        char[] stringsList = em.toCharArray();

        // Start from em.length() - 1, and go down to 0
        for (int i = em.length() - 1; i >= 0; i--) {
            reversedEm.append(stringsList[i]);
        }

        // Compare the content of strings using .equals() method
        return reversedEm.toString().equals(em);
    }
}