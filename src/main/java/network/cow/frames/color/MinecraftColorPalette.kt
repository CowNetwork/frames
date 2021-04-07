package network.cow.frames.color

import java.awt.Color

// WARNING: the code that follows will make you cry; a safety pig is provided below for your benefit.
//
//  _._ _..._ .-',     _.._(`))
// '-. `     '  /-._.-'    ',/
//    )         \            '.
//   / _    _    |             \
//  |  a    a    /              |
//  \   .-.                     ;
//   '-('' ).-'       ,'       ;
//      '-;           |      .'
//         \           \    /
//         | 7  .__  _.-\   \
//         | |  |  ``/  /`  /
//        /,_|  |   /,_/   /
//           /,_/      '`-'

/**
 * Contains all colors minecraft supports for maps.
 *
 * @author Benedikt Wüller
*/
class MinecraftColorPalette : PaletteColorTransformer(
    Color(0, true), Color(0, true), Color(0, true), Color(0, true),
    Color(89, 125, 39), Color(109, 153, 48), Color(127, 178, 56), Color(67, 94, 29),
    Color(174, 164, 115), Color(213, 201, 140), Color(247, 233, 163), Color(130, 123, 86),
    Color(140, 140, 140), Color(171, 171, 171), Color(199, 199, 199), Color(105, 105, 105),
    Color(180, 0, 0), Color(220, 0, 0), Color(255, 0, 0), Color(135, 0, 0),
    Color(112, 112, 180), Color(138, 138, 220), Color(160, 160, 255), Color(84, 84, 135),
    Color(117, 117, 117), Color(144, 144, 144), Color(167, 167, 167), Color(88, 88, 88),
    Color(0, 87, 0), Color(0, 106, 0), Color(0, 124, 0), Color(0, 65, 0),
    Color(180, 180, 180), Color(220, 220, 220), Color(255, 255, 255), Color(135, 135, 135),
    Color(115, 118, 129), Color(141, 144, 158), Color(164, 168, 184), Color(86, 88, 97),
    Color(106, 76, 54), Color(130, 94, 66), Color(151, 109, 77), Color(79, 57, 40),
    Color(79, 79, 79), Color(96, 96, 96), Color(112, 112, 112), Color(59, 59, 59),
    Color(45, 45, 180), Color(55, 55, 220), Color(64, 64, 255), Color(33, 33, 135),
    Color(100, 84, 50), Color(123, 102, 62), Color(143, 119, 72), Color(75, 63, 38),
    Color(180, 177, 172), Color(220, 217, 211), Color(255, 252, 245), Color(135, 133, 129),
    Color(152, 89, 36), Color(186, 109, 44), Color(216, 127, 51), Color(114, 67, 27),
    Color(125, 53, 152), Color(153, 65, 186), Color(178, 76, 216), Color(94, 40, 114),
    Color(72, 108, 152), Color(88, 132, 186), Color(102, 153, 216), Color(54, 81, 114),
    Color(161, 161, 36), Color(197, 197, 44), Color(229, 229, 51), Color(121, 121, 27),
    Color(89, 144, 17), Color(109, 176, 21), Color(127, 204, 25), Color(67, 108, 13),
    Color(170, 89, 116), Color(208, 109, 142), Color(242, 127, 165), Color(128, 67, 87),
    Color(53, 53, 53), Color(65, 65, 65), Color(76, 76, 76), Color(40, 40, 40),
    Color(108, 108, 108), Color(132, 132, 132), Color(153, 153, 153), Color(81, 81, 81),
    Color(53, 89, 108), Color(65, 109, 132), Color(76, 127, 153), Color(40, 67, 81),
    Color(89, 44, 125), Color(109, 54, 153), Color(127, 63, 178), Color(67, 33, 94),
    Color(36, 53, 125), Color(44, 65, 153), Color(51, 76, 178), Color(27, 40, 94),
    Color(72, 53, 36), Color(88, 65, 44), Color(102, 76, 51), Color(54, 40, 27),
    Color(72, 89, 36), Color(88, 109, 44), Color(102, 127, 51), Color(54, 67, 27),
    Color(108, 36, 36), Color(132, 44, 44), Color(153, 51, 51), Color(81, 27, 27),
    Color(17, 17, 17), Color(21, 21, 21), Color(25, 25, 25), Color(13, 13, 13),
    Color(176, 168, 54), Color(215, 205, 66), Color(250, 238, 77), Color(132, 126, 40),
    Color(64, 154, 150), Color(79, 188, 183), Color(92, 219, 213), Color(48, 115, 112),
    Color(52, 90, 180), Color(63, 110, 220), Color(74, 128, 255), Color(39, 67, 135),
    Color(0, 153, 40), Color(0, 187, 50), Color(0, 217, 58), Color(0, 114, 30),
    Color(91, 60, 34), Color(111, 74, 42), Color(129, 86, 49), Color(68, 45, 25),
    Color(79, 1, 0), Color(96, 1, 0), Color(112, 2, 0), Color(59, 1, 0),
    Color(147, 124, 113), Color(180, 152, 138), Color(209, 177, 161), Color(110, 93, 85),
    Color(112, 57, 25), Color(137, 70, 31), Color(159, 82, 36), Color(84, 43, 19),
    Color(105, 61, 76), Color(128, 75, 93), Color(149, 87, 108), Color(78, 46, 57),
    Color(79, 76, 97), Color(96, 93, 119), Color(112, 108, 138), Color(59, 57, 73),
    Color(131, 93, 25), Color(160, 114, 31), Color(186, 133, 36), Color(98, 70, 19),
    Color(72, 82, 37), Color(88, 100, 45), Color(103, 117, 53), Color(54, 61, 28),
    Color(112, 54, 55), Color(138, 66, 67), Color(160, 77, 78), Color(84, 40, 41),
    Color(40, 28, 24), Color(49, 35, 30), Color(57, 41, 35), Color(30, 21, 18),
    Color(95, 75, 69), Color(116, 92, 84), Color(135, 107, 98), Color(71, 56, 51),
    Color(61, 64, 64), Color(75, 79, 79), Color(87, 92, 92), Color(46, 48, 48),
    Color(86, 51, 62), Color(105, 62, 75), Color(122, 73, 88), Color(64, 38, 46),
    Color(53, 43, 64), Color(65, 53, 79), Color(76, 62, 92), Color(40, 32, 48),
    Color(53, 35, 24), Color(65, 43, 30), Color(76, 50, 35), Color(40, 26, 18),
    Color(53, 57, 29), Color(65, 70, 36), Color(76, 82, 42), Color(40, 43, 22),
    Color(100, 42, 32), Color(122, 51, 39), Color(142, 60, 46), Color(75, 31, 24),
    Color(26, 15, 11), Color(31, 18, 13), Color(37, 22, 16), Color(19, 11, 8),
    Color(133, 33, 34), Color(163, 41, 42), Color(189, 48, 49), Color(100, 25, 25),
    Color(104, 44, 68), Color(127, 54, 83), Color(148, 63, 97), Color(78, 33, 51),
    Color(64, 17, 20), Color(79, 21, 25), Color(92, 25, 29), Color(48, 13, 15),
    Color(15, 88, 94), Color(18, 108, 115), Color(22, 126, 134), Color(11, 66, 70),
    Color(40, 100, 98), Color(50, 122, 120), Color(58, 142, 140), Color(30, 75, 74),
    Color(60, 31, 43), Color(74, 37, 53), Color(86, 44, 62), Color(45, 23, 32),
    Color(14, 127, 93), Color(17, 155, 114), Color(20, 180, 133), Color(10, 95, 70)
) {

    override fun matchColor(color: Color): Color {
        // If alpha is below 255, just draw fully transparent pixels.
        if (color.alpha < 255) this.colors.first()
        return super.matchColor(color)
    }

}
