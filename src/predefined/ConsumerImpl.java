package predefined;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String string) {
        System.out.println("Hello "+string);
    }

    public String upperCase(String word){
        return word.toUpperCase();
    }

}
