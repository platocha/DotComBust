import java.util.ArrayList;

public class DotComTestDrive {
    public static void main (String[] args) {

        ArrayList<String> locations = new ArrayList<String>();
        locations.add("a1");
        locations.add("a2");
        locations.add("a3");

        DotCom dot = new DotCom();
        dot.setName("test.com");

        dot.setLocationCells(locations);

        String userGuess = "a1";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);

        userGuess = "a4";
        result = dot.checkYourself(userGuess);
        testResult = "failed";
        if (result.equals("miss")) {
            testResult = "passed";
        }

        System.out.println(testResult);

        userGuess = "a2";
        result = dot.checkYourself(userGuess);
        userGuess = "a3";
        result = dot.checkYourself(userGuess);
        testResult = "failed";
        if (result.equals("kill")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
