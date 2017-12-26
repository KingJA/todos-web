import com.kingja.tood.TodosApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Description：TODO
 * Create Time：2017/12/26 14:24
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TodosApplication.class);
    }
}
