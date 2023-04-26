package methods.libraries;

import io.github.cdimascio.dotenv.Dotenv;

public class Environment {
    static Dotenv env;

    static {
        String envName = System.getProperty("env", "dev");
        env = Dotenv
                .configure()
                .filename(String.format(".env.%s", envName))
                .load();
    }

    public static String BASE_URL = env.get("BASE_URL");
    public static String TEST_PARAM = env.get("TEST_PARAM");
}
