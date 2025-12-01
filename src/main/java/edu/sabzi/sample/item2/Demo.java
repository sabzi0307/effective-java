package edu.sabzi.sample.item2;


public class Demo {
    public static void main(String[] args) {

        NutritionFacts coke = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(coke);

        UserProfile profile = new UserProfile.Builder("john_doe", "john@example.com")
                .age(30)
                .bio("Senior Java Developer")
                .newsletter(true)
                .build();

        System.out.println(profile);

        HttpRequest request = new HttpRequest.Builder("https://api.example.com/users")
                .method("POST")
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"John\" }")
                .build();

        System.out.println(request);
    }
}
