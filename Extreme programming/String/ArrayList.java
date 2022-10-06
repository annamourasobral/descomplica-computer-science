import java.util.Arrays;
import java.util.List;

public class ArrayList {
    List<String> objects = Arrays.asList("bottle","cup");
    {for(int tam = objects.size() -1; tam >=0 ; tam--){
        System.out.print(objects.get(tam)+",");
    }}
}
