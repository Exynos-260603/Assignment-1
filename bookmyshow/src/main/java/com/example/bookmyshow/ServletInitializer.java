@SpringBootApplication
public class BmsbookmyshowApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BmsbookmyshowApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BmsbookmyshowApplication.class);
    }
}
