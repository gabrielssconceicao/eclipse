public class App {
    public static void main(String[] args) throws Exception {
        String original = "   abcd EFGH IJKL mNoP qRsT uVwX yZ  ABCd  AbCd ABC Abc      ";

        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String trim = original.trim();

        String subStr = original.trim().substring(2);
        String subStr2 = original.trim().substring(2, 9);

        String replaceStr = original.replace('A', 'X');
        String replaceStr2 = original.replace(' ', '*');
        String replaceStr3 = original.replace("ABC", "Y_Y");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String[] vect = original.split(" ");

        System.out.printf("Original: -%s-\n", original);

        System.out.printf("toLowerCase: -%s-\n", lower);
        System.out.printf("toUpperCase: -%s-\n", upper);
        System.out.printf("trim: -%s-\n", trim);

        System.out.printf("SubString: -%s-\n", subStr);
        System.out.printf("SubString: -%s-\n", subStr2);

        System.out.printf("Replace: -%s-\n", replaceStr);
        System.out.printf("Replace: -%s-\n", replaceStr2);
        System.out.printf("Replace: -%s-\n", replaceStr3);

        System.out.printf("IndexOf bc: -%d-\n", i);
        System.out.printf("LastIndexOf bc: -%d-\n", j);

        for (String s : vect) {
            System.out.printf("Split: -%s-\n", s);
        }
    }
}
