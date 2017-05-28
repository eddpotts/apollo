/**
 * NOTE: This file is a stub, intended only for use within an IDE.  It should be updated
 * each time [org.apollo.game.plugin.kotlin.KotlinPluginScript] has a new method added to it.
 *
 * Until IntelliJ IDEA starts to support ScriptTemplateDefinitions this is
 * required to resolve references within plugin code.
 */

import org.apollo.game.model.World
import org.apollo.game.plugin.PluginContext
import org.apollo.game.plugin.kotlin.*
import org.apollo.net.message.Message
import kotlin.reflect.KClass

val world: World = null!!
var context: PluginContext = null!!

fun <T : Message> on(type: () -> KClass<T>): KotlinMessageHandler<T> {
    null!!
}

fun start(callback: () -> Unit) {

}

fun stop(callback: () -> Unit) {

}