import java.util.ArrayList;

public class Handler {
    ArrayList<Character> list = new ArrayList<Character>();

    public ArrayList<Character> work(Double num) {

        char[] chars = workStringToCharMas(num);
        int count = 0;
        if (existChComa(chars)) {
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == '0') {
                    count++;
                }
                else if (chars[i] == '.' || chars[i] == ','){
                    count++;
                    break;
            }else if (chars[i] != '0') break;
        }
    }
        for(
    int i = 0;
    i<chars.length - count;i++)

    {
        list.add(chars[i]);
    }
        return list;
}


    public char[] workStringToCharMas(Double num) {
        String str = num.toString();
        char[] chars = str.toCharArray();
        return chars;
    }

    private boolean existChComa(char[] chars) {
        for (Character s : chars) {
            if (s == ',' || s == '.') {
                return true;
            }
        }
        return false;
    }
}

