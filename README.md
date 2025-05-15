# blackpink

```java
import java.util.Random;

public class RandomNumberExample {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        int randomNumber = getRandomNumber(1, 100);
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}
```

networksetup -setairportpower en0 off