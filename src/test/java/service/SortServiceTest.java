package service;

import logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new BubbleSort<>()); // 여기서 파라미터로 어떤 정렬을 쓸 것인지 고르면 된다

    @Test
    void test(){
        // Given


        // When
        List<String> actual = sut.doSort(List.of("3","2","1"));

        // Then
        assertEquals(List.of("1","2","3"), actual);
    }
}