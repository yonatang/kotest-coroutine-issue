import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

internal class FooTest {

    @Test
    fun fooTest(){
        runBlocking {
        println(Foo.greetAsync("world").await())
        }
    }
}