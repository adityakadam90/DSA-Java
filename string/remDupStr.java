public class remDupStr {

    public static String rmDup(String str) {
        String cpy = "";

        for (int i = 0; i < str.length(); i++) {

            boolean found = false;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                cpy = cpy + str.charAt(i);
            }
        }

        return cpy;
    }

    public static void main(String[] args) {
        String name = "adityad";

        System.out.println(rmDup(name));
    }
}