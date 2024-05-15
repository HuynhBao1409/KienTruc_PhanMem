package tokenize;

import java.util.List;

public class RemovePunc extends TokenDescorator{
    public RemovePunc(Tokenize tokens){
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokens.tokenize();
        list.replaceAll(s -> {  return s.replaceAll("\\p{Punct}","");
        });
        return list;
    }
}
