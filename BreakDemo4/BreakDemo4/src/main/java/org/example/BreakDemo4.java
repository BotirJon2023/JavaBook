package org.example;

public class BreakDemo4 {
    public static void main(String args[]) {

        int i;

        for (i = 1; i < 4; i++) {
            {
                {
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break; //----- Переход по метке
                        if (i == 2) break;
                        if (i == 3) break;
// Эта строка кода никогда не будет достигнута
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
            System.out.println("После цикла for");
        }
    }
}
