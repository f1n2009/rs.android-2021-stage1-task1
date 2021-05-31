package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //find bad elements
        for (i in 1 .. sadArray.size-2)
        {
            var n = 1
            var x = i
            while (sadArray[x] >= (sadArray[x-1]+sadArray[i+n])){
                //println(sadArray[i])
                sadArray[x] = -1
                //x -= 1
                //n += 1
            }
            x=i
            n=1
        }
        //println("Sorted array: ${sadArray.contentToString()}")

        //find size new array
        var sizeNewArray = 0
        sadArray.forEach {
            if (it>=0)
                sizeNewArray++
        }

        //create new array
        val happyArray = IntArray(sizeNewArray) {0}
        var k=0

        sadArray.forEach {
            if (it>=0){
                happyArray[k] = it
                k++}
        }
        return happyArray

        throw NotImplementedError("Not implemented")
    }
}
