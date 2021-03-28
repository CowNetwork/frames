package network.cow.frames.resource.font

import java.awt.Font

/**
 * @author Benedikt Wüller
 */
interface FontAdapter {

    /**
     * @return the font [name] of size [size].
     */
    fun get(name: String, size: Float): Font

}
