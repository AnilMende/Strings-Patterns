public class ReverseString {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverse(s));
    }

    //String is converted into char Array
    //Because Strings are immutable and so we can not perform swapping on them
    //to overcome that we converted String into the char Array
    //We are starting the one pointer at the start of the array
    //another pointer at the end of the array
    //and swapping them

    static String reverse(String s){

        int i = 0;
        int j = s.length() - 1;

        char ch[] = s.toCharArray();

        while(i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        return new String(ch);
    }
}
