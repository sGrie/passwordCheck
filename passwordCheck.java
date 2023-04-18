import java.util.Scanner;

class passwordcheck{

    static boolean lengthCheck(char[] s){
        if(s.length < 8 || s.length > 16){
            return false;
        }else{
            return true;
        }
    }

    static boolean lower(char[] s){
        for(int i = 0; i < s.length; ++i){
            if(Character.isLowerCase( s[i] )){
                return true;
            }
        }
        return false;
    }

    static boolean upper(char[] s){
        for(int i = 0; i < s.length; ++i){
            if(Character.isUpperCase( s[i] )){
                return true;
            }
        }
        return false;
    }

    static boolean special(char[] s){
        String x = "~!@#$%^&*()-=+_";
        char[] spec = x.toCharArray();

        for(int i = 0; i < s.length; ++i){
            for(int j = 0; j < spec.length; ++j){
                if(s[i] == spec[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean num(char[] s){
        for(int i = 0; i < s.length; ++i){
            if(Character.isDigit( s[i] )){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String check = "asdfasdfaR2";
        boolean x = true;
        boolean y = true;

        char[] test = check.toCharArray();

        if(lengthCheck(test)){
            if(val(lower(test)) + val(upper(test)) + val(num(test)) + val(special(test)) == 3){
                System.out.println("password good");
            } else {
                System.out.println("password bad");
            }
        }else{
            System.out.println("password bad");
        }

    }

    private static int val(boolean x) {
        if(x){
            return 1;
        }else{
            return 0;
        }
    }
}