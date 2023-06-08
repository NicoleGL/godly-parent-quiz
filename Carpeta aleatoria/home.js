const array=[1,"a", 2, "a", 2, "a"];

function findMostRepeats (arr) {
    let maxCounter = 0;
    let max;
    for(el of arr) {
        if(numOfRepeats(arr, el) > maxCounter) {
            maxCounter = numOfRepeats(arr, el);
            max = el;
       }
    }
    return max;
}

function numOfRepeats (array, key) {
    let counter = 0;
    for(element of array) {
        if(element === key){
            counter++;
        }
    }
    return counter;
}