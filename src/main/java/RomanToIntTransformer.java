public class RomanToIntTransformer {

    private static int convertToValue(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }

    private static boolean needsSubtraction(char a, char b) {
        if (convertToValue(a) > convertToValue(b)) {
            return false;
        }

        switch (a) {
        case 'I':
            if (b == 'V' || b == 'X')
                return true;
            break;
        case 'X':
            if (b == 'L' || b == 'C')
                return true;
            break;
        case 'C':
            if (b == 'D' || b == 'M')
                return true;
            break;
        default:
            return false;
        }

        return false;
    }

    public static int parse(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length()-1 && needsSubtraction(s.charAt(i), s.charAt(i+1))) {
                sum -= convertToValue(s.charAt(i));
            } else {
                sum += convertToValue(s.charAt(i));
            }
        }

        return sum;
    }



}


