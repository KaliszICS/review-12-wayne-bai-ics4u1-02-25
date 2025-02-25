import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void countWordsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countWords", cArg);
  // Enter code here

    assertEquals(2, (int)method.invoke(null, "Hello World", 'l'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countWordsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countWords", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, "Hello World", 'o'));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countWordsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countWords", cArg);
  // Enter code here

    assertEquals(8, (int)method.invoke(null, "a a a a a a a a", 'a'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countWordsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countWords", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "Hello World", 'i'));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countwordsTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countWords", cArg);
  // Enter code here

    assertEquals(0, (int)method.invoke(null, "", '9'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void getAgeTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { String[].class,  int[].class, String.class};
        Method method = testClass.getDeclaredMethod("getAge", cArg);
  // Enter code here
    assertEquals(16, (int)method.invoke(null, new String[]{"Brian", "Alan", "Rachel"}, new int[]{16, 50, 23}, "Brian"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void getAgeTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { String[].class,  int[].class, String.class};
        Method method = testClass.getDeclaredMethod("getAge", cArg);
  // Enter code here

    assertEquals(24, (int)method.invoke(null, new String[]{"Rachel"}, new int[]{24}, "Rachel"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void getAgeTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { String[].class,  int[].class, String.class};
        Method method = testClass.getDeclaredMethod("getAge", cArg);
  // Enter code here

    assertEquals(50, (int)method.invoke(null, new String[]{"Brian", "Alan", "Rachel", "Blake"}, new int[]{16, 50, 23, 11}, "Alan"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here

    assertEquals(true, (boolean)method.invoke(null, "bob"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "was it a car or a cat i saw"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "never odd or even"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "Bob"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "RaCeCaR"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, "help"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest9() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
  assertEquals(false, (boolean)method.invoke(null, "rncrrecr"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest8() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
  assertEquals(false, (boolean)method.invoke(null, "wassup"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest10() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
  assertEquals(false, (boolean)method.invoke(null, "true"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void palindromeTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, "rats live on no evil stars"));

}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
