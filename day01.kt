import java.io.File


fun main(args: Array<String>) {
    var total = 0
    File("day01_input.txt").forEachLine() { total += fuelCounter(it.toInt()) };
    println(total)
}

fun fuelCounter(mass: Int): Int {
    var baseFuel =  mass / 3 - 2;
    var moreFuel = fuelMassCounter(baseFuel);
    return baseFuel + moreFuel;
}

fun fuelMassCounter(mass:Int): Int {
    var tmp = ((mass / 3) - 2)
    if (tmp < 0) {
        return 0;
    } else {
        tmp += fuelMassCounter(tmp)
        return tmp;
    }
}