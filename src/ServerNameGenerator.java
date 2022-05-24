public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"supreme", "cruel", "short",
                "handsomely", "elated", "wakeful", "tidy", "sturdy", "diligent", "yummy"};
        String[] nouns = {"paper", "freedom", "driver", "desk",
                "inspector", "product", "opportunity", "professor", "analysis", "ability", "cigarette", "performance"};
        String noun = randomWord(nouns);
        String adjective = randomWord(adjectives);
        System.out.println("Here is your server name:");
        System.out.println(adjective + "-" + noun);
//        Server Name Generator
//
//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and
//        follow the specs below.
//

//        String[] adjectives = {"supreme", "cruel", "short",
//                "handsomely", "elated", "wakeful", "tidy", "sturdy", "diligent", "yummy"};
//        String[] nouns = {"paper", "freedom", "driver", "desk",
//                "inspector", "product", "opportunity", "professor", "analysis", "ability", "cigarette", "performance"};
//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//                Create a method that will return a random element from an array of strings.
    }
    public static String randomWord(String[] wordsArr) {
        int rng = (int) Math.floor(Math.random() * wordsArr.length);
        return wordsArr[rng];
    }
//                Add a main method, and inside of your main method select and random noun and adjective and hyphenate
//                the combination and display the generated name to the user.
//                Example Output
//
//
//        Here is your server name:
//        dedicated-photon
//        Movie List
//
    }