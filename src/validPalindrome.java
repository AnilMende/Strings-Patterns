import java.time.temporal.ChronoField;

public class validPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //System.out.println(characterCheck(s));
        System.out.println(palindrome(s));
    }

    static boolean palindrome(String s){

        //Converting String to Lowercase by removing
        //non-alphabet characters
        //This will take the extra space
        //s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        //s = characterCheck(s);
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){

            //skip non-alphanumeric characters
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else{
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    //Forming a string by excluding the alphanumberic chracters
    //and converting the entire string to lowercase
    static String characterCheck(String s){
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.toString();
    }
}
