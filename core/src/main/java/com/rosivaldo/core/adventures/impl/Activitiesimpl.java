import java.util.Random;
import com.adobe.aem.wknd.examples.core.adventures.Adventures.impl;
import com.adobe.aem.wknd.examples.core.adventures.Activities;
import org.osgi.service.component.annotations.Component;


@Component
public class ActivitiesImpl {


     private static final String[] ACTIVITIES = new String[]{
         "campig", "skiing", "skateboarding"
     };

     private final int randomIndex = new Random().nextInt(ACTIVITIES.length);

     public String getRandomActivity(){
        return ACTIVITIES[randomIndex]
     }

}