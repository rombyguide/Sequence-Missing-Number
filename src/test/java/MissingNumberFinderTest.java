import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberFinderTest {

    @Test
    public void testMissingNumberInSequence() {
        int[] input1 = {5, 0, 1, 3, 2};
        int[] input2 = {7, 9, 10, 11, 12};

        int result1 = MissingNumberFinder.findMissingNumber(input1);
        int result2 = MissingNumberFinder.findMissingNumber(input2);

        // Assert: Возвращает ли функция ожидаемые пропущенные числа
        assertEquals(4, result1); // Ожидаемое пропущенное число: 4
        assertEquals(8, result2); // Ожидаемое пропущенное число: 8
    }

    @Test
    public void testEmptyArray() {
        // Arrange: Пустой массив
        int[] emptyArray = {};

        // Act: Вызов функции для пустого массива
        int result = MissingNumberFinder.findMissingNumber(emptyArray);

        // Assert: Возвращает ли функция -1 для пустого массива
        assertEquals(-1, result);
    }

    @Test
    public void testNoMissingNumber() {
        // Arrange: Подготовка массива без пропущенных чисел
        int[] noMissingNumber = {1, 2, 3, 4, 5};

        // Act: Вызов функции для массива без пропущенных чисел
        int result = MissingNumberFinder.findMissingNumber(noMissingNumber);

        // Assert: Возвращает ли функция -1, если нет пропущенных чисел
        assertEquals(-1, result);
    }

    @Test
    public void testSingleMissingNumber() {
        // Arrange: Подготовка массива с одним пропущенным числом
        int[] singleMissingNumber = {0, 1, 2, 4, 5};

        // Act: Вызов функции для поиска пропущенного числа
        int result = MissingNumberFinder.findMissingNumber(singleMissingNumber);

        // Assert: Корректно ли функция определяет пропущенное число
        assertEquals(3, result); // Ожидаемое пропущенное число: 3
    }
}
