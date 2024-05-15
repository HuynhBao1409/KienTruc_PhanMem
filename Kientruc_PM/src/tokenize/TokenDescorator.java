package tokenize;

public abstract class TokenDescorator implements Tokenize{
    Tokenize tokens;
     public TokenDescorator(Tokenize tokens){
         this.tokens = tokens;
     }
}
