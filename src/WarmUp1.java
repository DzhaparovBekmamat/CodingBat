public class WarmUp1 {
    public static void main(String[] args) {
    }

    //Warmup-1
    /*
    1)endUp("Hello")->"HeLLO"
    endUp("hi there")->"hi thERE"
    endUp("hi")->"HI"
             */
    public String endUp(String string) {
        if (string.length() <= 3) {
            return string.toUpperCase();
            int cut = string.length() - 3;
            String front = string.substring(0, cut);
            String back = string.substring(cut);
            return front + back.toUpperCase();
        }
    }

    ////////////////////////////////////////////////
    /*
    2)max1020(11,19)->19
    max1020(19,11)->19
    max1020(11,9)->11
     */
    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    /////////////////////////////////////
    /*
    3)intMax(1,2,3)->3
    intMax(1,3,2)->3
    intMax(3,2,1)->3
     */
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
        //Math.max(x,y)
    }

    /////////////////////////////////////////
    /*
    4)delDel("adelbc")->"abc"
    delDel("adelHello")->"aHello"
    delDel("adedbc")->"adedbc"
     */
    public String delDel(String string) {
        if (string.length() >= 4 && string.substring(1, 4).equals("del")) {
            return string.substring(0, 1) + string.substring(4);
        }
        return string;
    }

    ////////////////////////////////////////////////////////////////////////
    /*
    5)in1020(12,99)->true
    in1020(21,12)->true
    in1020(8,99)->false
     */
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    //////////////////////////////////////////////////////////
    /*
    6)front22("kitten")->"kikittenki"
    front22("Ha")->"HaHaHa"
    front22("abc")->"abcabcabc"
     */
    public String front22(String string) {
        int take = 2;
        if (take > string.length()) {
            take = string.length();
        }
        String front = string.substring(0, take);
        return front = front + string + front;
    }

    /////////////////////////////////////////////
    /*
    7)front3("Java")->"JavJavJav"
    front3("Chocolate")->"ChoChoCho"
    front3("abc")->"
     */
    public String front3(String string) {
        String front;
        if (string.length() >= 3) {
            front = string.substring(0, 3);
        } else {
            front = string;
        }
        return front + front + front;
    }

    /////////////////////////////////////
    /*
    8)notString("candy")->"not candy"
    notString("x")->"not x"
    notString("not bad")->"not bad"
     */
    public String notString(String string) {
        if (string.length() >= 3 && string.substring(0, 3).equals("not")) {
            return string;
        }
        return "not" + string;
    }

    ////////////////////////////////////////////////////////////////////////
    /*
    9)makes10(9,10)->true
    makes10(9,9)->false
    makes10(1,9)->true
     */
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    ///////////////////////////////////////////////
    /*
    10)sumDouble(1,2)->3
    sumDouble(3,2)->5
    sumDouble(2,2)->8
     */
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    /////////////////////////////////////
    /*
    11)lastDigit(7,17)->true
    lastDigit(6,17)->false
    lastDigit(3,113)->true
     */
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    ////////////////////////////////////////
    /*
    12)in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
     */
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    ///////////////////////////////////////////////////
    /*
    13)startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
    charAt() используется для получения символа (char) в строке по заданному индексу (позиции)
     */
    public String start0z(String string) {
        String result = " ";
        if (string.length() >= 1 && string.charAt(0) == 'o') {
            result = result + string.charAt(0);
        }
        if (string.length() >= 2 && string.charAt(1) == 'z') {
            result = result + string.charAt(1);
        }
        return result;
    }

    ///////////////////////////////////////////////////////////
    /*
    14)loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
     */
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    //////////////////////////////////////////////////
    /*
    15)icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
     */
    public boolean iceHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 < 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    ///////////////////////////////////////////////////////////////////
    /*
    16)or35(3) → true
    or35(10) → true
    or35(8) → false
     */
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    //////////////////////////////
    /*
    17)frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public String frontBack(String string) {
        if (string.length() <= 1) {
            return string;
        }
        String middle = string.substring(1, string.length() - 1);
        return string.charAt(string.length() - 1) + middle + string.charAt(0);
    }

    /*
    18)posNeg(1,-1,false)->false
    posNeg(-1,1,false)->false
    posNeg(-4,-5,true)->false
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    /*
    19)parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    /*
    20)monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    /*
    20)everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
     */
    public String everyNth(String string, int a) {
        String result = " ";
        for (int i = 0; i < string.length(); i++) {
            result = result + string.charAt(i);
        }
        return result;
    }

    /*
    21)stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */
    public boolean stringE(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    /*
    22)close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
     */
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10); //Math.abs - это метод, который возвращает абсолютное значение числа.
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    /*
    23)mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
     */
    public boolean mixStart(String string) {
        if (string.length() < 3) {
            return false;
        }
        String two = string.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    /*
    24)hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
     */
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    /*
    25)startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
     */
    public boolean startHi(String string) {
        if (string.length() < 2) {
            return false;
        }
        String firstTwo = string.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    /*
    26)backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    public String backAround(String string) {
        String front = string.substring(string.length() - 1);
        return front + string + front;
    }

    /*
    27)missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
     */
    public String missingChar(String string, int n) {
        String front = string.substring(0, n);
        String back = string.substring(n + 1, string.length());
        return front + back;
    }

    /*
    28)nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
     */
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    /*
    29)diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    /*
    30)sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && vacation) {
            return true;
        }
        return false;
    }
}


