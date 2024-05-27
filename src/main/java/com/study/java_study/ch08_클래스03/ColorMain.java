package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
            문제.
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CA84BA, Brandied Apricot
            #FFBE98, Peach Fuzz
            #946F4C, Marsala
            #A78c7B, Almondine
            #DBC8BD, Almond peach
            생상 데이터를 저장 한 후에 for문을 사용하여
            배열에 들어있는 모든 색상 정보를 printInfo()로 호출하여 출력한다.
            이후에 모든 code 와 name의 값을 null로 바꾸어 다시 출력한다.
            이때 null로 바꿀때에는 반복문을 사용한다.

         */

        Color[] colors = new Color[5];

        colors[0] = new Color("#CA84BA", "Brandied Apricot");
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#946F4C", "Marsala");
        colors[3] = new Color("#A78c7B", "Almondine");
        colors[4] = new Color("#DBC8BD", "Almond peach");

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == null) {
                continue;
            }
            colors[i].printInfo();
        }
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == null) {
               continue;

            }
            colors[i].setName(null);
            colors[i].setCode(null);
        }
        for (Color color : colors) {
            color.printInfo();
        }


    }
}
