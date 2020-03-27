/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.alternatingcharacters;

/**
 *
 * @author AbdElHalim
 */
public class CharacterManipulator {

    public static void main(String[] args) {
        int result = alternatingCharacters("AAABAABA");
        System.out.println(result);
    }

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
