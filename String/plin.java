class plin {

    public static void check(String s) {

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("The String is not palindrome");
                return;
            }
        }

        System.out.println("The String is palindrome");
    }

    public static void main(String[] args) {
        check("racecar");
    }
}
