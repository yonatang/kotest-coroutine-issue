import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

object Foo {
    fun greet(name: String) = "Hello $name!"

    fun greetAsync(name: String) = GlobalScope.async { ::greet }
}