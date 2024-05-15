package tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends  TokenDescorator{
    List<String> stopwords;
    public RemoveStopWord(Tokenize tokens){
        super(tokens);
        stopwords = new ArrayList<>(Arrays.asList("thì","là","mà","nhưng","bị","cái","được","và"));
    }

    @Override
    public List<String> tokenize() {
        List<String> result = tokens.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}
