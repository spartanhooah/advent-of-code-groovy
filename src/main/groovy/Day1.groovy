def elves = [:]
def currentFood = 0
def currentElf = 0

new File('src/main/resources/input/day-1-small.txt').eachLine { line ->
    if (line.isBlank()) {
        elves[currentElf++] = currentFood
        currentFood = 0
    } else {
        currentFood += line.toInteger()
    }
}

print elves