package neoe.ne.util;

import java.lang.Character.UnicodeBlock;
import java.util.*;

public class CharClsfy {

    private static final Set<UnicodeBlock> CJK_BLOCKS = new HashSet<>(Arrays.asList(
        Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS,
        Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
        Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
        Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C,
        Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D,
        Character.UnicodeBlock.CJK_COMPATIBILITY,
        Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS,
        Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS,
        Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT,
        Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT,
        Character.UnicodeBlock.CJK_STROKES,
        Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION,
        Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS,
        Character.UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
        Character.UnicodeBlock.KANGXI_RADICALS,
        Character.UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS
    ));

    public static boolean isCjk(String s, int index) {
        int codePoint = Character.codePointAt(s, index);
        return CJK_BLOCKS.contains(Character.UnicodeBlock.of(codePoint));
    }

    public static boolean containsCjk(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isCjk(s, i)) {
                return true;
            }
        }
        return false;
    }
}
