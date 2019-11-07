import ru.textanalysis.tawt.ms.internal.sp.BearingPhraseSP;
import ru.textanalysis.tawt.sp.api.SyntaxParser;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SyntaxParser sp = new SyntaxParser();
        sp.init();
        List<BearingPhraseSP> phrase
                = sp.getTreeSentence("Стало ясно, что будет с российской валютой.");
        phrase.forEach(System.out::println);
    }
}
