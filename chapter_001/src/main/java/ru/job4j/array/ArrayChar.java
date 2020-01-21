package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        if (word.length < pref.length) {
            return false;
        }
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean endsWith(char[] word, char[] post) {
        if (word.length < post.length) {
            return false;
        }
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - post.length + index] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

}
