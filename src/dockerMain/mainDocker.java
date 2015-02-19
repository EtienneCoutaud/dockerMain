package dockerMain;

import static spark.Spark.get;

public class mainDocker {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "hello from sparkjava.com";
        });
    }
}
